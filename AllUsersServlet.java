package com.javawebtutor.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javawebtutor.model.User;
import com.javawebtutor.service.LoginService;

public class AllUsersServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			LoginService loginService = new LoginService();
			List<User> uList = loginService.getListOfUsers();
			request.getSession().setAttribute("userList", uList);
			response.sendRedirect("adminPage.jsp");
		} catch (Exception ex) {
			ex.printStackTrace();
			response.sendRedirect("error.jsp");
		}
	}

}