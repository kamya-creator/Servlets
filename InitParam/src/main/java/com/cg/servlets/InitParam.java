package com.cg.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParam extends HttpServlet{
	String mail;
	Integer age;
	public void init(ServletConfig config)throws ServletException {
		mail = config.getInitParameter("EMail");
		age = Integer.parseInt(config.getInitParameter("Age"));
		Enumeration<String> initparams = config.getInitParameterNames();
		while(initparams.hasMoreElements())
		{
			String name = initparams.nextElement();
			String id = config.getInitParameter(name);
			System.out.println("Init Param using Enumeration: " + id);
		}
	}
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h2>value from Init Param is : "+mail+"</h2>");
		out.print("<h6>Value from Init Param is : "+age+"</h6>");
		
	}
}
