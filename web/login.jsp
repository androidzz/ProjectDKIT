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
        <title>Login Page</title>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="keywords" content="css3, transitions, menu, blur, navigation, typography, font, letters, text-shadow" />
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="css/home.css" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <link href='http://fonts.googleapis.com/css?family=Josefin+Slab' rel='stylesheet' type='text/css' />
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,400,300,600" rel="stylesheet" type="text/css">

    </head>
    <body>
        <%
            User c = (User) session.getAttribute("user");
        %>
        <div class="container">
            <div class="header">
                <%  if (c != null) {
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
            <div class="contentMeniu">
                <ul class="bmenu1">
                    <li><a href="#">About</a></li>
                    <li><a href="#">Categories</a></li>
                    <li><a href="#">Deals</a></li>
                    <li><a href="#">Blog</a></li>
                    <li><a href="#">Contact</a></li>
                </ul>
            </div>
            <section id="loginBox">
                <h2 id="h2Login">Login</h2>
                <form name="loginCustomer" id="formValidation" method="post" action="UserActionServlet" class="minimal">
                    <label for="username">
                        <p id="pLogin">Email:</p>
                        <input type="text" name="email" id="email" placeholder="Example@gmail.com" pattern="([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})" required="required" />
                    </label>
                    <label for="password">
                        <p id="pLogin">Password:</p>
                        <input type="password" name="password" id="password" placeholder="Password must contain 1 uppercase, lowercase and number" pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$" required="required"/>
                    </label>
                    <input type="hidden" name="action" value="login" />
                    <button type="submit" value="login" class="btn-minimal">Sign in</button>
                </form>
            </section>

        </div>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js"></script>
    </body>
</html>
