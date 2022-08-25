package com.harshit.CookieSol;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
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
		PrintWriter out = res.getWriter();
		
		String name="";
		boolean flag=false;
		
		Cookie[] cookies = req.getCookies();
		if(cookies==null)
		{
			out.println("<h1>You are a new user, please visit Home Page and enter your name!</h1>");
			out.println("<h2><a href=\"home.html\">Click here</a> to go to Home page.</h2>");
			return;
		}
		
		for (Cookie c : cookies) {
			if(c.getName().equals("name")) {
				flag=true;
				name=c.getValue();
				break;
			}
		}
		if(flag) 
			out.println("<h1>Hi "+name+", This is servlet2 of my website.</h1>");
		else {
			out.println("<h1>You are a new user, please visit Home Page and enter your name!</h1>");
			out.println("<h2><a href=\"home.html\">Click here</a> to go to Home page.</h2>");
		}
	}
}
