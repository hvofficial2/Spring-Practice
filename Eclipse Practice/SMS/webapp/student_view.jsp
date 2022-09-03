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
<h4><b>
<input type="button" value="Add Student" onclick="window.location.href='AddStudent.jsp'">
</b></h4>
<div class="card">
<table class="table">
	<tr>
		<th>Id</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
		<th>Action</th>
	</tr>
	<!-- request.getAttribute("students") -->
	<c:forEach var="student" items="${students}">
		<c:url var="templink" value="StudentController">
			<c:param name="command" value="LOAD"/>
			<c:param name="id" value="${student.getId()}"/>
		</c:url>
		<c:url var="templink2" value="StudentController">
			<c:param name="command" value="DELETE"/>
			<c:param name="id" value="${student.getId()}"/>
		</c:url>
		<tr>
		<td>${student.getId()}</td>
		<td>${student.getFirstName()}</td>
		<td>${student.getLastName()}</td>
		<td>${student.getEmail()}</td>
		<td>
			<a href="${templink}">Update</a> | 
			<a href="${templink2}" onclick="if(!(confirm('Are you sure you want to delete this student?'))) return false">Delete</a>
		</td>
		</tr>
	</c:forEach>
</table>
</div>
</div>

<%@include file="footer.jsp" %>
</body>
</html>