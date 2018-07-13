package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class memberReviewUpdateView extends JFrame {

	JLabel IDlabel1,IDlabel2,titlelabel1,titlelabel2,conlabel;
	
	JTextArea area;
	
	
	JButton selectBtn,backBtn;
	
	public memberReviewUpdateView() {
		super("리뷰 수정하기");
		
	setLayout(null);
		
		IDlabel1 = new JLabel("ID :");
		IDlabel1.setBounds(60, 60, 40, 30);
		add(IDlabel1);
		
		IDlabel2 = new JLabel("2");
		IDlabel2.setBounds(100, 60, 80, 30);
		add(IDlabel2);
		
		titlelabel1 = new JLabel("제목 :");
		titlelabel1.setBounds(60, 100, 50, 30);
		add(titlelabel1);
		
		titlelabel2 = new JLabel("1");
		titlelabel2.setBounds(100, 100, 80, 30);
		add(titlelabel2);
		
		conlabel = new JLabel("내용 :");
		conlabel.setBounds(60, 140, 50, 30);
		add(conlabel);
		
		area = new JTextArea();
		area.setBounds(60, 180, 430, 200);
		area.setEditable(true);
		add(area);
		
		
		selectBtn = new JButton("수정완료");
		selectBtn.setBounds(70, 430, 130, 50);
		add(selectBtn);
		

		backBtn = new JButton("뒤로가기");
		backBtn.setBounds(325, 430, 130, 50);
		add(backBtn);
		
		setVisible(true);
		setBounds(0, 0, 550, 650);
		
		
		
		
	}
}
