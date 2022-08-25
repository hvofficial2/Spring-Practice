package com.harshit.CookieSol;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
		processRequest(req, res);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
		processRequest(req, res);
	}
	public void processRequest(HttpServletRequest req, HttpServletResponse res) 
	throws IOException, ServletException{
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		
		String name = req.getParameter("user_name");
		out.println("<h1>Hi "+name+", Welcome to my website with Cookie Solution.</h1>");
		out.println("<h2>This is servlet one output</h2>");
		Cookie c = new Cookie("name", name);
		res.addCookie(c);
		out.println("<h2><a href=\"servlet2\">Click here</a> to go to the second servlet</h2>");
	}
}
