package com.harshit.URLrewriting;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) 
	throws IOException, ServletException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		out.println("<h1>Hi "+name+", Welcome to the second servlet of this website! </h1>");
	}
}
