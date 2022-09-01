<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>
<div class="jumbotron"><h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;STUDENT FORM - 1 INFO.</h1></div>
<div class="container">
	<table class="table">
		<tr>
			<td><b>The student is confirmed</b></td>
			<td><%= request.getParameter("firstName") %>&nbsp;&nbsp;<%= request.getParameter("lastName") %></td>
		</tr>
		<tr>
			<td><b>Gender</b></td>
			<td><%= request.getParameter("gender") %></td>
		</tr>
		<tr>
			<td><b>The student's country </b></td>
			<td><%= request.getParameter("country") %></td>
		</tr>
		<tr>
			<td><b>Student's Programming Language </b></td>
			<td>
			<%
				String[] lang = request.getParameterValues("plang");
				out.println(lang[0]);
				for(int i=1; i < lang.length ;i++)
					out.println(", "+lang[i]);
			%>
			</td>
		</tr>
	</table>
	
<h2>&nbsp;&nbsp;</h2>
</div>
<%@include file="footer.jsp"  %>
</body>
</html>