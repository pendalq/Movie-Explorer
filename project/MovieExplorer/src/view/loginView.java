package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class loginView extends JFrame implements ActionListener{
	
	private JTextField idTf;
	private JPasswordField pwTf;
	private JButton loginBtn;
	private JButton accountBtn;
	private JButton nonMemberBtn;
	
	public loginView() {
		super("MOVIE EXPLORER");
		setLayout(null);
		
		JLabel titleLabel=new JLabel("MOVIE EXPLORER");
		titleLabel.setBounds(205, 220, 150, 20);
		add(titleLabel);
		
		JLabel loginLabel=new JLabel("ID: ");
		loginLabel.setBounds(95, 280, 67, 15);
		add(loginLabel);
		
		idTf=new JTextField();
		idTf.setBounds(165, 280, 150, 20);
		add(idTf);
		
		JLabel pwLabel=new JLabel("PW: ");
		pwLabel.setBounds(95, 330, 67, 15);
		add(pwLabel);
		
		pwTf=new JPasswordField();
		pwTf.setBounds(165, 330, 150, 20);
		add(pwTf);
		
		loginBtn=new JButton("로그인");
		loginBtn.setBounds(380, 282, 70, 65);
		loginBtn.addActionListener(this);
		loginBtn.setBackground(Color.WHITE);
		loginBtn.setOpaque(false);
		add(loginBtn);
		
		
		accountBtn=new JButton("회원가입");
		accountBtn.setBounds(120, 400, 90, 45);
		accountBtn.addActionListener(this);
		accountBtn.setBackground(Color.white);
		accountBtn.setOpaque(false);
		add(accountBtn);
		
		nonMemberBtn=new JButton("비회원");
		nonMemberBtn.setBounds(300, 400, 90, 45);
		nonMemberBtn.setBackground(Color.WHITE);
		nonMemberBtn.setOpaque(false);
		add(nonMemberBtn);
		
		setBounds(0, 0, 550, 650);
		getContentPane().setBackground(new Color(204, 255, 204));
		setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {				
				System.exit(0);				
			}
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn=(JButton)e.getSource();
		
		if(btn==loginBtn) {
			
		}else if(btn==accountBtn) {
			new accountView();
		}else if(btn==nonMemberBtn) {
			new mainView();
		}
		this.dispose();
		
	}

}
