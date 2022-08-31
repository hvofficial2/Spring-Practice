<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import = "java.util.Random,java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="includeDir.jsp" %>
<h1>This page is for examples of directive tags:</h1>
	<%
		Random r = new Random();
		int a = r.nextInt(10);
	%>
	<h2>This is random number generated	: <%= a%></h2>
	<h2>Date and time from util			: <%= new Date().toString()%></h2>
</body>
</html>