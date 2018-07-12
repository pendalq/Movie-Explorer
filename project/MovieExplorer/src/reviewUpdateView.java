package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class reviewUpdateView extends JFrame {

	JLabel IDlabel1,IDlabel2, recountlabel1,recountlabel2,reclabel1,reclabel2,
	titlelabel1, titlelabel2, conlabel;
	JTextArea area;
	JButton selectBtn, deleteBtn, backBtn, recBtn;
	
	public reviewUpdateView() {
		super("작성자일 경우");
		
		setLayout(null);
		
		IDlabel1 = new JLabel("ID :");
		IDlabel1.setBounds(100, 60, 40, 30);
		add(IDlabel1);
		
		IDlabel2 = new JLabel("2");
		IDlabel2.setBounds(150, 60, 80, 30);
		add(IDlabel2);
		
		recountlabel1 = new JLabel("조회수 :");
		recountlabel1.setBounds(100, 110, 50, 30);
		add(recountlabel1);
		
		recountlabel2 = new JLabel("1");
		recountlabel2.setBounds(150, 110, 50, 30);
		add(recountlabel2);
		
		reclabel1 = new JLabel("추천수 :");
		reclabel1.setBounds(100, 160, 50, 30);
		add(reclabel1);
		
		reclabel2 = new JLabel("1");
		reclabel2.setBounds(150, 160, 50, 30);
		add(reclabel2);
		
		titlelabel1 = new JLabel("제목 :");
		titlelabel1.setBounds(100, 210, 50, 30);
		add(titlelabel1);
		
		titlelabel2 = new JLabel("1");
		titlelabel2.setBounds(150, 210, 80, 30);
		add(titlelabel2);
		
		conlabel = new JLabel("내용 :");
		conlabel.setBounds(100, 260, 50, 30);
		add(conlabel);
		
		area = new JTextArea();
		area.setBounds(100, 300, 430, 150);
		area.setEditable(false);
		add(area);
		
		
		selectBtn = new JButton("수정하기");
		selectBtn.setBounds(90, 480, 130, 50);
		add(selectBtn);
		
		deleteBtn = new JButton("삭제하기");
		deleteBtn.setBounds(250, 480, 130, 50);
		add(deleteBtn);
		
		backBtn = new JButton("뒤로가기");
		backBtn.setBounds(410, 480, 130, 50);
		add(backBtn);
		
		recBtn = new JButton("추천");
		recBtn.setBounds(410, 550, 130, 50);
		add(recBtn);
		
		
		
		setVisible(true);
		setBounds(0, 0, 700, 700);
		
		
	}
}
