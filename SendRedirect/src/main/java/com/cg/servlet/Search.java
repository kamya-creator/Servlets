package com.cg.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Search extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException
	{
		System.out.println("In Search Servlet!!!!!!!!!!!");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String query = request.getParameter("search");
		/*
		 * sendRedirect web container ke domainse bahar jakr bhi request server kr sakta h
		 * ye gloabl level pr communicate kr sakta h
		 * it is suprior to forward method
		 */
		response.sendRedirect("https://google.com/search?q="+query);
	}

}
