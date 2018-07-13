package service;

import java.util.ArrayList;
import java.util.List;

import dao.MovieDao;
import dao.MovieDaoImpl;
import model.MovieDto;

public class MovieService implements MovieServiceImpl {
	
	MovieDaoImpl dao = new MovieDao();

	@Override
	public void updateGradePoint(String title, int point) {		
		double d = dao.getGradePoint(title, point);
		dao.updateGradePoint(title, d);
	}

	@Override
	public List<MovieDto> getRecMovie(String title) {
		List<String> list = dao.recommendMovie(title); 
		List<MovieDto> rmlist = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			rmlist.add(dao.getMovieDto(list.get(i)));
		}
		return rmlist;
	}

	@Override
	public List<MovieDto> getGradeRankingList() { // 영화 평점 랭킹
		List<String> list = dao.gradePoint();
		List<MovieDto> rlist = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			rlist.add(dao.getMovieDto(list.get(i)));
		}
		return rlist;
	}

	@Override
	public List<MovieDto> getGoodpointRankingList() { // 영화 추천수 랭킹
		List<String> list = dao.goodPoint();
		List<MovieDto> rlist = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			rlist.add(dao.getMovieDto(list.get(i)));
		}
		return rlist;
	}

	@Override
	public List<MovieDto> nowScreening() { // 현재상영작 출력
		return dao.nowScreening();
	}
	
	


}
