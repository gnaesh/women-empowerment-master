package com.capgemini.model;

public class User {
	private int loginId;
	private String userName;
	private String userPassword;

//	No agrgument Constructor
	public User() {
		super();
	}
	
//	agrgument Constructor
	public User(int loginId, String userName, String userPassword) {
		super();
		this.loginId = loginId;
		this.userName = userName;
		this.userPassword = userPassword;
	}
// Getters and setters
	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
//	Tostring method
	@Override
	public String toString() {
		return "User [loginId=" + loginId + ", userName=" + userName + ", userPassword=" + userPassword + "]";
	}
	
}
