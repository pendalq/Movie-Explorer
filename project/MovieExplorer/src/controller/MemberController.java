package controller;

import javax.swing.JOptionPane;

import model.MemberDto;
import service.MemberService;
import service.MemberServiceImpl;
import view.accountView;
import view.loginView;
import view.mainView;

public class MemberController {
	
	MemberServiceImpl mService = new MemberService();
	
	public void openLoginView() {
		new loginView();
	}
	
	public void openSignup() {
		new accountView();
	}
	
	//로그인 함수
	public void loginCheck(MemberDto dto) {
		MemberDto reDto = mService.login(dto.getId(), dto.getPwd());
		if(reDto != null) {
			new mainView();
			JOptionPane.showMessageDialog(null, reDto.getName() + " 님 환영합니다!");
		}else if(reDto == null) {
			JOptionPane.showMessageDialog(null, "로그인 실패, 아이디와 비밀번호를 확인해주세요.");
			this.openLoginView();
		}
	}
	
	// 회원가입 함수
	public void SignUp(String id, String pw, String name, String email, String fg1, String fg2) {
		
		boolean b = mService.signUp(id, pw, name, email, fg1, fg2);
		if(b) {
			JOptionPane.showMessageDialog(null, "성공적으로 가입되었습니다.");
			this.openLoginView();
		}else {
			JOptionPane.showMessageDialog(null, "회원가입에 실패하였습니다.");
			this.openSignup();
		}
	}	
	
	//포인트 가져오기 함수
	public int getPoint(String id) {
		return mService.getPoint(id);
	}
}
































