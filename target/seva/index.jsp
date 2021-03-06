<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.URL"%>
<%@page import="org.json.simple.JSONValue"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.parser.ParseException"%>

<!-- 
    Document   : index
    Created on : May 1, 2016, 2:04:49 PM
    Author     : pcseg330
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Meta, title, CSS, favicons, etc. -->
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <title>Smart Restaurant</title>

  <jsp:include page="bootstrap_header.jsp" />

</head>

<body class="nav-md">
    
    <%
        try{
            URL loginURL = new URL("http://localhost:8080/seva/oauth/token?grant_type=password&client_id=hotelparagon&client_secret=hotelparagon&username=123&password=1111");
            BufferedReader in = new BufferedReader(
            new InputStreamReader(loginURL.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null)
                try{
                    JSONObject accessToken = (JSONObject)JSONValue.parseWithException(inputLine);
                    session.setAttribute("accessToken", accessToken.get("access_token"));
                }catch(ParseException pe){
                   System.out.println("position: " + pe.getPosition());
                   System.out.println(pe);
                }
            
            
                in.close();
            }catch(Exception ex){}
    %>
    
  <div class="container body" >


    <div class="main_container " >
                
        
      <!-- page content -->
      <div class="main_content" role="main">
          
          <div class="page-title">
            <div class="title_left">
              <h3>Smart Restaurant</h3>
            </div>
        </div>
        
        <div class="row">
            <a href="displays/kitchendisplay.jsp">
                <div class="animated flipInY col-lg-2 col-md-2 col-sm-2 col-xs-12">
                    <div class="tile-stats">

                      <div class="icon"><i class="fa fa-caret-square-o-right"></i>
                          <span class="badge bg-orange">3</span>
                      </div>
                      <div class="count">179</div>

                      <h3>Orders</h3>
                      <p>Average Waiting Time : 20 minutes</p>
                    </div>
                </div>
            </a>

            <a href="displays/display2.jsp">
                <div class="animated flipInY col-lg-2 col-md-2 col-sm-2 col-xs-12">
                    <div class="tile-stats">

                      <div class="icon"><i class="fa fa-caret-square-o-right"></i>
                          <span class="badge bg-orange">3</span>
                      </div>
                      <div class="count">179</div>

                      <h3>Orders</h3>
                      <p>Average Waiting Time : 20 minutes</p>
                    </div>
                </div>
            </a>

            <a href="displays/display3.jsp">
                <div class="animated flipInY col-lg-2 col-md-2 col-sm-2 col-xs-12">
                    <div class="tile-stats">

                      <div class="icon"><i class="fa fa-caret-square-o-right"></i>
                          <span class="badge bg-orange">3</span>
                      </div>
                      <div class="count">179</div>

                      <h3>Orders</h3>
                      <p>Average Waiting Time : 20 minutes</p>
                    </div>
                </div>
            </a>
        </div>

        <div class="row">
            <a href="displays/display4.jsp">
                <div class="animated flipInY col-lg-2 col-md-2 col-sm-2 col-xs-12">
                    <div class="tile-stats">

                      <div class="icon"><i class="fa fa-caret-square-o-right"></i>
                      </div>
                      <div class="count">Cashier</div>
                      <h3>Sign In</h3>
                      <p>Last Login Time : <%= new java.util.Date() %></p>
                    </div>
                </div>
            </a>
        </div>
        
    </div>
                    
    </div>
  </div>

  <jsp:include page="bootstrap_footer.jsp" />

</body>

</html>