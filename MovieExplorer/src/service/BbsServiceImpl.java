package service;

import java.util.List;

import model.BbsDto;
import model.MovieDto;

public interface BbsServiceImpl {
	
	public List<MovieDto> getMovieList();
	
	public List<MovieDto> selectMovie(String title, String genre);
	
	public List<MovieDto> genreSelectMovie(String... genre);
	
	public List<BbsDto> getBbsList(String title);
	
	public List<BbsDto> selectReview(String title);
	
	public void deleteReview(int seq); // 리뷰 삭제  DEL = 0 삭제
	
	public void updateComplete(int seq, String title, String Content); // 수정완료 버튼
	
	public void updateRecommend(int seq); // 리뷰 게시판 추천버튼
	
	public void writeReview(String title, String id, String rTitle, String rContent); // 리뷰 글쓰기
	
	public List<BbsDto> selectWriterReview(String name); // 리뷰 작성자로 검색
}
