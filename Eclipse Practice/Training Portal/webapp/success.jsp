<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Personalization Successful</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<style>
.jumbotron {
  padding-top: 35px !important;
  padding-bottom: 35px !important;
}
</style>
</head>
<body>
<%@include file = "header.jsp" %>

<% String favLang = request.getParameter("favLang"); %>
<h3>Thanks, we have set your favorite language to&nbsp;<%= favLang%></h3>
<a href="home">Return to Home Page</a>

<%
Cookie c = new Cookie("MyApp.favLang",favLang);
c.setMaxAge(60*60*24*365);
response.addCookie(c);
%>

<%@include file="footer.jsp" %>
</body>
</html>