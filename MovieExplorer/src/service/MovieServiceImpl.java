package service;

import java.util.List;

import model.MovieDto;

public interface MovieServiceImpl {

	public void updateGradePoint(String title, int point);
	
	public List<MovieDto> getRecMovie(String title);
	
	public List<MovieDto> getGradeRankingList();
	
	public List<MovieDto> getGoodpointRankingList();
	
	public List<MovieDto> nowScreening(); // 현재상영작출력
	
}
