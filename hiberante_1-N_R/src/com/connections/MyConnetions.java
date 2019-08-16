package com.connections;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnetions {
	public static void main(String[] args) {
		String dburl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String username = "root";
		String password = "admin";

		try {
			Connection conn=DriverManager.getConnection(dburl,username, password);
			System.out.println("connection establihsed");
			
		}catch (Exception e) {
			System.out.println("cannot connect"+e.toString());
		}
	}
}
