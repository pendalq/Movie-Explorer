package dao;

import java.util.List;

import model.BbsDto;
import model.MovieDto;

public interface BbsDaoImpl {
	
	public List<MovieDto> getMovieList();
	
	public List<MovieDto> selectMovie(String title, String genre);
	
	public List<MovieDto> genreSelectMovie(String... genre);
	
	public List<BbsDto> getBbsList(String title);
	
	public List<BbsDto> selectReview(String title);
	
	public void deleteReview(int seq); // 리뷰 삭제  DEL = 0 삭제 삭제하기버튼
	
	public void updateComplete(int seq, String title, String Content); // 수정완료 버튼
	
	public int getRecommend(int seq);
	
	public boolean updateRecommend(int seq, int reco); // 리뷰 게시판 추천버튼
	
}	
