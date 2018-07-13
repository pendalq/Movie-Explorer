package view;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class recommendView extends JFrame implements MouseListener{
	private JTable jtable;
	private JScrollPane jscrpane;
	
	private String columnNames[]= {"영화 제목","장르","평점"};
	
	private JCheckBox[] check;
	private JButton select;
	
	private String[] checkStr;
	
	private Object rowData[][];
	private DefaultTableModel model;
	
	public recommendView() {
		super("장르별 영화 추천");
		setLayout(null);
		
		select=new JButton("확인");
		select.setBounds(440, 470, 70, 80);
		select.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj=e.getSource();
				
				boolean b=false; //하나도 선택안했을 경우
				
				//체크박스선택한경우,,인듯
				if(obj==select) {
					for (int i = 0; i < check.length; i++) {
						if(check[i].isSelected()) {
							//JOptionPane.showMessageDialog(null, checkStr[i]);
							b=true;
						}
					}if(!b) {
							JOptionPane.showMessageDialog(null, "선호 장르를 선택해주세요");
						}
				
				}
			}
		});
		add(select);
		
		model=new DefaultTableModel(columnNames, 0);
		model.setDataVector(rowData, columnNames);
		
		jtable=new JTable(model);
		jtable.addMouseListener(this);
		
		jtable.getColumnModel().getColumn(0).setMaxWidth(500);
		jtable.getColumnModel().getColumn(1).setMaxWidth(100);
		jtable.getColumnModel().getColumn(2).setMaxWidth(100);
		
		DefaultTableCellRenderer celAlignCenter=new DefaultTableCellRenderer();
		celAlignCenter.setHorizontalAlignment(JLabel.CENTER);
		
		jtable.getColumn("영화 제목").setCellRenderer(celAlignCenter);
		jtable.getColumn("장르").setCellRenderer(celAlignCenter);
		jtable.getColumn("평점").setCellRenderer(celAlignCenter);
		
		jscrpane=new JScrollPane(jtable);
		jscrpane.setBounds(20, 50, 500, 400);
		add(jscrpane);
		
		checkStr=new String[] {"액션","코미디","공포","로맨스 코미디","로맨스",
				"드라마","SF","범죄","미스터리","스릴러"};
		
		
	
		check=new JCheckBox[10];
		
		
		for (int i = 0; i < check.length ; i++) {
				check[i]=new JCheckBox();
				check[i].setText(checkStr[i]);
				add(check[i]);
			
		}
			
		check[0].setBounds(30, 470, 90, 20);
		check[1].setBounds(120, 470, 90, 20);
		check[2].setBounds(210, 470, 90, 20);
		check[3].setBounds(300, 470, 100, 20);
		check[4].setBounds(30, 500, 90, 20);
		check[5].setBounds(120, 500, 90, 20);
		check[6].setBounds(210, 500, 90, 20);
		check[7].setBounds(300, 500, 90, 20);
		check[8].setBounds(30, 530, 90, 20);
		check[9].setBounds(120, 530, 90, 20);
		
		
		
		
		setBounds(0, 0, 550, 650);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		int rowNum=jtable.getSelectedRow();
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
