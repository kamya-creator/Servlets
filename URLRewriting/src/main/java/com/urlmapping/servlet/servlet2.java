package com.urlmapping.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet2 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String name = request.getParameter("username");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Name from Servlet 1 :"+name+"</h1>");
		
	}

}
