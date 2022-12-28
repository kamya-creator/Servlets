package com.urlmapping.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("username");
		out.print("<h1>Hello"+ name+" </h1>");
		out.print("<a href ='servlet2?username"+"="+name+"' >"+"Go to Servlet 2</a>");
	}
	
	

}
