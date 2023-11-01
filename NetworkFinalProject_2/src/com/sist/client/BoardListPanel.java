package com.sist.client;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.sist.manager.BoardManager;
import com.sist.vo.BoardVO;
//import com.sist.manager.*;
public class BoardListPanel extends JPanel implements ActionListener,MouseListener{
	JLabel la,pageLa;
	JButton b1,b2,b3,b4;
	JTable table;
	DefaultTableModel model;
	ControllPanel cp;
	int curpage=1;
	int totalPage = 0;
	BoardManager bm = new BoardManager();
	public BoardListPanel(ControllPanel cp) {
		this.cp = cp;
		String[] col1 = {"번호","제목","이름","작성일","조회수"};
		String[][] row1 = new String[0][5];
		
		model = new DefaultTableModel(row1,col1) {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		table = new JTable(model);
		table.getTableHeader().setReorderingAllowed(false);
		table.setShowVerticalLines(false);
		table.setRowHeight(40);
		table.getColumn("번호").setPreferredWidth(30);
		table.getColumn("제목").setPreferredWidth(400);
		table.getColumn("이름").setPreferredWidth(10);
		table.getColumn("작성일").setPreferredWidth(150);
		table.getColumn("조회수").setPreferredWidth(50);
		

		
		JScrollPane js = new JScrollPane(table);
		
		b1 = new JButton("새글");
		b2 = new JButton("검색");
		b3 = new JButton("이전");
		b4 = new JButton("다음");
		la = new JLabel("자유게시판");
		pageLa = new JLabel("1 page / 1 pages");
		
		this.setLayout(null);
		la.setHorizontalAlignment(JLabel.CENTER);
		la.setFont(new Font("굴림체",Font.BOLD,35));
		la.setBounds(10, 15, 710, 50);
		this.add(la);
		
		b1.setBounds(10, 75, 100, 30);
		this.add(b1);
		
		js.setBounds(10, 115, 710, 450);
		this.add(js);
		
		JPanel p = new JPanel();
		p.add(b3);
		p.add(pageLa);
		p.add(b4);
		
		p.setBounds(10, 570, 710, 35);
		this.add(p);
		
		b1.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		table.addMouseListener(this);
		boardList();
		
	}
	public void boardList() {
		for(int i = model.getRowCount()-1;i>=0;i--) {
			model.removeRow(i);
		}
		ArrayList<BoardVO> list = bm.boardListData(curpage);
		totalPage = bm.boardTotalPage();
		pageLa.setText(curpage+" page /"+totalPage+" pages");
		for(int i =0;i<list.size();i++) {
			BoardVO vo = list.get(i);
			String[] data = {String.valueOf(vo.getNo()),vo.getSubject(),vo.getName(),new SimpleDateFormat("yyyy-MM-dd").format(vo.getRegdate()),String.valueOf(vo.getHit())};
			
			model.addRow(data);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			cp.card.show(cp,"Insert");
		}
		else if(e.getSource()==b3) {
			if(curpage>1) {
				curpage--;
				boardList();
			}
		}
		else if(e.getSource()==b4) {
			if(curpage<totalPage) {
				curpage++;
				boardList();
			}
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==table) {
			if(e.getClickCount()==2) {//더블클릭
				int row=table.getSelectedRow();
				String no = model.getValueAt(row, 0).toString();
				BoardVO vo = bm.boardDetailData(Integer.parseInt(no));
				cp.dp.noLa.setText(no);

				cp.dp.nameLa.setText(vo.getName());
				cp.dp.subLa.setText(vo.getSubject());
				cp.dp.hitLa.setText(String.valueOf(vo.getHit()));
				cp.dp.pane.setText(vo.getContent());
				cp.dp.dateLa.setText(new SimpleDateFormat("yyyy-MM-dd").format(vo.getRegdate()));
				cp.card.show(cp, "Detail");
				
			}
		}
		
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