package controller;

import javax.swing.JOptionPane;

import model.MemberDto;
import service.MemberService;
import service.MemberServiceImpl;

public class MemberController {
	
	MemberServiceImpl mService = new MemberService();
	
	//로그인 함수
	public void loginCheck(MemberDto dto) {
		MemberDto reDto = mService.login(dto.getId(), dto.getPwd());
		if(reDto != null) {
			JOptionPane.showMessageDialog(null, reDto.getName() + " 님 환영합니다!");
		}else if(reDto == null) {
			JOptionPane.showMessageDialog(null, "로그인 실패, 아이디와 비밀번호를 확인해주세요.");
		}
	}
	
	// 회원가입 함수
	public void SignUp(String id, String pw, String name, String email, String fg1, String fg2) {
		
		mService.signUp(id, pw, name, email, fg1, fg2);
	}	
	
	//포인트 가져오기 함수
	public int getPoint(String id) {
		return mService.getPoint(id);
	}
}
































