package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import db_connect.DBUtil;
import dto.MemberDTO;

// DAO(Data Access Object)
// 실제로 DB에 접근하는 클래스
public class MemberDao {
	
	// 조회
	public void findAll() {
		ArrayList<MemberDTO> dtoList = new ArrayList<MemberDTO>();
		String sql = "select * from member";
		
		try (Connection conn = DBUtil.getConnection();
				// SQL을 안전하고 효율적으로 실행하기 위한 객체
				PreparedStatement ps = conn.prepareStatement(sql);
				// 실행한 결과를 rs에 저장
				ResultSet rs = ps.executeQuery();) {
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				int age = rs.getInt("age");
				
				dtoList.add(new MemberDTO(id, name, email, age));
			} // while ed
			
			dtoList.forEach(x -> {
				System.out.println(x.getId());
				System.out.println(x.getName());
				System.out.println(x.getEmail());
				System.out.println(x.getAge());
				System.out.println("--------------");
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // findAll ed
	
	// 추가
	public void insertMember(MemberDTO dto) {
		String sql = "insert into member(name,email,age) values(?,?,?)";
		
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getEmail());
			ps.setInt(3,dto.getAge());
			
			ps.executeUpdate();
			System.out.println("Success Insert");
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // Insert Member ed
	
	// 나이 수정
	public void updateMember(MemberDTO dto) {
		String sql = "update member set age = ? where id = ?";
		
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setInt(1,dto.getAge());
			ps.setInt(2,dto.getId());
			
			ps.executeUpdate();
			System.out.println("Update Success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // Update Member ed
	
	// 삭제
	public void deleteMember(MemberDTO dto) {
		String sql = "delete from member where id = ?";
		
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setInt(1,dto.getId());
			
			ps.executeUpdate();
			System.out.println("delete Success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // delete Member ed
}
