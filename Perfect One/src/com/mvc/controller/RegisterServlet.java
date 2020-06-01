package com.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.User;
import com.mvc.dao.RegisterDao;

import javax.servlet.http.HttpServlet;

public class RegisterServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Copying all the input parameters in to local variables
		String fullName = request.getParameter("fullname");
		String email = request.getParameter("email");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		String role = request.getParameter("role");
		

		User user = new User();
		
		user.setFullName(fullName);
		user.setEmail(email);
		user.setUserName(userName);
		user.setPassword(password);
		user.setRole(role);
	

		RegisterDao registerDao = new RegisterDao();

		
		String userRegistered = registerDao.registerUser(user);

		if (userRegistered.equals("SUCCESS")) //On Success
		{
			request.getRequestDispatcher("/Login.jsp").forward(request, response);
		} else // On Failure
		{
			request.setAttribute("errMessage", userRegistered);
			request.getRequestDispatcher("/Register.jsp").forward(request, response);
		}
	}
}
