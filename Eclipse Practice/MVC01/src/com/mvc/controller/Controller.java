package com.mvc.controller;

import java.io.IOException;
import java.util.List;

import com.mvc.module.Student;
import com.mvc.module.StudentUtil;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws IOException,ServletException{
		processRequest(req,res);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws IOException,ServletException{
		processRequest(req,res);
	}
	
	public void processRequest(HttpServletRequest req, HttpServletResponse res) 
			throws IOException,ServletException{
		// Step-1 Get the data from Student Util class
		List<Student> students = StudentUtil.getStudentList(); 
		
		// Step-2 Add student data to request object
		req.setAttribute("students", students);
		
		// Step-3 get Request dispatcher
		RequestDispatcher rd = req.getRequestDispatcher("student_view.jsp");
		
		// Ste-4 Forward RD to JSP (View part)
		rd.forward(req, res);
	}
}