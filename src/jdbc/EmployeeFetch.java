package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeFetch {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String  className ="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/employeedb";
		String user="root";
		String password="root";
		String sql="SELECT * FROM EMPLOYEE";
		
		//1.
		Class.forName(className);
		//2.
		Connection connection=DriverManager.getConnection(url, user, password);
		//3.
		Statement statement=connection.createStatement();
		//4.
		ResultSet resultSet=statement.executeQuery(sql);
		while (resultSet.next()) {
			
			System.out.println(resultSet.getInt("employeeid"));
			System.out.println(resultSet.getString("name"));
			System.out.println(resultSet.getDouble(3));
			System.out.println(resultSet.getLong("phoneno"));
			System.out.println(resultSet.getString(5));
			System.out.println("***********************");
			
		}
		resultSet.close();
		}

	
}
