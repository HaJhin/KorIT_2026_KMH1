package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.dto.BookDto;

public class BookDao {
	
	// 1. 도서 등록
	public void insertBook(BookDto dto) {
		String sql = "insert into book(title,author,stock) values(?,?,?)";
		
		try (Connection conn = model.DBUtil.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setString(1, dto.getTitle());
			ps.setString(2, dto.getAuthor());
			ps.setInt(3, dto.getStock());
			ps.executeUpdate();
			System.out.println("INSERT SUCCESS");
		} catch (Exception e) {
			e.printStackTrace();
		} // try catch ed
	} // insertBook ed
	
	// 2. 전체 도서 조회
	public void fildAllBooks() {
		List<BookDto> list = new ArrayList<BookDto>();
		String sql = "select * from book";
		
		try (Connection conn = model.DBUtil.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();) {
			while (rs.next()) {
				System.out.println("ID : "+rs.getInt("book_id"));
				System.out.println("제목 : "+rs.getString("title"));
				System.out.println("저자 : "+rs.getString("author"));
				System.out.println("재고 : "+rs.getInt("stock"));
				System.out.println("-------------------------");
			}
			System.out.println(" == All Book printed == ");
		} catch (Exception e) {
			e.printStackTrace();
		} // try catch ed
	} // findAllBooks ed
	
	// 3. 특정 도서 조회
	public void findLowStockBook() {
		String sql = "select * from book where stock <= 2";
		try (Connection conn = model.DBUtil.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("ID : "+rs.getInt("book_id"));
				System.out.println("제목 : "+rs.getString("title"));
				System.out.println("저자 : "+rs.getString("author"));
				System.out.println("재고 : "+rs.getInt("stock"));
			}
			System.out.println(" == Search Book Completed == ");
		} catch (Exception e) {
			e.printStackTrace();
		} // try catch ed	
	} // findBook ed
	
} // DAO ed
