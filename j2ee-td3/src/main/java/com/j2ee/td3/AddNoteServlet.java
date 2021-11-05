package com.j2ee.td3;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddNoteServlet
 */
@WebServlet("/note/add")
public class AddNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNoteServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		
		ArrayList<String> notes = (ArrayList<String>) session.getAttribute("notes");
		if(notes == null) {
			notes = new ArrayList();
		}
		
		String newNote = (String) request.getParameter("note");
		
		notes.add(newNote);
		
		session.setAttribute("notes", notes);
		response.sendRedirect(request.getContextPath() + "/notes");
	}

}
