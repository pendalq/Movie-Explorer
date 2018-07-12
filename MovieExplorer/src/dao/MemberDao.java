package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DBClose;
import db.DBConnection;
import model.MemberDto;

public class MemberDao implements MemberDaoImpl {
	
	private String loginId; // 로그인한 아이디 저장 매체
	
	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	// TODO  로그인 함수
	@Override 
	public MemberDto login(String id, String pw) { 
		
		String sql = " SELECT ID, NAME FROM MEMBER "
				+ " WHERE ID = ? AND PW = ? ";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		MemberDto mem = null;
		
		try {
			conn = DBConnection.makeConnection();
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				mem = new MemberDto(rs.getString(1), null, rs.getString(2), null, null, null, 0, 0);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBClose.close(psmt, conn, rs);
		}
		
		return mem;
	}
	
	// TODO 회원가입 함수
	public boolean signUp(String id, String pw, String name, String email, String fg1, String fg2) { //fg1 fg2, 선호장르
		
		String sql = "INSERT INTO MEMBER VALUES(?,?,?,?,?,?,1) ";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		
		int count = 0;
		
		try {
			
			conn = DBConnection.makeConnection();
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setString(4, email);
			psmt.setString(5, fg1);
			psmt.setString(6, fg2);
			
			count = psmt.executeUpdate(); //executeUpdate 업데이트된거의 *행의갯수
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBClose.close(psmt, conn, null);
		}
		
		return count>0? true:false;
		
	}
	
	// TODO 포인트 가져오기 함수
	@Override
	public int getPoint(String id) {
		String sql = " SELECT POINT FROM MEMBER "
				+ " WHERE ID = ? ";
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		int point = 0;
		
		try {			
			conn = DBConnection.makeConnection();
			
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				point = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(psmt, conn, rs);
		}
		return point;
	}
}





































