package com.caps.upload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/upload")
@MultipartConfig
public class FileUploadServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String name=req.getParameter("name");
         String email=req.getParameter("email");
         
         Part filePart=req.getPart("file");
         String fileName=filePart.getSubmittedFileName();
         
         InputStream fileContent= filePart.getInputStream();
         
         byte[] buffer= null;
         String fName="D:/Geminites/Files/"+fileName;
         if(fileName.length()!=0) {
        	 buffer=new byte[fileContent.available()];
        	 fileContent.read(buffer);
        	 OutputStream outStream=new FileOutputStream(fName);
        	 outStream.write(buffer);
        	 outStream.close();
        	 fileContent.close();
        	 
        	 PrintWriter out=resp.getWriter();
        	 out.println("<h1> File is uploaded </h1>");
         } else {
        	 //some codes
         }
	}
}
