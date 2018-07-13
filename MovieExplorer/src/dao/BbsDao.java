package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import db.DBClose;
import db.DBConnection;
import model.BbsDto;
import model.MovieDto;

public class BbsDao implements BbsDaoImpl {

	@Override // 영화 목록 리스트 전체 불러오기 함수
	public List<MovieDto> getMovieList() {
		String sql = " SELECT TITLE, DIRECTOR, ACTOR_1, ACTOR_2, ACTOR_3, ACTOR_4, "
				+ " SYNOP, GOOD_POINT, GENRE_1, GENRE_2, GRADE_POINT, " + " NOW_SCREENING FROM MOVIE ";

		List<MovieDto> list = new ArrayList<>();

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		try {
			conn = DBConnection.makeConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				int i = 1;
				list.add(new MovieDto(rs.getString(i++), rs.getString(i++), rs.getString(i++), rs.getString(i++),
						rs.getString(i++), rs.getString(i++), rs.getString(i++), rs.getInt(i++), rs.getString(i++),
						rs.getString(i++), rs.getDouble(i++), rs.getInt(i++)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(psmt, conn, rs);
		}

		return list;
	}

	@Override // 영화 목록 게시판 제목, 장르 검색
	public List<MovieDto> selectMovie(String title, String genre) {

		String sql = " SELECT TITLE, DIRECTOR, ACTOR_1, ACTOR_2, ACTOR_3, ACTOR_4, "
				+ " SYNOP, GOOD_POINT, GENRE_1, GENRE_2, GRADE_POINT, "
				+ " NOW_SCREENING FROM MOVIE WHERE GENRE = ? AND TITLE LIKE(%" + title + "%) ";
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		List<MovieDto> list = new ArrayList<>();

		try {

			conn = DBConnection.makeConnection();
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, genre);

			rs = psmt.executeQuery();

			while (rs.next()) {
				int i = 1;
				list.add(new MovieDto(rs.getString(i++), rs.getString(i++), rs.getString(i++), rs.getString(i++),
						rs.getString(i++), rs.getString(i++), rs.getString(i++), rs.getInt(i++), rs.getString(i++),
						rs.getString(i++), rs.getDouble(i++), rs.getInt(i++)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override // 될지안될지 모름 ㅎ 장르 체크박스 검색
	public List<MovieDto> genreSelectMovie(String... genre) {

		String sql = " SELECT TITLE, DIRECTOR, ACTOR_1, ACTOR_2, ACTOR_3, ACTOR_4, SYNOP, GOOD_POINT, GENRE_1, GENRE_2, GRADE_POINT, NOW_SCREENING "
				+ " FROM MOVIE WHERE GENRE_1 = ?";

		int size = genre.length;
		int w = 0;
		while (w < size - 1) {
			sql += ", ?";
		}

		sql += " AND GENRE_2 = ?";

		w = 0;
		while (w < size - 1) {
			sql += ",? ";
		}

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		try {
			conn = DBConnection.makeConnection();
			psmt = conn.prepareStatement(sql);
			w = 0;
			while (w < size) {
				psmt.setString(w + 1, genre[w]);
				psmt.setString(w + size + 1, genre[w]);
			}
			rs = psmt.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(psmt, conn, rs);
		}

		return null;
	}

	@Override
	public List<BbsDto> getBbsList(String title) { // 리뷰 게시판 리스트가져오기
		String sql = " SELECT SEQ_NUM, TITLE, REVIEW_TITLE, REVIEW_CONTENT, ID, RECOMMEND, VIEWS,  "
				+ " WRITEDATE, DEL FROM REVIEW WHERE TITLE = '" + title + "' ";

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		List<BbsDto> list = new ArrayList<>();

		try {
			conn = DBConnection.makeConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				list.add(new BbsDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getInt(9)));
			}
			rs = psmt.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(psmt, conn, rs);
		}

		return list;
	}

	@Override
	public List<BbsDto> selectReview(String title) { // 리뷰 제목으로 검색

		String sql = " SELECT SEQ_NUM, TITLE, REVIEW_TITLE, REVIEW_CONTENT, ID, RECOMMEND, VIEWS,  "
				+ " WRITEDATE, DEL FROM REVIEW WHERE TITLE LIKE '%" + title + "%' ";

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		List<BbsDto> list = new ArrayList<>();
		try {
			conn = DBConnection.makeConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				list.add(new BbsDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getInt(9)));
			}
			rs = psmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(psmt, conn, rs);
		}

		return list;
	}

	@Override
	public void deleteReview(int seq) { // 리뷰 삭제 DEL = 1 삭제 / 삭제하기버튼

		String sql = " UPDATE REVIEW SET DEL = 1 WHERE SEQ_NUM = " + seq;

		Connection conn = null;
		PreparedStatement psmt = null;

		conn = DBConnection.makeConnection();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(psmt, conn, null);
		}
	}

	@Override
	public void updateComplete(int seq, String title, String Content) {// 수정 완료버튼

		String sql = " UPDATE REVIEW SET REVIEW_TITLE = '" + title + "', REVIEW_CONTENT = '" + Content + "' "
				+ " WHERE SEQ_NUM = " + seq;

		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			conn = DBConnection.makeConnection();
			psmt = conn.prepareStatement(sql);
			psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(psmt, conn, null);
		}

	}

	@Override
	public void updateRecommend(int seq) { // 리뷰 게시판 추천버튼

		String sql = " UPDATE REVIEW SET RECOMMEND = " + 1 + " WHERE SEQ_NUM = " + seq;

		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			conn = DBConnection.makeConnection();
			psmt = conn.prepareStatement(sql);
			psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(psmt, conn, null);
		}
	}

	@Override
	public void writeReview(String title, String id, String rTitle, String rContent) { // 리뷰 게시판 작성 
		
		String sql = " INSERT INTO REVIEW "
				+ " VALUES (SEQ_NUM.NEXTVAL, ? , ? , ? , ? , 0 , 0 , SYSDATE , 0) ";
		
		Connection conn =null;
		PreparedStatement psmt = null;
		
		
		try {
			conn = DBConnection.makeConnection();
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, title);
			psmt.setString(2, id);
			psmt.setString(3, rTitle);
			psmt.setString(4, rContent);
			
			psmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(psmt, conn, null);
		}
		
	}

}





























