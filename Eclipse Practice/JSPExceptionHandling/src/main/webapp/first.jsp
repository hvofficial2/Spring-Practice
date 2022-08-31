<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page errorPage="errorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Exception Handling</title>
</head>
<body>
<h1>Hi this is JSP Exception Handling example:</h1>
	<%!
		int a = 20;
		int b = 0;
		public int doDiv(){
			return a/b;
		}
	%>
	<h2>This is the sum of <%= a %> and <%= b %> : <%= doDiv() %></h2>
</body>
</html>