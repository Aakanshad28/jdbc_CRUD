package jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.Load or Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2.Establish connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
		
		//3.Creat Statement
		Statement statement =connection.createStatement();
		
		//4.Execute the Statement or Processing the result
		int count=statement.executeUpdate("INSERT INTO EMPLOYEE VALUES (5,'AARAV',55000,7796668681,'RAMTEK'),(6,'AMAY',45000,7654321127,'NAGPUR')");
		if (count!=0) {
			System.out.println("Data Inserted");
		}
		else {
             System.out.println("Data Not Inserted");
		}
		//5.Close Connection
		connection.close();		
	}

}
