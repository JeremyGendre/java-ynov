package com.j2ee.td3.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/files/get")
@MultipartConfig
public class FilesGetServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fileName = req.getParameter("fileName");
	    File file = new File(FilesAddServlet.PATH_FOLDER + "\\" + fileName);
	    
	    if (file.exists()) {
	    	String mimeType = Files.probeContentType(file.toPath());
	    	resp.setContentType(mimeType);
	    	resp.setHeader("Content-Disposition", "filename=\"" + fileName + "\"");
	    	Files.copy(file.toPath(), resp.getOutputStream());
	    } else {
	    	resp.sendError(404, "File " + fileName + " not found");
	    }
	}
}
