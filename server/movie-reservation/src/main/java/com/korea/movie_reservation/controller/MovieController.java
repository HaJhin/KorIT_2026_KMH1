package com.korea.movie_reservation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.movie_reservation.service.MovieService;
import com.korea.movie_reservation.vo.MovieVO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/movie")
@RequiredArgsConstructor
public class MovieController {
	private final MovieService movieService;
	
	@PostMapping
	public String insertMovie(@RequestBody MovieVO vo) {
		return movieService.insertMovie(vo);
	}
	
	@GetMapping("{movieId}")
	public MovieVO findByMovieId(@PathVariable int movieId) {
		return movieService.findByMovieId(movieId);
	}
}
