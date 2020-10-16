<%@ page import="MyHello.Compute"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Displaying User Details-show</title>
</head>
<body>
<%

String username= (String) pageContext.getAttribute("UName", PageContext.SESSION_SCOPE);
String userpassword= (String) pageContext.getAttribute("UPassword", PageContext.SESSION_SCOPE);
out.println("Hi "+username);
out.println("Your Password is: "+userpassword);
out.print("<h1>");
Compute c = new Compute();
out.println(c.print());
out.print("</h1>");
%>
</body>
</html>