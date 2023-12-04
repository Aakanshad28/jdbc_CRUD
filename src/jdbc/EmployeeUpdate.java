package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String  className ="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/employeedb";
		String user="root";
		String password="root";
		String sql="UPDATE EMPLOYEE SET NAME='AAKANSHA' WHERE EMPLOYEEID=1";
		
		//1.
		Class.forName(className);
		//2.
		Connection connection=DriverManager.getConnection(url, user, password);
		//3.
		Statement statement=connection.createStatement();
		//4.
		int count=statement.executeUpdate(sql);
		if (count!=0) {
			System.out.println("Data Updated");
		}
		else {
             System.out.println("Data Not Updated");
		}
		//5.Close Connection
		connection.close();		
		
		
		
		
	}
	

}
