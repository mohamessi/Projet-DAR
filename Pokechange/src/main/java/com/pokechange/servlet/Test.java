package com.pokechange.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {
	
	/*public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		response.setContentType("text/html");
		response.setCharacterEncoding( "UTF-8" );
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\" />");
		out.println("<title>Test</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>Ceci est une page g�n�r�e depuis une servlet.</p>");
		out.println("</body>");
		out.println("</html>");
		
		
	}*/
	
	public void doGet( HttpServletRequest request, HttpServletResponse response )	throws ServletException, IOException {
		String message = "Transmission de variables : OK !";
		request.setAttribute( "test", message );
		this.getServletContext().getRequestDispatcher( "/index.jsp" ).forward( request, response );
	}
}