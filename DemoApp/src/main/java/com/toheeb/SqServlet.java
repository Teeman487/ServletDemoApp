package com.toheeb;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/sq")
public class SqServlet extends HttpServlet
{
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
{  
	int k = 0;
	Cookie[] cookies = req.getCookies();
	for(Cookie c : cookies)
	{
		if(c.getName().equals("k"))
			   k = Integer.parseInt(c.getValue());
	}
	
	//int k = (int) req.getAttribute("k");
	//int k = Integer.parseInt(req.getParameter("k"));
	/*
	 * HttpSession session = req.getSession();
	 * 
	 * int k = (int) session.getAttribute("k");
	 */
	
	k = k * k;
	
	
	PrintWriter out = res.getWriter();
	//out.println("Hello to Sq");
	out.println("Result is " + k);
	
	System.out.println("sq called");
  }
}
