package com.cg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registerartion extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String id = request.getParameter("sid");
		String name = request.getParameter("sname");
		int age = Integer.parseInt(request.getParameter("sage"));
		String mobile = request.getParameter("smobile");
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Student Registerartion Details</h1>");
		out.print("<table>");
		
		out.print("<tr>");
		out.print("<td>Student ID</td>");
		out.print("<td>"+id+"</td>");		
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>Student Name</td>");
		out.print("<td>"+name+"</td>");		
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>Student Age</td>");
		out.print("<td>"+age+"</td>");		
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>Student Mobile</td>");
		out.print("<td>"+mobile+"</td>");		
		out.print("</tr>");
		
		
		out.print("</table>");
		
		
	}
}
