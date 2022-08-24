package com.harshit.ParaAtts;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Product extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) 
	throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		double n1 = Double.parseDouble(req.getParameter("number1"));
		double n2 = Double.parseDouble(req.getParameter("number2"));
		double pro = n1*n2;
		double s = (double)req.getAttribute("sum");
		out.println("<h1>SUM of : "+n1+" and "+n2+"	: "+s+"</h2>");
		out.println("<h1>Product of : "+n1+" and "+n2+"	: "+pro+"</h2>");
	} 
}
