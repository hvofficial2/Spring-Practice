<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ToDoList</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>
<div class="jumbotron"><center><h1>ToDoList App</h1></center></div>
	<div class="container">
	<form  action="index" method="post">
		<b>Add new item:</b>
			<input type="text" name="newItem" placeholder="Enter new item here">
			<button type="submit">Submit</button>
	</form>
	</div>
	
	<%
		List<String> items = (List<String>) session.getAttribute("myToDoList");
		if(items==null){
			items = new ArrayList<String>();
			session.setAttribute("myToDoList",items);
		}
		
		String newItem = request.getParameter("newItem");
		if(newItem!=null&&!newItem.trim().equals(""))
			items.add(newItem);
	%>
	<hr>
	
	<div class="container">
	<ol>
			<% 
				if(items!=null)
					for(String s:items) 
						out.println("<li>"+s+"</li>");
			%>
	</ol>
	</div>
		
<%@include file="footer.jsp" %>
</body>
</html>