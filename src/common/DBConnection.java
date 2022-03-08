package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	public static Connection getConnection() throws Exception{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			System.out.println("드라이버 못찾음");
		}	
		
		String DB_URL = "jdbc:mysql://localhost/fullstack?&useSSL=false";
		String DB_USER = "fstack";
		String DB_PASSWORD= "1234";
		Connection con = 
			DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		if(con != null) {
			System.out.println("접속 성공~~");
		}else {
			System.out.println("접속 오류~~~~");
		}
		return con;
	}
	public void close(Connection con, PreparedStatement ps, ResultSet result) {
		try {
			if(result != null)	result.close();
			if(ps != null) 		ps.close();
			if(con != null)		con.close();
		} catch(Exception e) {
			System.out.println("=========== 종료 error ===========");
		}
    }	
}
