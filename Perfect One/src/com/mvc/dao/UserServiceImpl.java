package com.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mvc.bean.User;
import com.mvc.util.DBConnection;

public class UserServiceImpl implements IUserService {

	private static Connection conn;

	public UserServiceImpl() {

		conn = DBConnection.createConnection();

	}

	@Override
	public boolean DeleteUser(String id) throws SQLException {
		String sql = "Delete from users where  SLNo ='" + id + "'";
		Statement stm = conn.createStatement();
		return stm.executeUpdate(sql) > 0;
	}

	@Override
	public boolean updateUser(User user) throws SQLException {
		String SQL = "update users set fullName='" + user.getFullName() + "',Email='" + user.getEmail() + "',userName='"
				+ user.getUserName() + "', password='" + user.getPassword() + "' where SLNo='" + user.getId() + "'";
		System.out.println(SQL);
		Statement stm = conn.createStatement();
		return stm.executeUpdate(SQL) > 0;
	}



}
