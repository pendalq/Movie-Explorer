package view;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class movieSearchView extends JFrame implements MouseListener,ActionListener{
	
	private JTable jtable;
	private JScrollPane jscrpane;
	
	private String columnNames[]= {"영화 제목","장르","평점"};
	private JComboBox<String> genre;
	private JTextField searchTf;
	private JButton select;
	
	private Object rowData[][];
	private DefaultTableModel model;
	
	
	
	public movieSearchView() {
		super("영화 검색");
		setLayout(null);
		
		String[] selects=new String[] {"선택안함","액션","코미디","공포","로맨스코미디",
				"로맨스","드라마","SF","범죄","미스터리","스릴러"};
		genre=new JComboBox<>(selects);
		genre.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					Object item=e.getItem();
					//JOptionPane.showMessageDialog(null, item);
				}
			}
		});
		genre.setBounds(50, 470, 100, 30);
		add(genre);
		
		searchTf=new JTextField();
		searchTf.setBounds(200, 470, 150, 30);
		add(searchTf);
		
		select=new JButton("검색");
		select.setBounds(380, 470, 70, 30);
		select.addActionListener(this);
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
		if(obj==select) {
			
		}
	}

}
