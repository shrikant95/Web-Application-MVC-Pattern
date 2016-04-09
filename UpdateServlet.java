package com.javawebtutor.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javawebtutor.model.User;
import com.javawebtutor.service.UpdateRecordService;


public class UpdateServlet extends HttpServlet {
	
	private static final long serialVersionUID = 7588171940271804989L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//response.setContentType("text/html;charset=UTF-8");
		//PrintWriter out = response.getWriter();
		
		try{
		String firstName = request.getParameter("firstName");
		String middleName = request.getParameter("middleName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String password = request.getParameter("password");
		String id= request.getParameter("id");
		
		User user = new User();
		
		user.setEmail(email);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setMiddleName(middleName);
		user.setMobile(mobile);
		user.setPassword(password);
		user.setId(id);
		
		
		UpdateRecordService urs=new UpdateRecordService();
		urs.updateRecord(user);
		
		RequestDispatcher rd=request.getRequestDispatcher("adminPage.jsp");
		rd.forward(request, response);
	}
	catch(Exception e)
	{
		e.printStackTrace();

	/*	try {
			UpdateRecordService urs=new UpdateRecordService();
			boolean result = urs.updateRecord(user);
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Updation Successful</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<center>");
			if (result)
			{
				out.println("<h1>Thanks for Update your Registeration Entries  :</h1>");
				response.sendRedirect("adminPage.jsp");
				
			}
			else {
				out.println("<h1>Updation Failed</h1>");
				//out.println("To try again<a href=edit.jsp>Click here</a>");
				response.sendRedirect("edit.jsp");
				
			}
			out.println("</center>");
			out.println("</body>");
			out.println("</html>");
		} finally {
			out.close();
		}*/
		
	}
	}
}