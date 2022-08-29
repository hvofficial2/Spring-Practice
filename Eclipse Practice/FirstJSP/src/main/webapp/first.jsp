<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hi this is declarative tag example:</h1>
	<%!
		int a = 20;
		int b = 30;
		public int doSum(){
			return a+b;
		}
	%>
	<h2>This is the sum of <%= a %> and <%= b %> : <%= doSum() %></h2>
	<h2><a href="second.jsp">Click here</a> to go to Directives page.</h2>
</body>
</html>