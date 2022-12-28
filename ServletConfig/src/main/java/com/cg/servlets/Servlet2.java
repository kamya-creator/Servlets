package com.cg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
	ServletConfig config;
	public void init(ServletConfig config)
	{	/*
		ServletConfig ek interface h to iska object iski koi implementation class provide karati h
		To phir vo konsi class h jo isse implement krti h?
		Iski implementation Web Server Vendor(in our case it's Apache Tomcat)
		provide karate h
		*/
		this.config = config;
		System.out.println("In Servlet 2 Config");
		
	}
	
	public void service(HttpServletRequest reuqest, HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h5>Servlet 2 Config: "+config.toString()+"</h5>");
		
		out.print("<h5>Servlet 2 Context: "+config.getServletContext().toString()+"</h5>");
		
		out.print("<h5>Servlet 2 InitParam: "+config.getInitParameter("Db")+"</h5>");
		
		out.print("<h2>Servlet 2 Logical Name: "+config.getServletName()+"</h2>");
		
	}

}
