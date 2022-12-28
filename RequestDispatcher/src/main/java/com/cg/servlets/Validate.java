package com.cg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Validate extends HttpServlet {
	
	public void init(HttpServlet config) throws ServletException
	{
		System.out.println("Initializing Validate Sevlet!!!!!!!!!!");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(password.equals("pass"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("/welcome");
			rd.forward(request, response);
		}
		else {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("You Entered Wrong Password");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
	}

}
