package com.korea.movie_reservation.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.movie_reservation.service.ReservationService;
import com.korea.movie_reservation.vo.ReservationVO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/reservation")
@RequiredArgsConstructor
public class ReservationController {
	private final ReservationService reservationService;
	
	@PostMapping
	public String insertReservation(@RequestBody ReservationVO vo) {
		return reservationService.insertReservation(vo);
	}
	
	@PutMapping("{reservationId}")
	public String updateReservation(@PathVariable int reservationId,@RequestBody ReservationVO vo) {
		vo.setReservationId(reservationId);
		return reservationService.updateReservation(vo);
	}
	
	@GetMapping("/details")
	public List<ReservationVO> findReservationDetails() {
		return reservationService.findReservationDetails();
	}
}
