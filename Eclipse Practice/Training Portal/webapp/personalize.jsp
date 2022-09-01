<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Personalize</title>
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
<div class="container">
<form action="success" method="post">
	<h5>Please Enter your Favorite Language&nbsp;:</h5>
				<select name="favLang">
					<option value="JAVA">Java</option>
					<option value="Python">Python</option>
					<option value="C">C</option>
					<option value="Ruby">Ruby</option>
				</select>
<button type="submit">Submit</button>
</form>
</div>
<%@include file="footer.jsp" %>
</body>
</html>