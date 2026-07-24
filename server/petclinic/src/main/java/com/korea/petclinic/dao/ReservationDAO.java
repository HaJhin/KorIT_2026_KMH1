package com.korea.petclinic.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.korea.petclinic.vo.ReservationVO;

@Mapper
public interface ReservationDAO {
	List<ReservationVO> findAll();
	
	ReservationVO findById(Long id);

	int insert(ReservationVO vo);

	int update(ReservationVO vo);

	int delete(Long id);
	
	List<ReservationVO> search(String type, String keyword);

	List<ReservationVO> sort(String sort);

	int totalPrice();

	List<ReservationVO> statusCount();
}
