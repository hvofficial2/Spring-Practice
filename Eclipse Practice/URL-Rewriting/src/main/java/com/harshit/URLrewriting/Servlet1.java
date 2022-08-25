package com.harshit.URLrewriting;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) 
	throws IOException, ServletException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		out.println("<h1>Hi "+name+", Welcome to the first servlet of this website! </h2>");
		out.println("<h1><a href=\"servlet2?name="+name+"\">Click here</a> to go to the servlet2.</h1>");
	}
}
