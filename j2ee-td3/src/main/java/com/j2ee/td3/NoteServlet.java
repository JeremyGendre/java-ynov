package com.j2ee.td3;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.j2ee.td3.utils.NoteHelper;

/**
 * Servlet implementation class NoteServlet
 */
@WebServlet("/notes")
public class NoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoteServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("delete") != null) {
			NoteHelper.deleteNotes(request);
		}
		
		HttpSession session = request.getSession(true);
		ArrayList<String> notes = (ArrayList<String>) session.getAttribute("notes");
		if(notes == null) {
			notes = new ArrayList();
		}
		request.setAttribute("notes", notes);
		getServletContext().getRequestDispatcher("/WEB-INF/notes.jsp").forward(request, response);
	}

}
