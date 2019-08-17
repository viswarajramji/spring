package com.pojo;

public class Student {
	int id;
	String fname;
	String mail;

	public Student(int id, String fname, String mail) {
		super();
		this.id = id;
		this.fname = fname;
		this.mail = mail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
