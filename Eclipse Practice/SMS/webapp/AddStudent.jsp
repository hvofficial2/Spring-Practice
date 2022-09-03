<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student Details</title>
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
<h3>Add Student</h3>
<form class="card" action="StudentController" method="GET">
	<input type="hidden" name="command" value="ADD">
	<table class="table">
		<tr>
			<td><b>First Name</b></td>
			<td><input type="text" name="firstName" placeholder="Enter first name"></td>
		</tr>
		<tr>
			<td><b>Last Name</b></td>
			<td><input type="text" name="lastName" placeholder="Enter last name"></td>
		</tr>
		<tr>
			<td><b>Email</b></td>
			<td><input type="text" name="email" placeholder="Enter email"></td>
		</tr>
		<tr>
			<td></td>
			<td><button type="submit">Save</button> &nbsp;&nbsp; <button type="reset">Reset</button></td>
		</tr>
	</table>
</form>

<a href="StudentController">Go Back to Student List</a>
</div>

<%@include file="footer.jsp" %>
</body>
</html>