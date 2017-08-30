package com.sopra.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.sopra.service.CalculService;

/**
 * Servlet implementation class ServletAdd
 */
//@WebServlet("/ServletAdd")
public class ServletAdd extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String sA = request.getParameter("a");
       double a  = Double.parseDouble(sA);
       String sB = request.getParameter("b");
       double b  = Double.parseDouble(sB);
       
      ServletContext application = 
    		     this.getServletContext(); 
      //ok aussi dans bloc <% %> d'une page jsp
      WebApplicationContext ctxSpring =  
    		  WebApplicationContextUtils
    		     .getWebApplicationContext(application); 
      CalculService  beanCalcul = (CalculService) 
    		  ctxSpring.getBean("calculServiceImpl"); 
       
       double res= beanCalcul.add(a, b);
       
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       out.println("<html><body>");
       out.println("res=<b>"+res+"</b>");
       out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
