package com.feignservice1.feigndemo3.modal;

import java.io.Serializable;

public class ResponseDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long userId;
	private String state;
	private String mobileNumber;
	private String port;
	private String userName;
	private String password;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
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

	@Override
	public String toString() {
		return "ResponseDto [userId=" + userId + ", state=" + state + ", mobileNumber=" + mobileNumber + ", port="
				+ port + ", userName=" + userName + ", password=" + password + "]";
	}

}
