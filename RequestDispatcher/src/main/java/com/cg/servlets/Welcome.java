package com.cg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet{
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("In Welcome Servlet!!!!!!!!!!!");
	}
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h3>Welcome To Online Shopping kro Dot Com</h3>");
	}
}
