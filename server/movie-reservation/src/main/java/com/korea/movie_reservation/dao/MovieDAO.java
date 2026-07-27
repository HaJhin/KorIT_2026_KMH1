package com.korea.movie_reservation.dao;

import org.apache.ibatis.annotations.Mapper;

import com.korea.movie_reservation.vo.MovieVO;

@Mapper
public interface MovieDAO {
	// 영화 등록
	int insertMovie(MovieVO vo);
	// 영화 id로 조회
	MovieVO findByMovieId(int movieId);

}
