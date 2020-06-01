package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.User;
import com.mvc.dao.IUserService;
import com.mvc.dao.UserServiceImpl;

/**
 * Servlet implementation class UpdateUserServlet
 */
@WebServlet("/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserServlet() {
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
    	//String role= request.getParameter("updateRole");
		
		User  user = new User();
		
		user.setId(sId);
		user.setFullName(fullName);
		user.setEmail(email);
		user.setUserName(userName);
		user.setPassword(password);
		//user.setRole(role);
		
		
		
		
		IUserService iUser = new UserServiceImpl();
		
		
		try {
			boolean isUpdated= iUser.updateUser(user);
			
			if(isUpdated == true) {
				PrintWriter out = response.getWriter();
				out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
				out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
				out.println("<script>");
				out.println("$(document).ready(function(){");
				out.println("swal ( 'Updated Successfully' ,  '' ,  'success' );");
				out.println("});");
				out.println("</script>"); 
				
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ListUsers.jsp");
				dispatcher.include(request, response);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}


	}

}
