package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;

import model.dto.BookDto;

public class RentalDao {

	// 고객이 도서를 대여하면 도서 재고를 조회
	// rental 테이블에 대여 정보 추가
	// book 테이블의 재고 1 감소
	// rentalBook(int customer, int bookId
	public void rentalBook(int customerId, int bookId) {
		String sql1 = "select stock from book where book_id = ?";
		String sql2 = "insert into rental(customer_id,book_id)values(?,?)";
		String sql3 = "update book set stock = stock-1 where book_id = ?";
		try (Connection conn = model.DBUtil.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql1);
				PreparedStatement ps2 = conn.prepareStatement(sql2);
				PreparedStatement ps3 = conn.prepareStatement(sql3);) {
			conn.setAutoCommit(false);
			
			ps.setInt(1, bookId);
			ResultSet rs = ps.executeQuery();

			if (!rs.next()) {
				System.out.println("존재하지 않는 도서입니다.");
				conn.rollback();
				return;
			}
			int stock = rs.getInt("stock");
			
			if (stock <= 0) {
				System.out.println("재고가 부족합니다.");
				conn.rollback();
				return;
			}
			
			ps2.setInt(1, customerId);
			ps2.setInt(2, bookId);
			ps2.executeUpdate();
			
			ps3.setInt(1, bookId);
			ps3.executeUpdate();
			
			conn.commit();
			conn.setAutoCommit(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // rentalBook ed
	
	// 전체 대여 목록 join으로 조회
	// 대여번호, 고객명, 도서명, 대여일을 조회
	public void rentalList() {
		String sql = """ 
				select rental_id,name,title,rental_date 
				from rental r
				inner join customer c on r.customer_id = c.customer_id
				inner join book b on r.book_id = b.book_id
				""";
		
		try (Connection conn = model.DBUtil.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();){
			while (rs.next()) {
				System.out.println("ID : "+rs.getInt("rental_id"));
				System.out.println("대여인명 : "+rs.getString("name"));
				System.out.println("도서 제목 : "+rs.getString("title"));
				System.out.println("대여일 : "+rs.getObject("rental_date",LocalDateTime.class));
				System.out.println("-------------------------");
			}
			System.out.println("Print Completed");
		} catch (Exception e) {
			e.printStackTrace();
		} // try-catch ed			
	} // RentalList ed
	
	public void userRentalList(int id) {
		String sql = """ 
				select c.name,b.title,r.rental_date 
				from rental r
				inner join customer c on r.customer_id = c.customer_id
				inner join book b on r.book_id = b.book_id
				where c.customer_id = ?
				""";
		
		try (Connection conn = model.DBUtil.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);){
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			boolean found = false;
			while (rs.next()) {
				found = true;
				System.out.println("ID : "+rs.getInt("rental_id"));
				System.out.println("대여인명 : "+rs.getString("name"));
				System.out.println("도서 제목 : "+rs.getString("title"));
				System.out.println("대여일 : "+rs.getString("rental_date"));
				System.out.println("-------------------------");
			}
			if (!found) System.out.println("== 대여 내역 없음 ==");
		} catch (Exception e) {
			e.printStackTrace();
		} // try-catch ed			
	} // RentalList ed
} // DAO ed
