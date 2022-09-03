<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<style>
.jumbotron {
  padding-top: 35px !important;
  padding-bottom: 35px !important;
}
</style>
</head>
<body>
<%@include file="header.jsp" %>

<div class= "container">
<table class="table">
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
	</tr>
	<!-- request.getAttribute("students") -->
	<c:forEach var="student" items="${students}">
		<tr>
		<td>${student.getFirstName()}</td>
		<td>${student.getLastName()}</td>
		<td>${student.getEmail()}</td>
		</tr>
	</c:forEach>
</table>
</div>

<%@include file="footer.jsp" %>
</body>
</html>