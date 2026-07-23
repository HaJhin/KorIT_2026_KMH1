package com.korea.petclinic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.petclinic.dao.ReservationDAO;
import com.korea.petclinic.vo.ReservationVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReservationService {
	private final ReservationDAO dao;

	public List<ReservationVO> findAll() {
		return dao.findAll();
	}

	public ReservationVO findById(Long id) {
		return dao.findById(id);
	}

	public int insert(ReservationVO vo) {
		return dao.insert(vo);
	}

	public int update(ReservationVO vo) {
		return dao.update(vo);
	}

	public int delete(Long id) {
		return dao.delete(id);
	}
	
	
}
