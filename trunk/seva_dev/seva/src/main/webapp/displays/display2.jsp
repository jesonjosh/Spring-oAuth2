<%-- 
    Document   : index
    Created on : May 1, 2016, 9:08:37 AM
    Author     : pcseg330
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Meta, title, CSS, favicons, etc. -->
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv="refresh" content="10">

  <title>Smart Restaurant</title>

   <jsp:include page="../bootstrap_header.jsp" />

</head>

<%
    int fontSize = 1;
    int titleFontSize = 1;
    int finishedOrder = 10; 
    int itemCount = 15;
%>

<body class="nav-md" style="height: 1024px;">

  <div class="container body bg-success" >


    <div class="main_container " >
                
      <!-- page content -->
      <div class="main_content" role="main">
          
          <script>
                function getOrders() {
                    console.log('Calling getOrders');
                  var accessURL = "http://localhost:8080/seva/api/ticket?access_token=<%=session.getAttribute("accessToken")%>";
                  var j = 0;
                  $.getJSON( accessURL, {
                    format: "json"
                  })
                    .done(function( datas ) {
                      $.each( datas, function( i, data ) {
                          $( "#currentOrder"+j ).empty();
                            j++;
                        $( "<tr />" )
                                .append( "<td width=\"10%\"><font size=+2>" + (i + 1) + "</font></td><td><font size=+2><strong>" + data.item_name + "</strong></font></td><td><font size=+2>" + data.item_quantity + "</font></td>")
                                .appendTo( "#currentOrder"+j );
                      });
                    });
                };
                getOrders();
                setInterval('getOrders()', 10000);
            </script>
          
        <div class="col-md-12 col-sm-12 col-xs-12">
        <div class="">
          <div class="page-title">
            <div class="title_left">
              <h3>Smart Restaurant - Orders</h3>
            </div>
          </div>
          <div class="clearfix"></div>
            <div>
                
                <%
                    for (int i=1;i<=20;i++) {
                    %>
                    <!-- price element -->
                      <div class="col-md-4 col-sm-6 col-xs-12" >
                        <div class="pricing ui-ribbon-container">
                            <div class="ui-ribbon-wrapper">
                            <div class="ui-ribbon bg-orange">
                              VIP
                            </div>
                          </div>
                          <div class="title">
                            <h3>Table <%=i%></h3>
                            <h4>Waiter 1</h4>
                            <div class="pull-left">
                                <%= new java.util.Date() %>
                            </div>
                          </div>
                          <div class="x_content" >
                              <div class="pricing_features">
                                  <div class="table table-bordered table-striped" >
                                      <table width="100%"  >
                                          <thead>
                                          <th><font size="+<%=titleFontSize%>" >No</font></th>
                                          <th><font size="+<%=titleFontSize%>" >Item</font></th>
                                          <th><font size="+<%=titleFontSize%>" >Quantity</font></th>
                                          <th><font size="+<%=titleFontSize%>" >Specifications</font></th>
                                          </thead>
                                          <tbody id="currentOrder<%=i%>" >

                                          </tbody>
                                      </table>
                                  </div>
                              </div>
                            <div class="pricing_footer">
                                <a href="javascript:void(0);" class="btn btn-success btn-block" role="button"><font size="+<%=fontSize%>" >START <span> now!</span></font></a>
                            </div>
                          </div>
                        </div>
                        <div class="clearfix"></div>
                     </div>
                      <!-- price element -->
                      <%
                          }
                        %>
                     
          </div>
        </div>
      <!-- /page content -->
        </div>
    </div>
  </div>
  </div>

  <div id="custom_notifications" class="custom-notifications dsp_none">
    <ul class="list-unstyled notifications clearfix" data-tabbed_notifications="notif-group">
    </ul>
    <div class="clearfix"></div>
    <div id="notif-group" class="tabbed_notifications"></div>
  </div>

  <jsp:include page="../bootstrap_footer.jsp" />

</body>

</html>
