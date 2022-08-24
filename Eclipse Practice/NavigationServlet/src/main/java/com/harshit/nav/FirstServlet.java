package com.harshit.nav;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FirstServlet implements Servlet{
	ServletConfig config;
	
	public void init(ServletConfig c) {
		this.config = c;
	}
	
	public void service(ServletRequest req,ServletResponse resp) throws ServletException,IOException{
		resp.setContentType(getServletInfo());
		PrintWriter out = resp.getWriter();
		out.println("First Servlet at your service with Time and Date"+new Date());
	}
	
	public void destroy() {
		System.out.println("Servlet destroyed");
	}
	
	public String getServletInfo() {
		return "text/html";
	}
	
	public ServletConfig getServletConfig() {
		return config;
	}
}
