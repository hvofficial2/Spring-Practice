<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Training Portal Home</title>
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
<%! String favLang="Java"; %>
<%
	Cookie[] cookies = request.getCookies();
	if(cookies!=null){
		for(Cookie c: cookies){
			if(c.getName().equals("MyApp.favLang")){
				favLang=c.getValue();
			}
		}
	}
%>
<div class="container">
<h4>New Books for&nbsp;<%= favLang %></h4>
<ul>
	<li>bla bla bla</li>
	<li>bla bla bla</li>
	<li>bla bla bla</li>
</ul>
</div>
<hr>
<div class="container">
<h4>Latest News Reports for&nbsp;<%= favLang %></h4>
<ul>
	<li>bla bla bla</li>
	<li>bla bla bla</li>
	<li>bla bla bla</li>
</ul>
</div>
<hr>
<div class="container">
<h4>Hot Jobs for&nbsp;<%= favLang %></h4>
<ul>
	<li>bla bla bla</li>
	<li>bla bla bla</li>
	<li>bla bla bla</li>
</ul>
</div>
<hr>
<div class="container">
<a href="personalize">Personalize this page</a>
</div>

<%@include file="footer.jsp" %>
</body>
</html>