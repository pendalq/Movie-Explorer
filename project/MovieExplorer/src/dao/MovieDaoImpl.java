package dao;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import model.MovieDto;

public interface MovieDaoImpl {
	
	public double getGradePoint(String title, int point);
	
	public void updateGradePoint(String title, double gradepoint);
	
	public List<String> recommendMovie(String title);
	
	public MovieDto getMovieDto(String title);
	
	public List<String> gradePoint(); // 메인뷰 영화 평점 랭킹
	
	public List<String> goodPoint(); // 메인뷰 영화 추천 랭킹
	
	public List<MovieDto> nowScreening(); // 현재상영작출력
}
