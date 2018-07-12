package service;

import java.util.List;

import dao.BbsDao;
import dao.BbsDaoImpl;
import model.BbsDto;
import model.MovieDto;

public class BbsService implements BbsServiceImpl{
	BbsDaoImpl dao = new BbsDao();

	@Override // 게시판 리스트 전체 불러오기 함수
	public List<MovieDto> getMovieList() { 
		return dao.getMovieList();
	}

	@Override // 게시판 장르,제목 검색된 리스트
	public List<MovieDto> selectMovie(String title, String genre) {
		return dao.selectMovie(title, genre);
	}

	@Override // 될지안될지모름.. 장르 체크박스 선택 검색
	public List<MovieDto> genreSelectMovie(String... genre) {
		return dao.genreSelectMovie(genre);
	}

	@Override
	public List<BbsDto> getBbsList(String title) {
		return dao.getBbsList(title);
	}
	
	
}
