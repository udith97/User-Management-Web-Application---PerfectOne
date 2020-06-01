package com.mvc.dao;

import java.sql.SQLException;

import com.mvc.bean.User;

public interface IUserService {

	boolean DeleteUser(String id) throws SQLException;
	
	boolean updateUser(User user) throws SQLException;
	
	
}
