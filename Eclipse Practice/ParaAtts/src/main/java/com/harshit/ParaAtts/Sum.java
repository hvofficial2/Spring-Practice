package com.harshit.ParaAtts;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Sum extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException {
		double n1 = Double.parseDouble(req.getParameter("number1"));
		double n2 = Double.parseDouble(req.getParameter("number2"));
		double s = n1+n2;
		req.setAttribute("sum",s);
		RequestDispatcher rd = req.getRequestDispatcher("product");
		rd.forward(req, res);
	}
}
