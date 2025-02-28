package com.ayushs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		if(req.getParameter("email").equalsIgnoreCase("admin@gmail.com") && req.getParameter("password").equalsIgnoreCase("admin123")) {
			res.sendRedirect("welcome.jsp");
		}
		else {
			res.sendRedirect("error.jsp");
		}
	}
}
