package com.hibernate.conn;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;

public class MyConnection {
	public static void main(String[] args) {
		String jdbcURL = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String userName = "root";
		String passWord = "admin";

		try {
			System.out.println("Conecting to "+jdbcURL);
			Connection conn = DriverManager.getConnection(jdbcURL, userName, passWord);
			System.out.println("connection established");
		} catch (Exception e) {
			System.out.println("Cannot connect to DB : " + e.toString());
		}
	}
}
