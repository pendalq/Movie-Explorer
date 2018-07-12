package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagLayout;
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

public class mainView extends JFrame implements ActionListener {

	private JScrollPane scrollPane;
	JButton serchBtn, gernebBn, myPageBtn, logoutBtn, 
	imgbtn1, imgbtn2, imgbtn3, imgbtn4,
	gradeRankingbtn1, gradeRankingbtn2,gradeRankingbtn3, gradeRankingbtn4, gradeRankingbtn5, gradeRankingbtn6, gradeRankingbtn7, gradeRankingbtn8,
	gradeRankingbtn9, gradeRankingbtn10, 
	rcRakingbtn1, rcRakingbtn2, rcRakingbtn3, rcRakingbtn4, rcRakingbtn5,rcRakingbtn6, rcRakingbtn7, rcRakingbtn8, rcRakingbtn9, rcRakingbtn10, imgbtn5, imgbtn6, imgbtn7, imgbtn8;
	JLabel  label6, 
	
	linelabel1, linelabel2, linelabel3, 
	movielabel,nowscrlabel,gradeRankinglabel,rcRakinglabel,
	pointlabel1,pointlabel2,
	IDlabel1, IDlabel2, pointlabel,
			gRanklabel1, gRanklabel2, gRanklabel3,gRanklabel4,gRanklabel5,gRanklabel6,gRanklabel7,gRanklabel8,gRanklabel9,gRanklabel10,
			rcRanklabel1,rcRanklabel2,rcRanklabel3,rcRanklabel4,rcRanklabel5,rcRanklabel6,rcRanklabel7,rcRanklabel8,rcRanklabel9,rcRanklabel10;
	JPanel panel;

	public mainView() {
		super("main");

		setLayout(null);

		/*
		 * JScrollBar jscbar = new JScrollBar(); jscbar.setBounds(50, 100, 200, 200);
		 */

		imgbtn1 = new JButton("영화이름");
		imgbtn1.setBounds(20, 20, 190, 200);
		imgbtn1.setBorderPainted(true);
		imgbtn1.setContentAreaFilled(false);
		imgbtn1.setFocusPainted(false);

		// 0,150,540,520
		imgbtn2 = new JButton("영화이름");
		imgbtn2.setBounds(20, 600, 100, 30);
		imgbtn2.setBorderPainted(true);
		imgbtn2.setContentAreaFilled(false);
		imgbtn2.setFocusPainted(false);
		add(imgbtn2);

		imgbtn3 = new JButton("영화이름");
		imgbtn3.setBounds(540, 170, 100, 30);
		imgbtn3.setBorderPainted(false);
		imgbtn3.setContentAreaFilled(false);
		imgbtn3.setFocusPainted(false);
		
		imgbtn4 = new JButton("영화이름");
		imgbtn4.setBounds(540, 170, 100, 30);
		imgbtn4.setBorderPainted(false);
		imgbtn4.setContentAreaFilled(false);
		imgbtn4.setFocusPainted(false);

		panel = new JPanel();
		// panel.setLayout(new grid);
		panel.setBorder(new LineBorder(Color.BLACK));
		panel.setBounds(0, 150, 540, 520);
		panel.add(imgbtn1);
		panel.add(imgbtn2);
		JScrollPane scrollPane = new JScrollPane(panel);
		// JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBorder(new LineBorder(Color.BLACK));
		scrollPane.setBounds(0, 150, 540, 520);
		add(scrollPane);

		movielabel = new JLabel("movie");
		movielabel.setBounds(280, 10, 80, 40);
		add(movielabel);

		IDlabel1 = new JLabel("[등급] ID");
		IDlabel1.setBounds(550, 10, 70, 40);
		add(IDlabel1);

		IDlabel2 = new JLabel("2");
		IDlabel2.setBounds(620, 15, 60, 30);
		add(IDlabel2);

		
		pointlabel1 = new JLabel("보유 Point :");
		pointlabel1.setBounds(550, 30, 70, 40);
		add(pointlabel1);
		
		
		pointlabel2 = new JLabel("3");
		pointlabel2.setBounds(620, 35, 60, 30);
		add(pointlabel2);

		nowscrlabel = new JLabel("* 현재 상영작 ");
		nowscrlabel.setBounds(20, 120, 80, 40);
		add(nowscrlabel);

		gradeRankinglabel = new JLabel("* 평점 Ranking ");
		gradeRankinglabel.setBounds(550, 120, 100, 40);
		add(gradeRankinglabel);

		gradeRankingbtn1 = new JButton("영화이름");
		gradeRankingbtn1.setBounds(540, 145, 100, 30);
		gradeRankingbtn1.setBorderPainted(false);
		gradeRankingbtn1.setContentAreaFilled(false);
		gradeRankingbtn1.setFocusPainted(false);
		add(gradeRankingbtn1);

		gradeRankingbtn2 = new JButton("영화이름");
		gradeRankingbtn2.setBounds(540, 170, 100, 30);
		gradeRankingbtn2.setBorderPainted(false);
		gradeRankingbtn2.setContentAreaFilled(false);
		gradeRankingbtn2.setFocusPainted(false);
		add(gradeRankingbtn2);

		gradeRankingbtn3 = new JButton("영화이름");
		gradeRankingbtn3.setBounds(540, 195, 100, 30);
		gradeRankingbtn3.setBorderPainted(false);
		gradeRankingbtn3.setContentAreaFilled(false);
		gradeRankingbtn3.setFocusPainted(false);
		add(gradeRankingbtn3);

		gradeRankingbtn4 = new JButton("영화이름");
		gradeRankingbtn4.setBounds(540, 220, 100, 30);
		gradeRankingbtn4.setBorderPainted(false);
		gradeRankingbtn4.setContentAreaFilled(false);
		gradeRankingbtn4.setFocusPainted(false);
		add(gradeRankingbtn4);

		gradeRankingbtn5 = new JButton("영화이름");
		gradeRankingbtn5.setBounds(540, 245, 100, 30);
		gradeRankingbtn5.setBorderPainted(false);
		gradeRankingbtn5.setContentAreaFilled(false);
		gradeRankingbtn5.setFocusPainted(false);
		add(gradeRankingbtn5);

		gradeRankingbtn6 = new JButton("영화이름");
		gradeRankingbtn6.setBounds(540, 270, 100, 30);
		gradeRankingbtn6.setBorderPainted(false);
		gradeRankingbtn6.setContentAreaFilled(false);
		gradeRankingbtn6.setFocusPainted(false);
		add(gradeRankingbtn6);

		gradeRankingbtn7 = new JButton("영화이름");
		gradeRankingbtn7.setBounds(540, 295, 100, 30);
		gradeRankingbtn7.setBorderPainted(false);
		gradeRankingbtn7.setContentAreaFilled(false);
		gradeRankingbtn7.setFocusPainted(false);
		add(gradeRankingbtn7);

		gradeRankingbtn8 = new JButton("영화이름");
		gradeRankingbtn8.setBounds(540, 320, 100, 30);
		gradeRankingbtn8.setBorderPainted(false);
		gradeRankingbtn8.setContentAreaFilled(false);
		gradeRankingbtn8.setFocusPainted(false);
		add(gradeRankingbtn8);

		gradeRankingbtn9 = new JButton("영화이름");
		gradeRankingbtn9.setBounds(540, 345, 100, 30);
		gradeRankingbtn9.setBorderPainted(false);
		gradeRankingbtn9.setContentAreaFilled(false);
		gradeRankingbtn9.setFocusPainted(false);
		add(gradeRankingbtn9);

		gradeRankingbtn10 = new JButton("영화이름");
		gradeRankingbtn10.setBounds(540, 370, 100, 30);
		gradeRankingbtn10.setBorderPainted(false);
		gradeRankingbtn10.setContentAreaFilled(false);
		gradeRankingbtn10.setFocusPainted(false);
		add(gradeRankingbtn10);

		
		
		
		rcRakinglabel = new JLabel("* 추천 Ranking");
		rcRakinglabel.setBounds(550, 390, 100, 40);
		add(rcRakinglabel);

		rcRakingbtn1 = new JButton("영화이름");
		rcRakingbtn1.setBounds(540, 415, 100, 30);
		rcRakingbtn1.setBorderPainted(false);
		rcRakingbtn1.setContentAreaFilled(false);
		rcRakingbtn1.setFocusPainted(false);
		add(rcRakingbtn1);

		rcRakingbtn2 = new JButton("영화이름");
		rcRakingbtn2.setBounds(540, 440, 100, 30);
		rcRakingbtn2.setBorderPainted(false);
		rcRakingbtn2.setContentAreaFilled(false);
		rcRakingbtn2.setFocusPainted(false);
		add(rcRakingbtn2);

		rcRakingbtn3 = new JButton("영화이름");
		rcRakingbtn3.setBounds(540, 465, 100, 30);
		rcRakingbtn3.setBorderPainted(false);
		rcRakingbtn3.setContentAreaFilled(false);
		rcRakingbtn3.setFocusPainted(false);
		add(rcRakingbtn3);

		rcRakingbtn4 = new JButton("영화이름");
		rcRakingbtn4.setBounds(540, 490, 100, 30);
		rcRakingbtn4.setBorderPainted(false);
		rcRakingbtn4.setContentAreaFilled(false);
		rcRakingbtn4.setFocusPainted(false);
		add(rcRakingbtn4);

		rcRakingbtn5 = new JButton("영화이름");
		rcRakingbtn5.setBounds(540, 515, 100, 30);
		rcRakingbtn5.setBorderPainted(false);
		rcRakingbtn5.setContentAreaFilled(false);
		rcRakingbtn5.setFocusPainted(false);
		add(rcRakingbtn5);

		rcRakingbtn6 = new JButton("영화이름");
		rcRakingbtn6.setBounds(540, 540, 100, 30);
		rcRakingbtn6.setBorderPainted(false);
		rcRakingbtn6.setContentAreaFilled(false);
		rcRakingbtn6.setFocusPainted(false);
		add(rcRakingbtn6);

		rcRakingbtn7 = new JButton("영화이름");
		rcRakingbtn7.setBounds(540, 565, 100, 30);
		rcRakingbtn7.setBorderPainted(false);
		rcRakingbtn7.setContentAreaFilled(false);
		rcRakingbtn7.setFocusPainted(false);
		add(rcRakingbtn7);

		rcRakingbtn8 = new JButton("영화이름");
		rcRakingbtn8.setBounds(540, 590, 100, 30);
		rcRakingbtn8.setBorderPainted(false);
		rcRakingbtn8.setContentAreaFilled(false);
		rcRakingbtn8.setFocusPainted(false);
		add(rcRakingbtn8);

		rcRakingbtn9 = new JButton("영화이름");
		rcRakingbtn9.setBounds(540, 615, 100, 30);
		rcRakingbtn9.setBorderPainted(false);
		rcRakingbtn9.setContentAreaFilled(false);
		rcRakingbtn9.setFocusPainted(false);
		add(rcRakingbtn9);

		rcRakingbtn10 = new JButton("영화이름");
		rcRakingbtn10.setBounds(540, 640, 100, 30);
		rcRakingbtn10.setBorderPainted(false);
		rcRakingbtn10.setContentAreaFilled(false);
		rcRakingbtn10.setFocusPainted(false);
		add(rcRakingbtn10);

		linelabel1 = new JLabel();
		linelabel1.setBorder(new LineBorder(Color.BLACK));
		linelabel1.setBounds(0, 125, 700, 1);
		add(linelabel1);

		linelabel2 = new JLabel();
		linelabel2.setBorder(new LineBorder(Color.black));
		linelabel2.setBounds(540, 125, 1, 570);
		add(linelabel2);

		linelabel3 = new JLabel();
		linelabel3.setBorder(new LineBorder(Color.black));
		linelabel3.setBounds(540, 400, 650, 1);
		add(linelabel3);

	

		gRanklabel1 = new JLabel("1"); // 번호
		gRanklabel1.setBounds(545, 145, 10, 30);
		add(gRanklabel1);

		gRanklabel2 = new JLabel("2");
		gRanklabel2.setBounds(545, 170, 10, 30);
		add(gRanklabel2);

		gRanklabel3 = new JLabel("3");
		gRanklabel3.setBounds(545, 195, 10, 30);
		add(gRanklabel3);

		gRanklabel4 = new JLabel("4");
		gRanklabel4.setBounds(545, 220, 10, 30);
		add(gRanklabel4);

		gRanklabel5 = new JLabel("5");
		gRanklabel5.setBounds(545, 245, 10, 30);
		add(gRanklabel5);

		gRanklabel6 = new JLabel("6");
		gRanklabel6.setBounds(545, 270, 10, 30);
		add(gRanklabel6);

		gRanklabel7 = new JLabel("7");
		gRanklabel7.setBounds(545, 295, 10, 30);
		add(gRanklabel7);

		gRanklabel8 = new JLabel("8");
		gRanklabel8.setBounds(545, 320, 10, 30);
		add(gRanklabel8);

		gRanklabel9 = new JLabel("9");
		gRanklabel9.setBounds(545, 345, 10, 30);
		add(gRanklabel9);

		gRanklabel10 = new JLabel("10");
		gRanklabel10.setBounds(542, 370, 15, 30);
		add(gRanklabel10);

		rcRanklabel1 = new JLabel("1");
		rcRanklabel1.setBounds(545, 415, 15, 30);
		add(rcRanklabel1);

		rcRanklabel2 = new JLabel("2");
		rcRanklabel2.setBounds(545, 440, 15, 30);
		add(rcRanklabel2);

		rcRanklabel3 = new JLabel("3");
		rcRanklabel3.setBounds(545, 465, 15, 30);
		add(rcRanklabel3);

		rcRanklabel4 = new JLabel("4");
		rcRanklabel4.setBounds(545, 490, 15, 30);
		add(rcRanklabel4);

		rcRanklabel5 = new JLabel("5");
		rcRanklabel5.setBounds(545, 515, 15, 30);
		add(rcRanklabel5);

		rcRanklabel6 = new JLabel("6");
		rcRanklabel6.setBounds(545, 540, 15, 30);
		add(rcRanklabel6);

		rcRanklabel7 = new JLabel("7");
		rcRanklabel7.setBounds(545, 565, 15, 30);
		add(rcRanklabel7);

		rcRanklabel8 = new JLabel("8");
		rcRanklabel8.setBounds(545, 590, 15, 30);
		add(rcRanklabel8);

		rcRanklabel9 = new JLabel("9");
		rcRanklabel9.setBounds(545, 615, 15, 30);
		add(rcRanklabel9);

		rcRanklabel10 = new JLabel("10");
		rcRanklabel10.setBounds(542, 640, 15, 30);
		add(rcRanklabel10);

		serchBtn = new JButton("검색");
		serchBtn.setBounds(190, 65, 100, 40);
		serchBtn.setFocusPainted(false);
		serchBtn.addActionListener(this);
		add(serchBtn);

		gernebBn = new JButton("장르추천");
		gernebBn.setBounds(320, 65, 100, 40);
		gernebBn.setFocusPainted(false);
		gernebBn.addActionListener(this);
		add(gernebBn);

		myPageBtn = new JButton("마이페이지");
		myPageBtn.setBounds(550, 65, 100, 20);
		myPageBtn.addActionListener(this);
		add(myPageBtn);

		logoutBtn = new JButton("Logout");
		logoutBtn.setBounds(550, 95, 100, 20);
		logoutBtn.addActionListener(this);
		add(logoutBtn);

		this.setResizable(false);
		setBounds(0, 0, 700, 700);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
