package com.cg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LinkServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		Cookie[] cookies = request.getCookies();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		if(cookies == null)
		{	
			out.print("<h1>Login Required!!!!</h1>");
			
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}else {
			out.print("<h1>Already Login!!!</h1>");
			
		}
	}

}
