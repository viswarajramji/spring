package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user_name = "root";
		String password = "admin";
		try {
			Connection conn = DriverManager.getConnection(url, user_name, password);
			System.out.println("connection established");
		} catch (Exception e) {
			System.out.println(e);
		} finally {

		}
	}
}
