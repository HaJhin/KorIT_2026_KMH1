package com.korea.movie_reservation.service;

import org.springframework.stereotype.Service;

import com.korea.movie_reservation.dao.MovieDAO;
import com.korea.movie_reservation.vo.MovieVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieService {
	private final MovieDAO movieDAO;

	public String insertMovie(MovieVO vo) {
		int result = movieDAO.insertMovie(vo);
		if (result == 1) {
			return "영화 등록 성공";
		} else return "영화 등록 실패";
	}

	public MovieVO findByMovieId(int movieId) {
		return movieDAO.findByMovieId(movieId);
	}
	
}
