package com.korea.movie_reservation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.movie_reservation.dao.ReservationDAO;
import com.korea.movie_reservation.vo.ReservationVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReservationService {
	private final ReservationDAO reservationDAO;
	
	public String insertReservation(ReservationVO vo) {
		int result = reservationDAO.insertReservation(vo);
		if (result == 1) {
			return "예매 등록 성공";
		} else return "예매 등록 실패";
	}

	public String updateReservation(ReservationVO vo) {
		int result = reservationDAO.updateReservation(vo);
		if (result == 1) {
			return "예매 수정 성공";
		} else return "예매 수정 실패";
	}

	public List<ReservationVO> findReservationDetails() {
		return reservationDAO.findReservationDetails();
	}
}
