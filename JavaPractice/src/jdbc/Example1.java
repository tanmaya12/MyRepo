package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example1 {
	
	static String usr="root";
	static String pwd="root";

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); //register jdbc driver
			
			System.out.println("Connecting database...");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/org?characterEncoding=latin1", usr, pwd);
			
			System.out.println("Creating statement...");
			Statement stmt= con.createStatement();
			ResultSet rs= stmt.executeQuery("select * from worker;");
			
			System.out.println("Reading datas...\n-----------------------------");
			while (rs.next())
			{
				System.out.print(rs.getInt(1)+" "+rs.getString(3)+"\n");
				//System.out.println();
			}			
			// clean-up environment...
			rs.close();
			stmt.close();
			con.close();
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

/*
 
Import the packages: Requires that you include the packages containing the JDBC classes needed for database programming. Most often, using import java.sql.* will suffice.

Register the JDBC driver: Requires that you initialize a driver so you can open a communication channel with the database.

Open a connection: Requires using the DriverManager.getConnection() method to create a Connection object, which represents a physical connection with the database.

Execute a query: Requires using an object of type Statement for building and submitting an SQL statement to the database.

Extract data from result set: Requires that you use the appropriate ResultSet.getXXX() method to retrieve the data from the result set.

Clean up the environment: Requires explicitly closing all database resources versus relying on the JVM's garbage collection.

*/
