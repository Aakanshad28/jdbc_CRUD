package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class employeeDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String  className ="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/employeedb";
		String user="root";
		String password="root";
		String sql="DELETE FROM EMPLOYEE WHERE EMPLOYEEID=3";
		
		//1.
		Class.forName(className);
		//2.
		Connection connection=DriverManager.getConnection(url, user, password);
		//3.
		Statement statement=connection.createStatement();
		//4.
		int count=statement.executeUpdate(sql);
		if (count!=0) {
			System.out.println("Data Deleted");
		}
		else {
             System.out.println("Data Not Deleted");
		}
		statement.close();
		connection.close();
	}

}
