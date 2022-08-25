package com.harshit.CookieProb;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) 
			throws ServletException, IOException{
		processRequest(req, res);
	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) 
			throws ServletException, IOException{
		processRequest(req, res);
	}
	
	public void processRequest(HttpServletRequest req,HttpServletResponse res) 
	throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("user_name");
		
		out.println("<h1>Hi "+name+", This is servlet2 of my website.</h1>");
	}
}
