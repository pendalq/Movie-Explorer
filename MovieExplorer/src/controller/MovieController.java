package controller;

import java.util.List;

import model.MovieDto;
import service.MovieService;
import service.MovieServiceImpl;

public class MovieController {
	
	MovieServiceImpl movieService = new MovieService();
	
	public void updateGradePoint(String title, int point) {
		movieService.updateGradePoint(title, point);
	}
	
	public List<MovieDto> getRecMovie(String title){
		return movieService.getRecMovie(title);
	}
	
	public List<MovieDto> getGradeRankList(){
		return movieService.getGradeRankingList();
	}
	
	public List<MovieDto> getGoodpointRankList(){
		return movieService.getGoodpointRankingList();
	}
	
	public List<MovieDto> nowScreening(){ // 현재상영작출력
		return movieService.nowScreening();
	}

}
