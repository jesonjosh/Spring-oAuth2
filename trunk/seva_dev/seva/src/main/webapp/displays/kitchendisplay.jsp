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
  

  <title>Smart Restaurant - Kitchen</title>

  <jsp:include page="../bootstrap_header.jsp" />
  

</head>

<%
    int fontSize = 2;
    int titleFontSize = 3;
    int finishedOrder = 10; 
    int itemCount = 15;
%>

<body class="nav-md" style="height: 1024px;">

  <div class="container body bg-success" >


    <div class="main_container " >
                
      <!-- page content -->
      <div class="main_content" role="main">
          
          <div class="col-md-2 col-sm-2 col-xs-12">
              
              
          
              <div class="row">
                    <h4>Order Completion</h4>
                    <canvas width="300" height="80" id="foo" class="" style="width: 160px; height: 100px; align-content: center" ></canvas>
                    <div class="goal-wrapper center">
                      <span class="gauge-value pull-left"></span>
                      <span id="gauge-text" class="gauge-value pull-left"><%=finishedOrder%></span>
                      <span id="goal-text" class="goal-value pull-right"><%=itemCount%></span>
                    </div>
                  </div>
                    <div class="clearfix"></div>
                    <div class="row">
                    <div class="animated flipInY col-md-12 col-sm-12 col-xs-12 tile_stats_count">
                        <div class="left"></div>
                        <div class="right">
                            <span class="count_top"><i class="fa fa-clock-o"></i> <strong>Average Preparation Time</strong></span>
                          <div class="count">20 minutes</div>
                        </div>
                      </div>
                  </div>
                <div class="row">
                    <div id="images"></div>
                </div>
            </div>
                    
                <script>
                    function getOrders() {
                        console.log('Calling getOrders');
                        $( "#currentOrder" ).empty();
                      var flickerAPI = "http://localhost:8080/seva/api/menu?access_token=<%=session.getAttribute("accessToken")%>";
                      $.getJSON( flickerAPI, {
                        format: "json"
                      })
                        .done(function( datas ) {
                          $.each( datas, function( i, data ) {
                              console.log(data.item_name);
                            $( "<tr />" ).append(" <td /> ").append(data.item_name).appendTo( "#currentOrder" );
                          });
                        });
                    };
                    setInterval('getOrders()', 5000);
                </script>

                    
        <div class="col-md-10 col-sm-10 col-xs-12">
        <div class="">
          <div class="page-title">
            <div class="title_left">
              <h3>Smart Restaurant - Orders</h3>
            </div>
          </div>
          <div class="clearfix"></div>

            <div style="height: 1024px; overflow: scroll">
                        
                      <!-- price element -->
                      <div class="col-md-12 col-sm-12 col-xs-12" >
                        <div class="pricing ui-ribbon-container">
                            <div class="ui-ribbon-wrapper">
                            <div class="ui-ribbon bg-orange">
                              VIP
                            </div>
                          </div>
                          <div class="title">
                            <h3>Table 1</h3>
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
                                          <tbody id="currentOrder">
                                              <tr><td colspan="4"><hr/></td></tr>
                                          <tr>
                                              <td width="10%"><font size="+<%=fontSize%>" >1</font></td><td width="45%"><font size="+<%=fontSize%>" ><strong>Idly</strong></font></td><td width="15%"><font size="+<%=fontSize%>" ><strong>1 set</strong></font></td><td width="30%"><font size="+<%=fontSize%>" ></font></td>
                                          </tr>
                                          <tr>
                                              <td width="10%"><font size="+<%=fontSize%>" >2</font></td><td width="45%"><font size="+<%=fontSize%>" ><strong>Dosa</strong></font></td><td width="15%"><font size="+<%=fontSize%>" ><strong>1 set</strong></font></td><td width="30%"><font size="+<%=fontSize%>" ></font></td>
                                          </tr>
                                          <tr>
                                              <td width="10%"><font size="+<%=fontSize%>" >3</font></td><td width="45%"><font size="+<%=fontSize%>" ><strong>Puttu</strong></font></td><td width="15%"><font size="+<%=fontSize%>" ><strong>1 set</strong></font></td><td width="30%"><font size="+<%=fontSize%>" ></font></td>
                                          </tr>
                                          <tr>
                                              <td width="10%"><font size="+<%=fontSize%>" >4</font></td><td width="45%"><font size="+<%=fontSize%>" ><strong>Chicken Chilli</strong></font></td><td width="15%"><font size="+<%=fontSize%>" ><strong>1</strong></font></td><td width="30%"><font size="+<%=fontSize%>" >Spicy</font></td>
                                          </tr>
                                          <tr>
                                              <td width="10%"><font size="+<%=fontSize%>" >5</font></td><td width="45%"><font size="+<%=fontSize%>" ><strong>Idly</strong></font></td><td width="15%"><font size="+<%=fontSize%>" ><strong>1 set</strong></font></td><td width="30%"><font size="+<%=fontSize%>" ></font></td>
                                          </tr>
                                          <tr>
                                              <td width="10%"><font size="+<%=fontSize%>" >6</font></td><td width="45%"><font size="+<%=fontSize%>" ><strong>Dosa</strong></font></td><td width="15%"><font size="+<%=fontSize%>" ><strong>1 set</strong></font></td><td width="30%"><font size="+<%=fontSize%>" ></font></td>
                                          </tr>
                                          <tr>
                                              <td width="10%"><font size="+<%=fontSize%>" >7</font></td><td width="45%"><font size="+<%=fontSize%>" ><strong>Puttu</strong></font></td><td width="15%"><font size="+<%=fontSize%>" ><strong>1 set</strong></font></td><td width="30%"><font size="+<%=fontSize%>" ></font></td>
                                          </tr>
                                          <tr>
                                              <td width="10%"><font size="+<%=fontSize%>" >8</font></td><td width="45%"><font size="+<%=fontSize%>" ><strong>Idly</strong></font></td><td width="15%"><font size="+<%=fontSize%>" ><strong>1 set</strong></font></td><td width="30%"><font size="+<%=fontSize%>" ></font></td>
                                          </tr>
                                          <tr>
                                              <td width="10%"><font size="+<%=fontSize%>" >9</font></td><td width="45%"><font size="+<%=fontSize%>" ><strong>Dosa</strong></font></td><td width="15%"><font size="+<%=fontSize%>" ><strong>1 set</strong></font></td><td width="30%"><font size="+<%=fontSize%>" ></font></td>
                                          </tr>
                                          <tr>
                                              <td width="10%"><font size="+<%=fontSize%>" >10</font></td><td width="45%"><font size="+<%=fontSize%>" ><strong>Puttu</strong></font></td><td width="15%"><font size="+<%=fontSize%>" ><strong>1 set</strong></font></td><td width="30%"><font size="+<%=fontSize%>" ></font></td>
                                          </tr>
                                          <tr>
                                              <td width="10%"><font size="+<%=fontSize%>" >11</font></td><td width="45%"><font size="+<%=fontSize%>" ><strong>Idly</strong></font></td><td width="15%"><font size="+<%=fontSize%>" ><strong>1 set</strong></font></td><td width="30%"><font size="+<%=fontSize%>" ></font></td>
                                          </tr>
                                          <tr>
                                              <td width="10%"><font size="+<%=fontSize%>" >12</font></td><td width="45%"><font size="+<%=fontSize%>" ><strong>Dosa</strong></font></td><td width="15%"><font size="+<%=fontSize%>" ><strong>1 set</strong></font></td><td width="30%"><font size="+<%=fontSize%>" ></font></td>
                                          </tr>
                                          <tr>
                                              <td width="10%"><font size="+<%=fontSize%>" >13</font></td><td width="45%"><font size="+<%=fontSize%>" ><strong>Puttu</strong></font></td><td width="15%"><font size="+<%=fontSize%>" ><strong>1 set</strong></font></td><td width="30%"><font size="+<%=fontSize%>" ></font></td>
                                          </tr>
                                          <tr>
                                              <td width="10%"><font size="+<%=fontSize%>" >14</font></td><td width="45%"><font size="+<%=fontSize%>" ><strong>Idly</strong></font></td><td width="15%"><font size="+<%=fontSize%>" ><strong>1 set</strong></font></td><td width="30%"><font size="+<%=fontSize%>" ></font></td>
                                          </tr>
                                          <tr>
                                              <td width="10%"><font size="+<%=fontSize%>" >15</font></td><td width="45%"><font size="+<%=fontSize%>" ><strong>Dosa</strong></font></td><td width="15%"><font size="+<%=fontSize%>" ><strong>1 set</strong></font></td><td width="30%"><font size="+<%=fontSize%>" ></font></td>
                                          </tr>
                                          <tr>
                                              <td width="10%"><font size="+<%=fontSize%>" >16</font></td><td width="45%"><font size="+<%=fontSize%>" ><strong>Puttu</strong></font></td><td width="15%"><font size="+<%=fontSize%>" ><strong>1 set</strong></font></td><td width="30%"><font size="+<%=fontSize%>" ></font></td>
                                          </tr>
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
