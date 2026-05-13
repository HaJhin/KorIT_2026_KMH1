package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	// db 접속 정보
	private static String url = "jdbc:mysql://localhost:3306/java_db";
	private static String user = "root";
	private static String password = "12341234";

	// 데이터베이스 연결 객체를 반환하는 메서드
	public static Connection getConnection() {
		// 연결에 성공하면 connection 객체 반환
		try {
			Connection conn = 
					DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공");
			return conn;
		} catch (Exception e) {
			System.out.println("연결 실패");
			return null;
		}
		// 실패하면 null 반환
	} // getConnection ed

}
