# Spring-oAuth2
A simple Maven build RESTful application with Spring and oAuth2 token enabled provided Stateless session handling and authentication/ authorizatiom manager

To build you need to have following application ready. <br></br>
JAVA<br></br>
MySQL Community Server<br></br>
Eclipse <br></br>
Maven <br></br>

I have taken a restaurent solution as example and datalayer is completely structured. Run the script to create all tables 

# APIs
Steps for the authentication and authorization APIs<br/><br/>
1. Login API:
You may find the authentication configuration in Spring-security.xml
Client ID and cleint secret are hard coded. We can make it dynamic with a custom cleint user class.
<br/>
<a href="http://localhost:8080/seva/oauth/token?grant_type=password&client_id=hotelparagon&client_secret=hotelparagon&username=123&password=1111">http://localhost:8080/seva/oauth/token?grant_type=password&client_id=hotelparagon&client_secret=hotelparagon&username=123&password=1111</a>  <br/><br/>

2. Login response with token and expiry details. The expiry time can be configured in Spring-security.xml file.
{
"access_token": "22cb0d50-5bb9-463d-8c4a-8ddd680f553f",
"token_type": "bearer",
"refresh_token": "7ac7940a-d29d-4a4c-9a47-25a2167c8c49",
"expires_in": 119
}

3. We access protected resources by passing this access token as a parameter, the request goes something like this:<br/><br/>
<a href="http://localhost:8080/seva/api/menu/?access_token=8c191a0f-ebe8-42cb-bc18-8e80f2c4238e">http://localhost:8080/seva/api/menu/?access_token=8c191a0f-ebe8-42cb-bc18-8e80f2c4238e</a><br />
Here http://localhost:8080/seva is the server path, and  /api/menu/
Is an API  URL that returns a list of menu items and is being protected to be accessed.
<br/><br/>
4) If the token is not expired and is a valid token, the requested resources will be returned.<br/><br/>
5) In case the token is expired, user needs to get a new token using its refreshing token that was accepted in step(2). A new access token request after expiration looks something like this:<br/>
<a href="http://localhost:8080/seva/oauth/token?grant_type=refresh_token&client_id=hotelparagon&client_secret=hotelparagon&refresh_token=7ac7940a-d29d-4a4c-9a47-25a2167c8c49">http://localhost:8080/seva/oauth/token?grant_type=refresh_token&client_id=hotelparagon&client_secret=hotelparagon&refresh_token=7ac7940a-d29d-4a4c-9a47-25a2167c8c49</a><br/><br/>
And you will get a new access token along with a new refresh token.
