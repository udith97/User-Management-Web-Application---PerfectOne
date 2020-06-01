package com.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mvc.bean.User;
import com.mvc.util.DBConnection;

public class RegisterDao {
	public String registerUser(User user) {
		String fullName = user.getFullName();
		String email = user.getEmail();
		String userName = user.getUserName();
		String password = user.getPassword();
		String Role = user.getRole();
		
		Connection con = null;
		PreparedStatement preparedStatement = null;

		try {
			con = DBConnection.createConnection();
			String query = "insert into users(SlNo,fullName,Email,userName,password,Role) values (NULL,?,?,?,?,?)";
																												
			preparedStatement = con.prepareStatement(query); 
			preparedStatement.setString(1, fullName);
			preparedStatement.setString(2, email);
			preparedStatement.setString(3, userName);
			preparedStatement.setString(4, password);
			preparedStatement.setString(5, Role);
		

			int i = preparedStatement.executeUpdate();

			if (i != 0) // Just to ensure data has been inserted into the database
				return "SUCCESS";
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "Oops.. Something went wrong there..!"; // On failure
	}
}
