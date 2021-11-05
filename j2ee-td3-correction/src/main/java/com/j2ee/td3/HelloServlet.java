package com.j2ee.td3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Récupération du paramètre "user"
		String user = request.getParameter("user");
		
		// Transmission à la JSP
		request.setAttribute("userToGreet", user);
		
		getServletContext().getRequestDispatcher("/WEB-INF/hello.jsp").forward(request, response);
	}
}
