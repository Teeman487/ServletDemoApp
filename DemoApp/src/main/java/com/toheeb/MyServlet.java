package com.toheeb;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*ServletConfig & ServletContext*/ // We used these two things to get initial values for the Servlet or for the application
// In this ex, if you want to do any initial setup or specify the file part wher will you do it? in web.xml in which you can mention the initial parameterrs

public class MyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		//out.print("Hi<br/>");
		out.print("Hi ");
		
		//ServletContext ctx = getServletContext();  // you can specify initial value
		ServletConfig cg = getServletConfig();
	    String str = cg.getInitParameter("name");
	    //String str = ctx.getInitParameter("name"); // In
		out.println(str);
		
	}

}
