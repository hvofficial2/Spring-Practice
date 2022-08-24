package com.harshit.Form;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterSuccess extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>Registration Successful!</h1>");
	}
}
