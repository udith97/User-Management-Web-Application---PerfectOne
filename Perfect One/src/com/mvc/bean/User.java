package com.mvc.bean;

public class User {

	private int id;
	private String fullName;
	private String Email;
	private String userName;
	private String password;
	private String Role;
	
	
	
	public User() {
		super();
	}
	
 

	public User(int id) {
		super();
		this.id = id;
	}



	public User(int id, String fullName, String email, String userName, String password, String role) {
		super();
		this.id = id;
		this.fullName = fullName;
		Email = email;
		this.userName = userName;
		this.password = password;
		Role = role;
	}
	
	



	public User(int id, String fullName, String email, String userName, String password) {
		super();
		this.id = id;
		this.fullName = fullName;
		Email = email;
		this.userName = userName;
		this.password = password;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		this.Role = role;
	}
	
	
}
