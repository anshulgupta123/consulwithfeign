package com.feignservice1.feigndemo2.modal;

public class UserDetails {

	private String state;
	private String mobileNumber;
	private String port;

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

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "UserDetails [state=" + state + ", mobileNumber=" + mobileNumber + ", port=" + port + "]";
	}

}
