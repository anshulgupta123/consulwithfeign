package com.feignservice1.feigndemo3.modal;

import java.io.Serializable;

public class ResponseDto implements Serializable {

	private Long userId;
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "ResponseDto [userId=" + userId + ", state=" + state + ", mobileNumber=" + mobileNumber + "]";
	}

}
