package com.harshit.CookieProb;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("user_name");
		out.println("<h1>Hi "+name+", Welcome to my website with Cookie Problem.</h1>");
		out.println("<h2>This is servlet one output</h2>");
		
		out.println("<h2><a href=\"servlet2\">Click here</a> to go to the second servlet</h2>");
	}
}
