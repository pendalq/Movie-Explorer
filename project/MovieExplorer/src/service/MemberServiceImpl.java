package service;

import model.MemberDto;

public interface MemberServiceImpl {

	public MemberDto login(String id, String pw);
	
	public String getLoginId();
	
	public void setLoginId(String loginId);
	
	public boolean signUp(String id, String pw, String name, String email, String fg1, String fg2);
	
	public int getPoint(String id);
}
