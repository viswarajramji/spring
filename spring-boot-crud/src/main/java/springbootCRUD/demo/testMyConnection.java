package springbootCRUD.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class testMyConnection {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String username = "root";
		String password = "admin";
		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("connection");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
