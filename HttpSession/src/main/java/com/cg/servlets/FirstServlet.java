package com.cg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("username");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("Hello "+name);
		
		
		HttpSession session = req.getSession();
		session.setAttribute("username", name);
		String name_att = (String) session.getAttribute("username");
		out.print("<h1>"+name_att+"</h1>");
		out.print("<a href='SecondServlet'>Go to 2nd Servlet </>");
	}
}
