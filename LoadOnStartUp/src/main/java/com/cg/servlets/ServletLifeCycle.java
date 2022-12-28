package com.cg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLifeCycle extends HttpServlet{

	public void init(ServletConfig config)
	{	System.out.println("==================================");
		System.out.println("IN ServletLifeCycle init method");
		System.out.println("Config Value: "+ config);
		System.out.println("==================================");
	}
	
	public void service(HttpServletRequest request , HttpServletResponse response)
			throws ServletException, IOException{
		System.out.println("==================================");
		System.out.println("IN ServletLifeCycle service method");
		System.out.println("==================================");
		String name = request.getParameter("user");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("Hello There "+name);
	}
	
	public void destroy() {
		
		System.out.println("==================================");
		System.out.println("IN ServletLifeCycle Destroy method");
		System.out.println("==================================");
	}
}
