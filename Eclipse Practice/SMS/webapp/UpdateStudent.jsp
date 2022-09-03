<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student Details</title>
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
<h3>Update Student</h3>
<form class="card" action="StudentController" method="GET">
	<input type="hidden" name="command" value="UPDATE">
	<input type="hidden" name="studentid" value="${student.getId()}">
	<table class="table">
		<tr>
			<td><b>First Name</b></td>
			<td><input type="text" name="firstName" value="${student.getFirstName()} "></td>
		</tr>
		<tr>
			<td><b>Last Name</b></td>
			<td><input type="text" name="lastName" value="${student.getLastName()}"></td>
		</tr>
		<tr>
			<td><b>Email</b></td>
			<td><input type="text" name="email" value="${student.getEmail()}"></td>
		</tr>
		<tr>
			<td></td>
			<td><button type="submit">Save</button></td>
		</tr>
	</table>
</form>

<a href="StudentController">Go Back to Student List</a>
</div>

<%@include file="footer.jsp" %>
</body>
</html>