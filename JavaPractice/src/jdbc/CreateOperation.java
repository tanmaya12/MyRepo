package jdbc;

import java.sql.*;

public class CreateOperation {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/org?characterEncoding=latin1","root","root");
			if (con!=null) {
				System.out.println("Database connected.");
			}
			
			String sql = "INSERT INTO Worker (WORKER_ID, FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) VALUES (?, ?, ?, ?, ?, ?)";
			 
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, 11);
			statement.setString(2, "TANMAY");
			statement.setString(3, "KUMAR");
			statement.setString(4, "99999");
			statement.setString(5, null);
			statement.setString(6, "QA");
			 
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("A new user was inserted successfully!");
			}
			
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
