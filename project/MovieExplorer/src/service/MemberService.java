package service;

import dao.MemberDao;
import dao.MemberDaoImpl;
import model.MemberDto;

public class MemberService implements MemberServiceImpl {
	
	MemberDaoImpl dao = new MemberDao();

	@Override // 로그인함수
	public MemberDto login(String id, String pw) {
		return dao.login(id, pw);
	}
	
	

	@Override
	public String getLoginId() {
		return dao.getLoginId();
	}

	@Override
	public void setLoginId(String loginId) {
		dao.setLoginId(loginId);
	}



	@Override // 회원가입 함수
	public boolean signUp(String id, String pw, String name, String email, String fg1, String fg2) {
		return dao.signUp(id, pw, name, email, fg1, fg2);
	}



	@Override
	public int getPoint(String id) {		
		return dao.getPoint(id);
	}
}
