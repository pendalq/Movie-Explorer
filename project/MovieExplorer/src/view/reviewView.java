package view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class reviewView extends JFrame implements MouseListener,ActionListener{
	
	private JTable jtable;
	private JScrollPane jscrpane;
	
	private String columnNames[]= {"글 번호","제목","작성자","추천수"};
	private JComboBox<String> choiceSelect;
	private JTextField searchTf;
	private JButton searchBtn;
	
	private Object rowData[][];
	private DefaultTableModel model;
	
	public reviewView() {
		super("리뷰 보기");
		setLayout(null);
		
		String[] selects=new String[] {"제목","작성자"};
		choiceSelect=new JComboBox<>(selects);
		choiceSelect.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					Object item=e.getItem();
				}
			}
		});
		choiceSelect.setBounds(50, 470, 100, 30);
		add(choiceSelect);
		
		searchTf=new JTextField();
		searchTf.setBounds(200, 470, 150, 30);
		add(searchTf);
		
		searchBtn=new JButton("검색");
		searchBtn.setBounds(380, 470, 70, 30);
		searchBtn.addActionListener(this);
		add(searchBtn);
		
		model=new DefaultTableModel(columnNames, 0);
		model.setDataVector(rowData, columnNames);
		
		jtable=new JTable(model);
		jtable.addMouseListener(this);
		
		jtable.getColumnModel().getColumn(0).setMaxWidth(70);
		jtable.getColumnModel().getColumn(1).setMaxWidth(500);
		jtable.getColumnModel().getColumn(2).setMaxWidth(100);
		jtable.getColumnModel().getColumn(3).setMaxWidth(70);
		
		DefaultTableCellRenderer celAlignCenter=new DefaultTableCellRenderer();
		celAlignCenter.setHorizontalAlignment(JLabel.CENTER);
		
		jtable.getColumn("글 번호").setCellRenderer(celAlignCenter);
		jtable.getColumn("제목").setCellRenderer(celAlignCenter);
		jtable.getColumn("작성자").setCellRenderer(celAlignCenter);
		jtable.getColumn("추천수").setCellRenderer(celAlignCenter);
		
		jscrpane=new JScrollPane(jtable);
		jscrpane.setBounds(20, 50, 500, 400);
		add(jscrpane);
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj==searchBtn) {
			
		}
	}

}
