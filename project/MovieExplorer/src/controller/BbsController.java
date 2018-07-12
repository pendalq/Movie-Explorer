package controller;

import java.util.List;

import model.BbsDto;
import model.MovieDto;
import service.BbsService;
import service.BbsServiceImpl;

public class BbsController {
	BbsServiceImpl bService = new BbsService();
	
	public List<MovieDto> getMovieList(){ // 게시판 리스트 전체 불러오기 함수
		return bService.getMovieList();
	}
	
	public List<MovieDto> selectMovie(String title, String genre){ // 초이스 제목,장르 검색
		return bService.selectMovie(title, genre);
	}
	
	public List<MovieDto> genreSelectMovie(String... genre){  // 체크박스 장르 선택 검색 될지안될지 미정.
		return bService.genreSelectMovie(genre);
	}
	
	public List<BbsDto> getBbsList(String title){
		return bService.getBbsList(title);
	}
}
