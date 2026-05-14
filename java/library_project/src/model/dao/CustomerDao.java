package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.dto.CustomerDto;

public class CustomerDao {
	
	// 회원 등록 기능
	public void insertCustomer(CustomerDto dto) {
		String sql = "insert into customer(name,phone) values(?,?)";
		
		try (Connection conn = model.DBUtil.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getPhone());
			ps.executeUpdate();
			System.out.println("INSERT SUCCESS");
		} catch (Exception e) {
			e.printStackTrace();
		} // try catch ed
	} // insertCustomer ed
	
	
} // DAO ed
