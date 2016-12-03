package com.mycompany.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="HelloWorldServlet", urlPatterns={"/hello"})
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 3444034839301829645L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
    	PrintWriter out=response.getWriter();
    	out.println("<html>");
    	out.println("<head><title>Hello Servlet</title></head>");
    	out.println("<body><H1>Hello Servlet</H1></body>");
    	out.println("</html>");
    	
    	try {
			TimeUnit.MILLISECONDS.sleep(100L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    }
}
