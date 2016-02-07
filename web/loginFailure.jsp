<%-- 
    Document   : about
    Created on : Feb 7, 2016, 3:21:20 PM
    Author     : Lorenas Orleckas
--%>
<%@page import="Business.User"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Login Failure Page</title>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="keywords" content="css3, transitions, menu, blur, navigation, typography, font, letters, text-shadow" />
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="css/home.css" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <link href='http://fonts.googleapis.com/css?family=Josefin+Slab' rel='stylesheet' type='text/css' />
    </head>
    <body>
        <%
            User c = (User) session.getAttribute("user");
        %>

        <div class="container">
            <div class="header">
                <%                        
                    if (c != null) {
                %> 
                <a href="#">
                    <strong>Welcome: </strong> <%=c.getFirstName()%>
                </a>
                <% }%>
                <span class="right">
                    <%
                        if (c == null) {
                    %> 
                    <a href="#">Register</a>
                    <a href="login.jsp"><strong>Login</strong></a>
                    <%} else {%>
                    <a href="logout.jsp">Logout</a>
                    <% }%>
                    <a href="#">Cart ( 0 )</a>
                </span>
                <div class="clr"></div>
            </div>

            <h1>LVA <span>Movies</span></h1>
            <div class="content">
                <h1>...Try Again...</h1>
                <a href="login.jsp">Return to Login page...</a>
            </div>           
        </div>
                    
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js"></script>
    </body>
</html>