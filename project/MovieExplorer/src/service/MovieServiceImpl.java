package service;

import java.util.List;

import model.MovieDto;

public interface MovieServiceImpl {

	public void updateGradePoint(String title, int point);
	
	public List<MovieDto> getRecMovie(String title);
	
	
}
