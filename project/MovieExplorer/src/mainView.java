package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

public class mainView extends JFrame implements ActionListener{

	private JScrollPane scrollPane;
	JButton btn1, btn2, btn3, btn4, 
	kbtn1,kbtn2,kbtn3,kbtn4,kbtn5,kbtn6,kbtn7,kbtn8,kbtn9,kbtn10,
	kbtn11,kbtn12,kbtn13,kbtn14,kbtn15,kbtn16,kbtn17,kbtn18,kbtn19,kbtn20,
	imgbtn1,imgbtn2,imgbtn3,imgbtn4,imgbtn5,imgbtn6,imgbtn7,imgbtn8;
	JLabel label1, label2, label3, label4, label5, label6, label7,label8, label9,label10, label11,
	//aRlabel1,aRlabel2,aRlabel3,aRlabel4,aRlabel5,aRlabel6,aRlabel7,aRlabel8,aRlabel9,aRlabel10,
	//Rlabel1,Rlabel2,Rlabel3,Rlabel4,Rlabel5,Rlabel6,Rlabel7,Rlabel8,Rlabel9,Rlabel10,
	slabel1,slabel2,slabel3,slabel4,slabel5,slabel6,slabel7,slabel8,slabel9,slabel10,
	slabel11,slabel12,slabel13,slabel14,slabel15,slabel16,slabel17,slabel18,slabel19,slabel20;
	JPanel panel;
	
	
	public mainView() {
		super("main");
		
		setLayout(null);
	
		JScrollBar  jscbar = new JScrollBar();
		jscbar.setBounds(150, 150, 200, 200);
		
		
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(Color.BLACK));
		panel.setBounds(0, 150, 540, 520);		
		panel.add(jscbar);
		add(panel);
		/*JScrollPane scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBorder(new LineBorder(Color.BLACK));
		scrollPane.setBounds(0,150,540,520);
		add(scrollPane);*/
		
		
		label1 = new JLabel("movie");
		label1.setBounds(280, 10, 80, 40);
		add(label1);
		
		label2 = new JLabel("[등급] ID");
		label2.setBounds(550, 10, 70, 40);
		add(label2);
		
		label3 = new JLabel("보유 Point :");
		label3.setBounds(550, 30, 70, 40);
		add(label3);
		
		label4 = new JLabel("* 현재 상영작 ");
		label4.setBounds(20, 120, 80, 40);
		add(label4);
		
		
		
		
		label5 = new JLabel("* 평점 Ranking ");
		label5.setBounds(550, 120, 100, 40);
		add(label5);
		
		kbtn1 = new JButton("영화이름");
		kbtn1.setBounds(540, 145, 100, 30);
		kbtn1.setBorderPainted(false);
		kbtn1.setContentAreaFilled(false);
		kbtn1.setFocusPainted(false);
		add(kbtn1);
		
		kbtn2 = new JButton("영화이름");
		kbtn2.setBounds(540, 170, 100, 30);
		kbtn2.setBorderPainted(false);
		kbtn2.setContentAreaFilled(false);
		kbtn2.setFocusPainted(false);
		add(kbtn2);
		
		kbtn3 = new JButton("영화이름");
		kbtn3.setBounds(540, 195, 100, 30);
		kbtn3.setBorderPainted(false);
		kbtn3.setContentAreaFilled(false);
		kbtn3.setFocusPainted(false);
		add(kbtn3);
		
		kbtn4 = new JButton("영화이름");
		kbtn4.setBounds(540, 220, 100, 30);
		kbtn4.setBorderPainted(false);
		kbtn4.setContentAreaFilled(false);
		kbtn4.setFocusPainted(false);
		add(kbtn4);
		
		kbtn5 = new JButton("영화이름");
		kbtn5.setBounds(540, 245, 100, 30);
		kbtn5.setBorderPainted(false);
		kbtn5.setContentAreaFilled(false);
		kbtn5.setFocusPainted(false);
		add(kbtn5);
		
		kbtn6 = new JButton("영화이름");
		kbtn6.setBounds(540, 270, 100, 30);
		kbtn6.setBorderPainted(false);
		kbtn6.setContentAreaFilled(false);
		kbtn6.setFocusPainted(false);
		add(kbtn6);
		
		kbtn7 = new JButton("영화이름");
		kbtn7.setBounds(540, 295, 100, 30);
		kbtn7.setBorderPainted(false);
		kbtn7.setContentAreaFilled(false);
		kbtn7.setFocusPainted(false);
		add(kbtn7);
		
		kbtn8 = new JButton("영화이름");
		kbtn8.setBounds(540, 320, 100, 30);
		kbtn8.setBorderPainted(false);
		kbtn8.setContentAreaFilled(false);
		kbtn8.setFocusPainted(false);
		add(kbtn8);
		
		kbtn9 = new JButton("영화이름");
		kbtn9.setBounds(540, 345, 100, 30);
		kbtn9.setBorderPainted(false);
		kbtn9.setContentAreaFilled(false);
		kbtn9.setFocusPainted(false);
		add(kbtn9);
		
		kbtn10 = new JButton("영화이름");
		kbtn10.setBounds(540, 370, 100, 30);
		kbtn10.setBorderPainted(false);
		kbtn10.setContentAreaFilled(false);
		kbtn10.setFocusPainted(false);
		add(kbtn10);
		
		
		/*aRlabel1 = new JLabel("1");
		aRlabel1.setBounds(560, 145, 100, 30);
		add(aRlabel1);*/
		
		
		label6 = new JLabel("* 추천 Ranking"); 
		label6.setBounds(550, 390, 100, 40);
		add(label6);
		
		kbtn11 = new JButton("영화이름");
		kbtn11.setBounds(540, 415, 100, 30);
		kbtn11.setBorderPainted(false);
		kbtn11.setContentAreaFilled(false);
		kbtn11.setFocusPainted(false);
		add(kbtn11);
		
		kbtn12 = new JButton("영화이름");
		kbtn12.setBounds(540, 440, 100, 30);
		kbtn12.setBorderPainted(false);
		kbtn12.setContentAreaFilled(false);
		kbtn12.setFocusPainted(false);
		add(kbtn12);
		
		kbtn13 = new JButton("영화이름");
		kbtn13.setBounds(540, 465, 100, 30);
		kbtn13.setBorderPainted(false);
		kbtn13.setContentAreaFilled(false);
		kbtn13.setFocusPainted(false);
		add(kbtn13);
		
		kbtn14 = new JButton("영화이름");
		kbtn14.setBounds(540, 490, 100, 30);
		kbtn14.setBorderPainted(false);
		kbtn14.setContentAreaFilled(false);
		kbtn14.setFocusPainted(false);
		add(kbtn14);
		
		kbtn15 = new JButton("영화이름");
		kbtn15.setBounds(540, 515, 100, 30);
		kbtn15.setBorderPainted(false);
		kbtn15.setContentAreaFilled(false);
		kbtn15.setFocusPainted(false);
		add(kbtn15);
		
		kbtn16 = new JButton("영화이름");
		kbtn16.setBounds(540, 540, 100, 30);
		kbtn16.setBorderPainted(false);
		kbtn16.setContentAreaFilled(false);
		kbtn16.setFocusPainted(false);
		add(kbtn16);
		
		kbtn17 = new JButton("영화이름");
		kbtn17.setBounds(540, 565, 100, 30);
		kbtn17.setBorderPainted(false);
		kbtn17.setContentAreaFilled(false);
		kbtn17.setFocusPainted(false);
		add(kbtn17);
		
		kbtn18 = new JButton("영화이름");
		kbtn18.setBounds(540, 590, 100, 30);
		kbtn18.setBorderPainted(false);
		kbtn18.setContentAreaFilled(false);
		kbtn18.setFocusPainted(false);
		add(kbtn18);
		
		kbtn19 = new JButton("영화이름");
		kbtn19.setBounds(540, 615, 100, 30);
		kbtn19.setBorderPainted(false);
		kbtn19.setContentAreaFilled(false);
		kbtn19.setFocusPainted(false);
		add(kbtn19);
		
		kbtn20 = new JButton("영화이름");
		kbtn20.setBounds(540, 640, 100, 30);
		kbtn20.setBorderPainted(false);
		kbtn20.setContentAreaFilled(false);
		kbtn20.setFocusPainted(false);
		add(kbtn20);
		
	
		
		label7 = new JLabel();
		label7.setBorder(new LineBorder(Color.BLACK));
		label7.setBounds(0, 125, 700, 1);
		add(label7);
		
		label8 = new JLabel();
		label8.setBorder(new LineBorder(Color.black));
		label8.setBounds(540, 125, 1, 570);
		add(label8);
		
		label9 = new JLabel();
		label9.setBorder(new LineBorder(Color.black));
		label9.setBounds(540, 400, 650, 1);
		add(label9);
		
		label10 = new JLabel("1");
		label10.setBounds(620, 15, 60, 30);
		add(label10);
		
		label11 = new JLabel("1");
		label11.setBounds(620, 35, 60, 30);
		add(label11);
		
		
		
		slabel1 = new JLabel("1");		// 번호
		slabel1.setBounds(545, 145, 10, 30);
		add(slabel1);
		
		slabel2 = new JLabel("2");
		slabel2.setBounds(545, 170, 10, 30);
		add(slabel2);
		
		slabel3 = new JLabel("3");
		slabel3.setBounds(545, 195, 10, 30);
		add(slabel3);
		
		slabel4 = new JLabel("4");
		slabel4.setBounds(545, 220, 10, 30);
		add(slabel4);
		
		slabel5 = new JLabel("5");
		slabel5.setBounds(545, 245, 10, 30);
		add(slabel5);
		
		slabel6 = new JLabel("6");
		slabel6.setBounds(545, 270, 10, 30);
		add(slabel6);
		
		slabel7 = new JLabel("7");
		slabel7.setBounds(545, 295, 10, 30);
		add(slabel7);
		
		slabel8 = new JLabel("8");
		slabel8.setBounds(545, 320, 10, 30);
		add(slabel8);
		
		slabel9 = new JLabel("9");
		slabel9.setBounds(545, 345, 10, 30);
		add(slabel9);
		
		slabel10 = new JLabel("10");
		slabel10.setBounds(542, 370, 15, 30);
		add(slabel10);
		
		
		
		slabel11 = new JLabel("1");
		slabel11.setBounds(545, 415, 15, 30);
		add(slabel11);
		
		slabel12 = new JLabel("2");
		slabel12.setBounds(545, 440, 15, 30);
		add(slabel12);
		
		slabel13 = new JLabel("3");
		slabel13.setBounds(545, 465, 15, 30);
		add(slabel13);
		
		slabel14 = new JLabel("4");
		slabel14.setBounds(545, 490, 15, 30);
		add(slabel14);
		
		slabel15 = new JLabel("5");
		slabel15.setBounds(545, 515, 15, 30);
		add(slabel15);
		
		slabel16 = new JLabel("6");
		slabel16.setBounds(545, 540, 15, 30);
		add(slabel16);
		
		slabel17 = new JLabel("7");
		slabel17.setBounds(545, 565, 15, 30);
		add(slabel17);
		
		slabel18 = new JLabel("8");
		slabel18.setBounds(545, 590, 15, 30);
		add(slabel18);
		
		slabel19 = new JLabel("9");
		slabel19.setBounds(545, 615, 15, 30);
		add(slabel19);
		
		slabel20 = new JLabel("10");
		slabel20.setBounds(542, 640, 15, 30);
		add(slabel20);
		
		
		
		btn1 = new JButton("검색");
		btn1.setBounds(190, 65, 100, 40);
		btn1.setFocusPainted(false);	
		btn1.addActionListener(this);
		add(btn1);
		
		btn2 = new JButton("장르추천");
		btn2.setBounds(320, 65, 100, 40);
		btn2.setFocusPainted(false);		
		btn2.addActionListener(this);
		add(btn2);
		
		btn3 = new JButton("마이페이지");
		btn3.setBounds(550, 65, 100, 20);
		btn3.addActionListener(this);
		add(btn3);
		
		btn4 = new JButton("Logout");
		btn4.setBounds(550, 95, 100, 20);
		btn4.addActionListener(this);
		add(btn4);
		
		imgbtn1 = new JButton("영화이름");
		imgbtn1.setBounds(20, 150, 190, 200);
		imgbtn1.setBorderPainted(true);
		imgbtn1.setContentAreaFilled(false);
		imgbtn1.setFocusPainted(false);
		panel.add(imgbtn1);
		
		
		
	//	0,150,540,520
		imgbtn2 = new JButton("영화이름");
		imgbtn2.setBounds(540, 170, 100, 30);
		imgbtn2.setBorderPainted(false);
		imgbtn2.setContentAreaFilled(false);
		imgbtn2.setFocusPainted(false);
		add(imgbtn2);
		
		imgbtn3 = new JButton("영화이름");
		imgbtn3.setBounds(540, 170, 100, 30);
		imgbtn3.setBorderPainted(false);
		imgbtn3.setContentAreaFilled(false);
		imgbtn3.setFocusPainted(false);
		
		
		
		this.setResizable(false);
		setBounds(0, 0, 700, 700);
		setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
