package bean;

import java.sql.*;

public class Register {
	public static int register(User u){  
		int status = 0;  
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","");  
		PreparedStatement ps=con.prepareStatement("INSERT INTO REGISTERUSER VALUES(?,?,?,?)");  
		ps.setString(1,u.getUname());  
		ps.setString(2,u.getUemail());  
		ps.setString(3,u.getUpass());
		ps.setString(4, "IN");
		              
		status=ps.executeUpdate();  
		}catch(Exception e){}  
		      
		return status;  
		}  
}
