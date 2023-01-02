package com.cg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		System.out.println("In LogOut InitMethod");
	}
	
	/***
	 * Change the order of doGet() method parameter 
	 * mtlb HttpServeltRequest baad m likho or dekho code kese fatt jayega
	 *  Isse humne ye sikha ?? 
	 *  Order matters while overriding doGet() method
	 */
	public void doGet(HttpServletRequest request,HttpServletResponse response ) throws IOException
	{
		Cookie cookie = new Cookie("user","") ;
		cookie.setMaxAge(0);
		response.addCookie(cookie);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>LogOut Succesfully!!!!!!!</h1>");
	}

	

	
}
