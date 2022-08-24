package com.harshit.Form;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class RegisterServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h2>Welcome to Register Servlet</h2>");
		String name = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		String email = req.getParameter("user_email");
		String gender = req.getParameter("user_gender");
		String course = req.getParameter("user_course");
		
		String condition = req.getParameter("condition");
		if(condition!=null && condition.equals("checked")) {
			out.println("<h2> Name :"+name+"</h2>");
			out.println("<h2> Password :"+password+"</h2>");
			out.println("<h2> Email :"+email+"</h2>");
			out.println("<h2> Gender :"+gender+"</h2>");
			out.println("<h2> Coruse :"+course+"</h2>");
			out.println();
			out.println("Data Saved");
			RequestDispatcher rd = req.getRequestDispatcher("RegisterSuccess"); 
			rd.forward(req,resp);
//			rd.include(req,resp);
//			out.println("Forwared!");
			
		}
		else {
			out.println("<h2>You have not accepted terms and conditions</h2>");
			RequestDispatcher rd = req.getRequestDispatcher("index2.html");
			rd.include(req,resp);
			out.println("Included");
		}
	}
}
