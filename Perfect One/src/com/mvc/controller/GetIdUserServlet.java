package com.mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.User;

/**
 * Servlet implementation class GetIdUserServlet
 */
@WebServlet("/GetIdUserServlet")
public class GetIdUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetIdUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sId = Integer.parseInt((request.getParameter("updateId")));
		String fullName = request.getParameter("updateName"); 
        String email = request.getParameter("updateEmail");
        String userName = request.getParameter("updateUserName");
        String password= request.getParameter("updatePassword");
    	String role= request.getParameter("updateRole");
		
		User  user1 = new User();
		
		user1.setId(sId);
		user1.setFullName(fullName);
		user1.setEmail(email);
		user1.setUserName(userName);
		user1.setPassword(password);
		user1.setRole(role);
		
		
		request.setAttribute("getCid", user1);

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/updateUser.jsp");
		dispatcher.forward(request, response);
		doGet(request, response);
	}

}
