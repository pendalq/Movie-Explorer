package dao;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import model.MovieDto;

public interface MovieDaoImpl {
	
	public double getGradePoint(String title, int point);
	
	public void updateGradePoint(String title, double gradepoint);
	
	public List<String> recommendMovie(String title);
	
	public MovieDto getRecMovieDto(String title);
}
