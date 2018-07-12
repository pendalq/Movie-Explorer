package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class accountUpdateView extends JFrame implements ActionListener{	
	private JTextField pwTf;
	private JTextField idTf;
	private JTextField nameTf;
	private JTextField emailTf;
	
	private JComboBox<String> genreChoice;
	private JComboBox<String> genreChoice2;
	
	private JButton update;
	private JButton back;
	
	public accountUpdateView() {
		super("회원정보 수정");
		setLayout(null);
		
		JLabel idLabel= new JLabel("ID:");
		idLabel.setBounds(130, 50, 50, 25);
		add(idLabel);
		
		idTf=new JTextField();
		idTf.setBounds(190, 50, 150, 25);
		idTf.setEditable(false);
		add(idTf);
		
		JLabel pwLabel=new JLabel("PW:");
		pwLabel.setBounds(130, 95, 50, 25);
		add(pwLabel);
		
		pwTf=new JTextField();
		pwTf.setBounds(190, 95, 150, 25);
		add(pwTf);
		
		JLabel nameLabel=new JLabel("이름:");
		nameLabel.setBounds(130, 140, 50, 25);
		add(nameLabel);
		
		nameTf=new JTextField();
		nameTf.setBounds(190, 140, 150, 25);
		nameTf.setEditable(false);
		add(nameTf);
		
		JLabel emailLabel=new JLabel("E-mail:");
		emailLabel.setBounds(130, 185, 50, 25);
		add(emailLabel);
		
		emailTf=new JTextField();
		emailTf.setBounds(190, 185, 150, 25);
		emailTf.setEditable(false);
		add(emailTf);
		
		JLabel genre1=new JLabel("선호장르 1");
		genre1.setBounds(100, 300, 70, 30);
		add(genre1);
		
		String[] selects=new String[] {"선택안함","액션","코미디","공포","로맨스코미디",
				"로맨스","드라마","SF","범죄","미스터리","스릴러"};
		genreChoice=new JComboBox<>(selects);
		genreChoice.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					Object item=e.getItem();
				}
			}
		});
		genreChoice.setBounds(180, 300, 120, 30);
		add(genreChoice);
		
		
		
		JLabel genre2=new JLabel("선호장르 2");
		genre2.setBounds(100, 350, 70, 30);
		add(genre2);
		
		String[] selects2=new String[] {"선택안함","액션","코미디","공포","로맨스코미디",
				"로맨스","드라마","SF","범죄","미스터리","스릴러"};
		genreChoice2=new JComboBox<>(selects2);
		genreChoice2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					Object item2=e.getItem();
				}
			}
		});
		genreChoice2.setBounds(180, 350, 120, 30);
		add(genreChoice2);
		
	
		
		update=new JButton("수정완료");
		update.addActionListener(this);
		update.setBackground(Color.WHITE);
		update.setOpaque(false);
		update.setBounds(130, 440, 90, 45);
		add(update);
		
		back=new JButton("뒤로가기");
		back.addActionListener(this);
		back.setBackground(Color.WHITE);
		back.setOpaque(false);
		back.setBounds(265, 440, 90, 45);
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
			
			
			this.dispose();
			new loginView();
		}else if(obj==back) {
			
			this.dispose();
			new mypageView();
		}
		
	}
}
