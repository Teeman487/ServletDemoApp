package com.toheeb;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")   // for which url you want to call the Servlet
public class AddServlet extends HttpServlet 
{
	//public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		//Cookie cookie = new Cookie("k", k + "");
		//res.addCookie(cookie); // add Cookie to response object to go to the client and client again will send a re to SqServlet, it will send the Cookieas well
		//k=k*k;
		
		//req.setAttribute("k", k); // able to send k value from AddServlet to SqServlet
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
		
		//res.sendRedirect("sq");
		//res.sendRedirect("sq?k="+k); // /URL Rewriting // client go to or send req to sq servlet
		
		
		  PrintWriter out = res.getWriter();
		  out.println("<html><body bgcolor='blue'>"); // you dont get errors if you made 1 mistake
		  out.println("Output is " + k);
		 out.println("</body></html>");
		
		// Req Dis  and Redirect
		// We are dispatching the Request from one servlet to another
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res); // RequestDispather forawarding req and res objects
	
	}

	
	
//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
//	{
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		
//		int k = i + j;
//		 PrintWriter out = res.getWriter();
//		out.println("result is " + k);
//	}
	
}
