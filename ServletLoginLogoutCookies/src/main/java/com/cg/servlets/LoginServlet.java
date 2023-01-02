package com.cg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		if(name.equals("Kamya") && password.equals("abc123"))
		{	
			/*
			 * Cookie ka disadvantage h ki Ur browser must allow cookies to access
			 * Otherwise ye method work nhi krega
			 * Tips: Ek baar cookies diable krke Gmail access krne ki koshish kro
			 * U will not be able to acess Gmail
			 * Qki Gmail Cookies pr chalta h
			 */
			Cookie cookie_user = new Cookie("user", name);
			response.addCookie(cookie_user);
			
			out.print("<h1>Login Succesfully</h1>");
		}
		else {
			out.print("<h1>Something Went Wrong :(</h1>");
		}
	}

}
