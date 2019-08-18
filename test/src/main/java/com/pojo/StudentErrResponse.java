package com.pojo;

public class StudentErrResponse {

	int status;
	String message;
	Long timeStamp;

	public String getMessage() {
		return message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
