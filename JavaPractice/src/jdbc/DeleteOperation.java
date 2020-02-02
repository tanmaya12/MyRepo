package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteOperation {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/org?characterEncoding=latin1","root","root");
			if (con!=null) {
				System.out.println("Database connected.");
			}
			String sql = "DELETE FROM worker WHERE LAST_NAME=?";
			 
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, "CABU");
			 
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
			    System.out.println("A user was deleted successfully!");
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
