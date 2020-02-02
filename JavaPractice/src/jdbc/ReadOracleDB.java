package jdbc;

import java.sql.*;

public class ReadOracleDB {
	
	public static void main(String args[]){  
		try{  
		//step1 load the driver class  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
		//step2 create  the connection object  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:myoracle","system","root");  
		  
		//step3 create the statement object  
		//String sql = "select id, username, password from person where id= ? and password = ?";
		String sql = "select username, password from person where id= ?";
		
		//Statement stmt=con.createStatement();
		PreparedStatement ps= con.prepareStatement(sql);
		ps.setInt(1, 4);
		//ps.setString(1, "3");
		//ps.setString(2, "ranjan");
		  
		//step4 execute query  
		ResultSet rs=ps.executeQuery();  
		rs.next();
		System.out.println(rs.getString(1)+"  "+rs.getString(2));  
		  
		//step5 close the connection object 
		ps.close();rs.close();
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  
	}  

}
