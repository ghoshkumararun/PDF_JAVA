// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

// Extend HttpServlet class
public class PrintWorld extends HttpServlet {
 
  private String message;

  public void init() throws ServletException
  {
      // Do required initialization
      message = "Hello World";
  }

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
	  Document document = new Document();
	    try{
	        response.setContentType("application/pdf");
	        PdfWriter.getInstance(document, response.getOutputStream());
	        document.open();
	        document.add(new Paragraph("Hello Kiran"));
	        document.add(new Paragraph(new Date().toString()));
	    }catch(Exception e){
	        e.printStackTrace();
	    }
	    document.close();
	   
      
  }
  
  public void destroy()
  {
      // do nothing.
  }
}