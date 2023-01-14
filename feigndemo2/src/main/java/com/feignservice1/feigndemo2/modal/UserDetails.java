package com.feignservice1.feigndemo2.modal;

public class UserDetails {

	private String state;
	private String mobileNumber;

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

	@Override
	public String toString() {
		return "UserDetails [state=" + state + ", mobileNumber=" + mobileNumber + "]";
	}

}
