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
}
