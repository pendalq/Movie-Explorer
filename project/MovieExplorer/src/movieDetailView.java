package view;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class movieDetailView extends JFrame implements MouseListener {

	JLabel imglabel,
	titlelabel1, titlelabel12, gradeLabel1,gradeLabel2,actorlabel1,actorName1,actorName2,actorName3,actorName4,
	setgradeLabel, label1, directorlabel1,directorlabel2,genrelabel1,genrelabel2,
	recLabel,rmovieLabel; 
	JButton rmoviebtn1, rmoviebtn2, rmoviebtn3,setgradebtn,
	reviewBtn;
	Choice cho;
	JTable jTable;
	JScrollPane jScrPane1, jScrpane2;
	
	
	String columnNames[] = {
			"��ȣ", "����", "�ۼ���", "��õ��"
	};
	
	Object rowData[][];
	
	DefaultTableModel model;
	
	public movieDetailView() {

		setLayout(null);
		
		// �̹���
		imglabel = new JLabel("�̹���");
		imglabel.setBorder(new LineBorder(Color.BLACK));
		imglabel.setBounds(10, 20, 190, 200);
		add(imglabel);

		titlelabel1 = new JLabel("��ȭ ���� :");
		titlelabel1.setBounds(230, 10, 65, 40);
		add(titlelabel1);
		
		titlelabel12 = new JLabel("1");
		titlelabel12.setBounds(300, 10, 100, 40);
		add(titlelabel12);
		
		gradeLabel1 = new JLabel("���� :");
		gradeLabel1.setBounds(230, 40, 40, 40);
		add(gradeLabel1);
		
		gradeLabel2 = new JLabel("1");
		gradeLabel2.setBounds(280, 40, 60, 40);
		add(gradeLabel2);

		setgradeLabel = new JLabel("���� �ֱ� :");
		setgradeLabel.setBounds(430, 40, 65, 40);
		add(setgradeLabel);
		
		cho = new Choice();
		cho.setBounds(505, 50, 60, 60);
		cho.add("1");
		cho.add("2");
		cho.add("3");
		cho.add("4");
		cho.add("5");
		add(cho);
		
		setgradebtn = new JButton("Ȯ��");
		setgradebtn.setBounds(570, 50, 60, 25);
		setgradebtn.setFocusPainted(false);
		add(setgradebtn);

		label1 = new JLabel("(1~5 ��)");
		label1.setBounds(430, 55, 60, 40);
		add(label1);

		directorlabel1 = new JLabel("���� :");
		directorlabel1.setBounds(230, 80, 40, 40);
		add(directorlabel1);
		
		directorlabel2 = new JLabel("1");
		directorlabel2.setBounds(280, 80, 100, 40);
		add(directorlabel2);
		
		genrelabel1 = new JLabel("�帣 :");
		genrelabel1.setBounds(430, 80, 40, 40);
		add(genrelabel1);
		
		genrelabel2 = new JLabel("1");
		genrelabel2.setBounds(480, 80, 100, 40);
		add(genrelabel2);
		
		
		actorlabel1 = new JLabel("��� :");
		actorlabel1.setBounds(230, 120, 40, 40);
		add(actorlabel1);
		
		actorName1 = new JLabel("1");
		
		actorName2 = new JLabel("1");
		
		actorName3 = new JLabel("1");
		
		actorName4 = new JLabel("1");
		
		JPanel actorName = new JPanel();
		actorName.add(actorName1);
		actorName.add(actorName2);
		actorName.add(actorName3);
		actorName.add(actorName4);
		actorName.setLayout(new FlowLayout());
		actorName.setBounds(280, 130, 350, 50);
		actorName.setBorder(new LineBorder(Color.black));
		add(actorName);
		
		
		rmovieLabel = new JLabel(" * ���� ��ȭ");
		rmovieLabel.setBounds(10, 250, 100, 40);
		add(rmovieLabel);

		recLabel = new JLabel(" * ��õ ����");
		recLabel.setBounds(10, 520, 100, 40);
		add(recLabel);
		
		
		//���丮
		JTextArea jta = new JTextArea();
		jta.setEditable(false);
		jta.setText("���丮 : ");
		jta.setBackground(Color.PINK);
		setBackground(Color.PINK);
		
		jScrpane2 = new JScrollPane(jta);
		jScrpane2.setBounds(230, 200, 400, 65);
		add(jScrpane2);
		
		
		
		
		//���ÿ�ȭ
		rmoviebtn1 = new JButton("��ȭ�̸�");
		rmoviebtn1.setBounds(40, 300, 190, 200);
		rmoviebtn1.setBorderPainted(true);
		rmoviebtn1.setContentAreaFilled(false);
		rmoviebtn1.setFocusPainted(false);
		add(rmoviebtn1);

		rmoviebtn2 = new JButton("��ȭ�̸�");
		rmoviebtn2.setBounds(260, 300, 190, 200);
		rmoviebtn2.setBorderPainted(true);
		rmoviebtn2.setContentAreaFilled(false);
		rmoviebtn2.setFocusPainted(false);
		add(rmoviebtn2);

		rmoviebtn3 = new JButton("��ȭ�̸�");
		rmoviebtn3.setBounds(480, 300, 190, 200);
		rmoviebtn3.setBorderPainted(true);
		rmoviebtn3.setContentAreaFilled(false); // ����
		rmoviebtn3.setFocusPainted(false);
		add(rmoviebtn3);
		
		reviewBtn = new JButton("��ü ����");
		reviewBtn.setBounds(560, 560, 90, 70);
		reviewBtn.setFocusPainted(false);
		add(reviewBtn);
		
		//���̺� ( ��õ����)
		rowData = new Object[3][4]; // ���̺��� 2�����迭�� ����

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
		
		jScrPane1 = new JScrollPane(jTable);
		
		jScrPane1.setBounds(40, 560, 500, 73);
		add(jScrPane1);
		
		
		
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
