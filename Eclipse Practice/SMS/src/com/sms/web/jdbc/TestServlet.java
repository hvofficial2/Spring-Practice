package com.sms.web.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.sql.DataSource;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
			
	//DataSource/ConnectionPool for Resource Injection
	@Resource(name="jdbc/web_student")
	private DataSource dataSource;
			
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws IOException,ServletException{
		processRequest(req,res);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws IOException,ServletException{
		processRequest(req,res);
	} 

	public void processRequest(HttpServletRequest req, HttpServletResponse res) 
			throws IOException,ServletException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		
		Connection con = null;
		Statement stmt = null;
		ResultSet set = null;
		
		try {
			con = dataSource.getConnection();
			String s = "select * from student";
			stmt = con.createStatement();
			set = stmt.executeQuery(s);
			while(set.next()) {
				String str = set.getString(2);
				out.println(str+"</br>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} 

}
