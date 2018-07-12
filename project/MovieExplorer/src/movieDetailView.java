package view;

import java.awt.Choice;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class movieDetailView extends JFrame implements MouseListener {

	JLabel imglabel, label1, label2, label3, label4, label5, label6, label7, label8, label9, slabel1, slabel2, slabel3,
			slabel4, slabel5, slabel6;
	JButton mbtn1, mbtn2, mbtn3,
	reviewBtn, button;
	Choice cho;
	JTable jTable;
	JScrollPane jScrPane;
	
	
	String columnNames[] = {
			"번호", "제목", "작성자", "추천수"
	};
	
	Object rowData[][];
	
	DefaultTableModel model;
	
	public movieDetailView() {

		setLayout(null);
		
		// 이미지
		imglabel = new JLabel("이미지");
		imglabel.setBorder(new LineBorder(Color.BLACK));
		imglabel.setBounds(10, 20, 190, 200);
		add(imglabel);

		label1 = new JLabel("영화 제목 :");
		label1.setBounds(230, 10, 65, 40);
		add(label1);
		
		slabel1 = new JLabel("1");
		slabel1.setBounds(300, 10, 100, 40);
		add(slabel1);
		
		label2 = new JLabel("평점 :");
		label2.setBounds(230, 40, 40, 40);
		add(label2);
		
		slabel2 = new JLabel("1");
		slabel2.setBounds(280, 40, 60, 40);
		add(slabel2);

		label3 = new JLabel("평점 주기 :");
		label3.setBounds(430, 40, 65, 40);
		add(label3);
		
		cho = new Choice();
		cho.setBounds(505, 50, 60, 60);
		cho.add("1");
		cho.add("2");
		cho.add("3");
		cho.add("4");
		cho.add("5");
		add(cho);
		
		button = new JButton("확인");
		button.setBounds(570, 50, 60, 25);
		button.setFocusPainted(false);
		add(button);

		label4 = new JLabel("(1~5 점)");
		label4.setBounds(430, 55, 60, 40);
		add(label4);

		label5 = new JLabel("감독 :");
		label5.setBounds(230, 80, 40, 40);
		add(label5);
		
		slabel3 = new JLabel("1");
		slabel3.setBounds(280, 80, 100, 40);
		add(slabel3);
		
		label6 = new JLabel("장르 :");
		label6.setBounds(430, 80, 40, 40);
		add(label6);
		
		slabel4 = new JLabel("1");
		slabel4.setBounds(480, 80, 100, 40);
		add(slabel4);
		
		
		label7 = new JLabel("배우 :");
		label7.setBounds(230, 120, 40, 40);
		add(label7);
		
		slabel5 = new JLabel("1");
		slabel5.setBounds(280, 120, 150, 40);
		add(slabel5);

		label8 = new JLabel(" * 관련 영화");
		label8.setBounds(10, 250, 100, 40);
		add(label8);

		label9 = new JLabel(" * 추천 리뷰");
		label9.setBounds(10, 520, 100, 40);
		add(label9);
		
		
		//스토리
		JTextArea jta = new JTextArea();
		jta.setEditable(false);
		jta.setText("스토리 : ");
		jta.setBackground(Color.PINK);
		jta.setBounds(230, 180, 400, 50);
		add(jta);
		setBackground(Color.PINK);

		//관련영화
		mbtn1 = new JButton("영화이름");
		mbtn1.setBounds(40, 300, 190, 200);
		mbtn1.setBorderPainted(true);
		mbtn1.setContentAreaFilled(false);
		mbtn1.setFocusPainted(false);
		add(mbtn1);

		mbtn2 = new JButton("영화이름");
		mbtn2.setBounds(260, 300, 190, 200);
		mbtn2.setBorderPainted(true);
		mbtn2.setContentAreaFilled(false);
		mbtn2.setFocusPainted(false);
		add(mbtn2);

		mbtn3 = new JButton("영화이름");
		mbtn3.setBounds(480, 300, 190, 200);
		mbtn3.setBorderPainted(true);
		mbtn3.setContentAreaFilled(false); // 투명
		mbtn3.setFocusPainted(false);
		add(mbtn3);
		
		reviewBtn = new JButton("전체 리뷰");
		reviewBtn.setBounds(560, 560, 90, 70);
		reviewBtn.setFocusPainted(false);
		add(reviewBtn);
		
		//테이블 ( 추천리뷰)
		rowData = new Object[3][4]; // 테이블의 2차원배열이 생성

		for (int i = 0; i < 3; i++) {

			rowData[i][0] = "";
			rowData[i][1] = "";
			rowData[i][2] = "";
		}

		model = new DefaultTableModel(columnNames, 0);
		model.setDataVector(rowData, columnNames);

		jTable = new JTable(model);
		jTable.addMouseListener(this);

		
		jTable.getColumnModel().getColumn(0).setMaxWidth(50);
		jTable.getColumnModel().getColumn(1).setMaxWidth(500);
		jTable.getColumnModel().getColumn(2).setMaxWidth(200);
		jTable.getColumnModel().getColumn(3).setMaxWidth(50);
		
		jScrPane = new JScrollPane(jTable);
		
		jScrPane.setBounds(40, 560, 500, 73);
		add(jScrPane);
		
		
		
		this.setResizable(false);
		setBounds(0, 0, 700, 700);
		setVisible(true);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
