package com.EMS.EmployeeManagementSystem;

import java.sql.*;

public class DatabaseConnection {
		
	Connection con;
	Statement stm;
		
	DatabaseConnection(){
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employee_management_system?useSSL=false&autoReconnect=true", "root", "");
			stm = con.createStatement();
				
			System.out.println("Database connected successfully!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new DatabaseConnection();
	}

}
