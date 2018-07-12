package service;

import java.util.List;

import model.BbsDto;
import model.MovieDto;

public interface BbsServiceImpl {
	
	public List<MovieDto> getMovieList();
	
	public List<MovieDto> selectMovie(String title, String genre);
	
	public List<MovieDto> genreSelectMovie(String... genre);
	
	public List<BbsDto> getBbsList(String title);
	
}
