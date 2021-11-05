package com.j2ee.td3.utils;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class NoteHelper {
	
	public static void deleteNotes(HttpServletRequest request) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		ArrayList<String> notes = (ArrayList<String>) session.getAttribute("notes");
		if(notes == null || notes.size() > 0) {
			notes = new ArrayList();
		}		
		session.setAttribute("notes", notes);
	}

}
