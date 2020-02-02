package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateOperation {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		try(Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/org?characterEncoding=latin1","root","root")) 
		{
			String sql = "UPDATE worker SET LAST_NAME=?, JOINING_DATE=? WHERE FIRST_NAME=?";
			 
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, "cabu");
			statement.setString(2, "2018-11-11");
			statement.setString(3, "TANMAY");
			 
			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
			    System.out.println("An existing user was updated successfully!");
			}
			con.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
