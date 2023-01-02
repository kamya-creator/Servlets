package com.cg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("username");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<form action ='SecondServlet'>");
		out.print("<h3>Welcome : "+name+"</h3>");
		/*
		 * Hidden Form use krne ka disadvantage h ki u have to use form everytime 
		 * 
		 */
		out.print("<input type ='hidden' name='username' value = '"+name+"'>");
		out.print("<button type='submit' name='submit'>Go<button/>");
		out.print("</form>");
		
	}
}