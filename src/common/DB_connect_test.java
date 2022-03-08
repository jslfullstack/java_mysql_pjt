package common;

import java.sql.Connection;

public class DB_connect_test {

	public static void main(String[] args) {
		try {
			Connection con = DBConnection.getConnection();
			System.out.println(" mysql_연결 : "+con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
