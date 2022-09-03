<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*,com.jspDemo.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL</title>
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

<%
	List<Student> data = new ArrayList<>();
	data.add(new Student("John","Ball", false));
	data.add(new Student("Maxwell","Doe", false));
	data.add(new Student("Sim","Sim", true));
	pageContext.setAttribute("myStudents",data);
%>
<div class="container">
<table class="table">
<tr>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Gold Customer</th>
</tr>
<c:forEach var="s" items="${myStudents}">
	<tr>
		<td>${s.getFirstName()}</td>
		<td>${s.getLastName()}</td>
		<td>
		<!-- 
			<c:if test="${s.isGoldCustomer()}">
				Special Discount
			</c:if>
		 -->
		 
		 <c:choose>
		 	<c:when test="${s.isGoldCustomer()}">
		 		Special Discount
		 	</c:when>
		 	<c:otherwise>
		 		No Discounts
		 	</c:otherwise>
		 </c:choose>
		</td>
	</tr>
</c:forEach>
</table> 
</div>
<%@include file="footer.jsp" %>
</body>
</html>