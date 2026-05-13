package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class select {
	public static void main(String[] args) {
		// db 접속 경로
		// 형식
		// jdbc:mysql://서버주소:포트번호/데이터베이스명
		String url = "jdbc:mysql://localhost:3306/java_db";
		String user = "root";
		String password = "12341234";
		// select,insert,update,delete
		// 실행할 sql을 작성
		// ?는 값이 들어갈 자리(placeholder)
		String sql = "select * from member";

		// MySQL과 서버 연결
		try (Connection conn = DriverManager.getConnection(url, user, password);
				// SQL을 안전하고 효율적으로 실행하기 위한 객체
				PreparedStatement ps = conn.prepareStatement(sql);
				// 실행한 결과를 rs에 저장
				ResultSet rs = ps.executeQuery();) {
			// 연결 성공 시
			System.out.println("MySQL 연결 성공");

			// SQL 실행
			// executeUpdate() : insert,update,delete 시에 사용
			// executeQuery() : select 시 사용

			// rs.next() : 다음 행으로 이동하는 메서드
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				int age = rs.getInt("age");

				System.out.printf("id : %d name : %s email : %s age : %d\n", id, name, email, age);

			}
		} catch (Exception e) {
			System.out.println("연결 실패");
			e.printStackTrace();
		}
	}
}
