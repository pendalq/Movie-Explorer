package service;

import dao.MovieDao;
import dao.MovieDaoImpl;

public class MovieService implements MovieServiceImpl {
	
	MovieDaoImpl dao = new MovieDao();

	@Override
	public void updateGradePoint(String title, int point) {		
		double d = dao.getGradePoint(title, point);
		dao.updateGradePoint(title, d);
	}


}
