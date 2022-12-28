package com.cg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet{
	int count;
	public void init(ServletConfig config) throws ServletException
	{	System.out.println("===================================");
		System.out.println("In HelloWorld init Method");
		System.out.println("===================================");
		count = Integer.parseInt(config.getInitParameter("count"));
	}
	public void service(HttpServletRequest req, HttpServletResponse
			 resp) throws ServletException , IOException{
		System.out.println("===================================");
		System.out.println("In Hello World Service Method");
		System.out.println("===================================");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<H1>HELLO WORLD</H1>");
		out.print("<h3>Value of Count is :"+count+"</h3>");
		out.print("<form action='ServletLifeCycle'>");
		out.print("What's Ur Name :<input type ='text' name='user' /><br/><br/>");
		out.print("<button type='submit'/>Submit");
		out.print("</form>");
	}
	public void destroy() {
		System.out.println("===================================");
		System.out.println("In Hello World Destroy Method");		
		System.out.println("===================================");
	}

}
