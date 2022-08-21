package org.btm.PsApp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.PrintWriter;
@WebServlet("/ep")
public class ElectronicServ extends GenericServlet 
{
	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException
	{
		ServletContext ctx=getServletContext();
		String offmsg =ctx.getInitParameter("ofm");
		String offper=ctx.getInitParameter("ofp");
		Product p=new Product();
		ctx.setAttribute("prd", p);
		PrintWriter out=resp.getWriter();
		out.println("<html> <body bgcolor='pink' "+ 
				"<h1> Book product details </h1><p>" + offmsg + " " + offper + " Discount" +
						"<br>" );
		out.println("<a href = \"Product.html\"> Back </a>" + " </body></html>");
		out.flush();
		out.close();
	}
		
	}