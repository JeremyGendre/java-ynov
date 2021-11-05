package com.j2ee.td3.notes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/notes/add")
public class NoteAddServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> notes = (List<String>) request.getSession(true).getAttribute("notes");
		
		String note = request.getParameter("note");
		if (notes == null) {
			notes = new ArrayList<String>();
		}
		if (note != null) {
			notes.add(note);
			request.getSession().setAttribute("notes", notes);
		}
		
		response.sendRedirect(request.getContextPath() + "/notes"); 
	}
	
}
