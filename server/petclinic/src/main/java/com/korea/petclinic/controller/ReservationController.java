package com.korea.petclinic.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.korea.petclinic.service.ReservationService;
import com.korea.petclinic.vo.ReservationVO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/reservations")
@RequiredArgsConstructor
public class ReservationController {
	private final ReservationService reservationService;
	
	@GetMapping
	public List<ReservationVO> findAll() {
		return reservationService.findAll();
	}
		
	@GetMapping("{id}")
	public ReservationVO findById(@PathVariable Long id) {
		return reservationService.findById(id);
	}
	
	@PostMapping
	public int insert(@RequestBody ReservationVO vo) {
		return reservationService.insert(vo);
	}
	
	@PutMapping("{id}")
	public int update(@PathVariable Long id, @RequestBody ReservationVO vo) {
		vo.setId(id);
		return reservationService.update(vo);
	}
	
	@DeleteMapping("{id}")
	public int delete(@PathVariable Long id) {
		return reservationService.delete(id);
	}
	
	@GetMapping("/search-detail")
	public List<ReservationVO> search(@RequestParam String type, @RequestParam String keyword) {
		return reservationService.search(type,keyword);
	}
	
	// 진료 예약 정보를 예산 진료비 순으로 정렬
	@GetMapping("/sort")
	public List<ReservationVO> sort(@RequestParam(required = false) String sort) {
		return reservationService.sort(sort);
	}
	
	@GetMapping("/total-price")
	public int totalPrice() {
		return reservationService.totalPrice();
	}
	
	@GetMapping("status-count")
	public List<ReservationVO> statusCount() {
		return reservationService.statusCount();
	}
}
