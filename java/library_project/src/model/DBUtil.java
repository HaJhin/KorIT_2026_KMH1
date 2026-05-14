package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	// db 접속 정보
		private static String url = "jdbc:mysql://localhost:3306/rental_db";
		private static String user = "root";
		private static String password = "12341234";

		// 데이터베이스 연결 객체를 반환하는 메서드
		public static Connection getConnection() throws Exception {
			Connection conn = 
					DriverManager.getConnection(url, user, password);
			return conn;
		} // getConnection ed
}
