package jdbc;

import java.sql.*;

public class ReadOperation {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		try(Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/org?characterEncoding=latin1","root","root")) 
		{
			String sql = "SELECT * FROM worker";
			 
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			 
			while (rs.next()){
				System.out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+"\n");
			}
			statement.close();rs.close();
			con.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
