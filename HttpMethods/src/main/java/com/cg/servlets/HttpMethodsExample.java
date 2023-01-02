package com.cg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpMethodsExample extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{	
		System.out.println("IN POST METHOD");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Form Submitted using Post Method </h2>");
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Form Submitted using Get Method </h2>");
	}
	public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException
	{	
		System.out.println("In PUT method");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Form Submitted using Put Method </h2>");
	}
	public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Form Submitted using Delete Method </h2>");
	}

}
