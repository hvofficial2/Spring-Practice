package com.sms.web.jdbc;

import jakarta.annotation.Resource;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import javax.sql.DataSource;

public class StudentController extends HttpServlet {
	
	private StudentDbUtil studentDbUtil;
	
	@Resource(name="jdbc/web_student")
	private DataSource dataSource;
	
	public void init() throws ServletException{
		try {
			studentDbUtil = new StudentDbUtil(dataSource);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 String command = req.getParameter("command");
		 if(command==null)
			 command = "LIST";
		switch(command) {
		case "LIST":listStudents(req,res);
					break;
		case "ADD":addStudent(req,res);
					break;
		case "LOAD":loadStudent(req,res);
					break;
		case "UPDATE":updateStudent(req,res);
					break;
		case "DELETE":deleteStudent(req,res);
					break;
		default:listStudents(req,res);
		}
	}

	private void deleteStudent(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int id = Integer.parseInt(req.getParameter("id"));
		Student s = studentDbUtil.getStudent(id);
		studentDbUtil.deleteStudent(s);
		listStudents(req, res);
	}

	private void updateStudent(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		studentDbUtil.updateStudent(new Student(Integer.parseInt(req.getParameter("studentid")),req.getParameter("firstName"),
				req.getParameter("lastName"),
				req.getParameter("email")));
		listStudents(req, res);
	}

	private void loadStudent(HttpServletRequest req, HttpServletResponse res) {
		int id = Integer.parseInt(req.getParameter("id"));
		Student s = studentDbUtil.getStudent(id);
		req.setAttribute("student", s);
		RequestDispatcher rd = req.getRequestDispatcher("UpdateStudent");
		try {
			rd.forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void addStudent(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		studentDbUtil.addStudent(new Student(req.getParameter("firstName"),
								req.getParameter("lastName"),
								req.getParameter("email")));
		listStudents(req, res);
	}

	private void listStudents(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		// Step-1 Get the data from Student Util class
				List<Student> students = studentDbUtil.getStudents(); 
				
				// Step-2 Add student data to request object
				req.setAttribute("students", students);
				
				// Step-3 get Request dispatcher
				RequestDispatcher rd = req.getRequestDispatcher("student_view.jsp");
				
				// Step-4 Forward RD to JSP (View part)
				rd.forward(req, res);
	}

}
