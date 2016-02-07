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
        <script>
            function formValidation() {
                var eml = document.forms["loginCustomer"].email.value;
                var psw = document.forms["loginCustomer"].password.value;

                if (empty(eml, "Fill email address field")) {
                    document.getElementById('email').focus();
                    document.getElementById("email").style.cssText = "box-shadow: 0 0 20px red;"
                    return false;
                } else if (emailValidator(eml, "Invalid email address")) {
                    document.getElementById('email').focus();
                    document.getElementById("email").style.cssText = "box-shadow: 0 0 20px red;"
                    return false;
                } else if (empty(psw, "Fill password field")) {
                    document.getElementById('password').focus();
                    document.getElementById("password").style.cssText = "box-shadow: 0 0 20px red;"
                    return false;
                } else if (lengthRestriction(psw, "Fill password field")) {
                    document.getElementById('password').focus();
                    document.getElementById("password").style.cssText = "box-shadow: 0 0 20px red;"
                    return false;
                }
            }
            //check if input is empty              
            function empty(input, msg) {
                if (input === null || input === "") {
                    alert(msg);
                    return true;
                } else {
                    document.getElementById("email").style.cssText = "box-shadow: 0 0 20px none;"
                    document.getElementById("password").style.cssText = "box-shadow: 0 0 20px none;"
                    return false;
                }
            }

            function emailValidator(input, msg) {
                var emailExp = /^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/;
                if (emailExp.test(input)) {
                    document.getElementById("email").style.cssText = "box-shadow: 0 0 20px none;"
                    document.getElementById("password").style.cssText = "box-shadow: 0 0 20px none;"
                    return false;
                } else {
                    alert(msg);
                    return true;
                }
            }

            function lengthRestriction(input) {
                var lnt = input.length;
                if (lnt < 4 || lnt > 16) {
                    alert(" Your password must be between 4 and 16 characters");
                    return true;
                } else {
                    document.getElementById("email").style.cssText = "box-shadow: 0 0 20px none;"
                    document.getElementById("password").style.cssText = "box-shadow: 0 0 20px none;"
                    return false;
                }

            }
        </script>
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
            <div class="content">
                <form name="loginCustomer" id="formValidation" onsubmit="return formValidation()" action="UserActionServlet" method="post">
                    <table align="center" id="top1" >                
                        <tr><td> E-mail  : </td><td style="padding-bottom:10px"> <input name="email" size=30 type="text" id="email"/> </td></tr>
                        <tr><td> Password  : </td><td style="padding-bottom:10px"> <input name="password" size=30 type="password" id="password"/> </td></tr>
                    </table>
                    <p>  
                        <input type="hidden" name="action" value="login" />
                        <input type="submit" value="login" class="myButtonMovieDetails1"/>
                    </p>
                </form>
            </div>

        </div>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js"></script>
    </body>
</html>
