package com.j2ee.td3.files;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.tomcat.util.http.fileupload.IOUtils;

@WebServlet("/files/add")
@MultipartConfig
public class FilesAddServlet extends HttpServlet {
	
	public static final String PATH_FOLDER = "C:\\temp\\j2ee-td3";

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[] files = new File(PATH_FOLDER).list();
		req.setAttribute("files", files);
		getServletContext().getRequestDispatcher("/WEB-INF/files_add.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Part filePart = request.getPart("file");
	    String fileName = filePart.getSubmittedFileName();
	    File file = new File(PATH_FOLDER + "\\" + fileName);
	    
	    InputStream inputStream = filePart.getInputStream();
	    Files.copy(inputStream,file.toPath(), StandardCopyOption.REPLACE_EXISTING);
	    IOUtils.closeQuietly(inputStream);
		
	    // Redirect to form
	    doGet(request, response);
	}
}
