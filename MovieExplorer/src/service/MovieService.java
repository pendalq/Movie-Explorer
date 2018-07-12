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
			rmlist.add(dao.getRecMovieDto(list.get(i)));
		}
		return rmlist;
	}
	
	


}
