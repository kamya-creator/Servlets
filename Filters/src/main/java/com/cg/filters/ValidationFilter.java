package com.cg.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ValidationFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		String sid_error="", sname_error="", sage_error = "", smobile_error="";
		Boolean flag = true;
		
		String id = request.getParameter("sid");
		String name = request.getParameter("sname");
		String age = request.getParameter("sage");
		String mobile = request.getParameter("smobile");
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println("IN FILTER ");
		if(id == null || id.equals(""))
		{
			sid_error ="ID can not be empty!!!";
			flag = false;					
		}
		if(name == null || name.equals(""))
		{
			sname_error ="Name can not be empty!!!";
			flag = false;					
		}
		if(age == null || age.equals(""))
		{
			sage_error ="Age can not be empty!!!";
			flag = false;					
		}
		
		if(mobile == null || mobile.equals(""))
		{
			smobile_error ="Phone Number can not be emplty!!!";
			flag = false;					
		}
		if(flag !=false) {
			out.print("<h3>Filter is invoked Before resource call</h3>");
			chain.doFilter(request, response);
			out.print("<h3>Filter is invoked After resource call</h3>");
		}else {
		out.print("<h1>Student Registerartion Details</h1>");
		out.print("<table border='1px'>");
		
		out.print("<form action='Registerartion' method='Post'>");
		out.print("<tr>");
		out.print("<td>Student ID</td>");
		out.print("<td>"+id+"</td>");
		out.print("<td><input type='text' name='sid' value = '"+id+"'/></td>");
		out.print("<td><font color = 'red' size='5'>"+sid_error+"</font></td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>Student Name</td>");
		out.print("<td>"+name+"</td>");
		out.print("<td><input type='text' name='sname' value = '"+name+"'/></td>");
		out.print("<td><font color = 'red' size='5'>"+sname_error+"</font></td>");	
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>Student Age</td>");
		out.print("<td>"+age+"</td>");
		out.print("<td><input type='text' name='sage' value = '"+age+"'/></td>");
		out.print("<td><font color = 'red' size='5'>"+sage_error+"</font></td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>Student Mobile</td>");
		out.print("<td>"+mobile+"</td>");
		out.print("<td><input type='text' name='smobile' value = '"+mobile+"'/></td>");
		out.print("<td><font color = 'red' size='5'>"+smobile_error+"</font></td>");
		out.print("</tr>");
		
		
		out.print("<tr>");
		out.print("<td><button type='submit' name='Register'>Register<button/></td>");
		out.print("</tr>");

		out.print("</table>");

		out.print("</form>");
		}
		
	}

}
