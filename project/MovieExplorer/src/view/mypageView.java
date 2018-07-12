package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mypageView extends JFrame implements ActionListener{
	JButton update;
	JButton back;
	
	public mypageView() {
		super("마이페이지");
		setLayout(null);
		
		JLabel idLabel=new JLabel("ID:");
		idLabel.setBounds(160, 50, 80, 35);
		add(idLabel);
		
		JLabel memberId=new JLabel("label");
		memberId.setBounds(275, 50, 150, 35);
		add(memberId);
		
		JLabel nameLabel=new JLabel("이름:");
		nameLabel.setBounds(160, 120, 80, 35);
		add(nameLabel);
		
		JLabel memberName=new JLabel("label");
		memberName.setBounds(275, 120, 150, 35);
		add(memberName);
		
		JLabel emailLabel=new JLabel("E-mail:");
		emailLabel.setBounds(160, 190, 80, 35);
		add(emailLabel);
		
		JLabel memberEmail=new JLabel("label");
		memberEmail.setBounds(275, 190, 150, 35);
		add(memberEmail);
		
		JLabel genreLabel=new JLabel("선택 장르 1:");
		genreLabel.setBounds(160, 260, 80, 35);
		add(genreLabel);
		
		JLabel memberGenre=new JLabel("label");
		memberGenre.setBounds(275, 260, 150, 35);
		add(memberGenre);
		
		JLabel genreLabel2=new JLabel("선택 장르 2:");
		genreLabel2.setBounds(160, 330, 80, 35);
		add(genreLabel2);
		
		JLabel memberGenre2=new JLabel("label");
		memberGenre2.setBounds(275, 330, 150, 35);
		add(memberGenre2);
		
		update=new JButton("회원정보 수정");
		update.setBounds(130, 440, 120, 45);
		update.setBackground(Color.WHITE);
		update.setOpaque(false);
		update.addActionListener(this);
		add(update);
		
		back=new JButton("뒤로가기");
		back.setBounds(275, 440, 120, 45);
		back.setBackground(Color.WHITE);
		back.setOpaque(false);
		back.addActionListener(this);
		add(back);
		
		
		
		
		setBounds(0, 0, 550, 650);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {				
				System.exit(0);				
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		
		if(obj==update) {
			new accountUpdateView();
			this.dispose();
		}else if(obj==back) {
			new mainView();
			this.dispose();
		}
		
	}

}
