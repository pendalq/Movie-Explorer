package dao;

import java.util.List;

import model.BbsDto;
import model.MovieDto;

public interface BbsDaoImpl {
	
	public List<MovieDto> getMovieList();
	
	public List<MovieDto> selectMovie(String title, String genre);
	
	public List<MovieDto> genreSelectMovie(String... genre);
	
	public List<BbsDto> getBbsList(String title);
	
}	
