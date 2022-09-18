package com.sample.invite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AnotherTest {
	
	/*
	 * spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
	 * spring.datasource.url=jdbc:mariadb:127.0.0.1:3306
	 * spring.datasource.username=root 
	 * spring.datasource.password=inviteu2022!
	 */
	public static void main(String[] args) {
		final String driver = "org.mariadb.jdbc.Driver";
		final String DB_IP = "localhost";
		final String DB_PORT = "3306";
		final String DB_NAME = "chodaehae";
		final String DB_URL = 
				"jdbc:mariadb://" + DB_IP + ":" + DB_PORT + "/" + DB_NAME;

		Connection conn = null;
		/*
		 * PreparedStatement pstmt = null; ResultSet rs = null;
		 */

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(DB_URL, "root", "inviteu2022!");
			if (conn != null) {
				System.out.println("DB 접속 성공");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
			e.printStackTrace();
		}

		/*
		 * try { String sql = "select * from user";
		 * 
		 * pstmt = conn.prepareStatement(sql);
		 * 
		 * rs = pstmt.executeQuery(); String userId = null; String password = null;
		 * String name = null; while (rs.next()) { userId = rs.getString(1); password =
		 * rs.getString(2); name = rs.getString(3); }
		 * 
		 * System.out.println(userId); System.out.println(password);
		 * System.out.println(name);
		 * 
		 * } catch (SQLException e) { System.out.println("error: " + e); } finally { try
		 * { if (rs != null) { rs.close(); } if (pstmt != null) { pstmt.close(); }
		 * 
		 * if (conn != null && !conn.isClosed()) { conn.close(); } } catch (SQLException
		 * e) { e.printStackTrace(); } }
		 */

	}

	
}

