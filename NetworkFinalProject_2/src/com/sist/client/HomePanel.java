package com.sist.client;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;

import com.sist.vo.MagazineDetailVO;
import com.sist.vo.MagazineVO;
import com.sist.manager.MagazineDetailManager;
import com.sist.manager.MagazineManager;

public class HomePanel extends JPanel implements ActionListener,MouseListener{
	JButton b1,b2;
	JLabel la1;
	PosterCard[] psc = new PosterCard[20];
	MagazineManager mm =new MagazineManager();
	MagazineDetailManager mdm = new MagazineDetailManager();
	JPanel pan = new JPanel();
	ControllPanel cp;
	int curPage = 1;
	int totalPage = 0;
	
	public HomePanel(ControllPanel cp) {
		this.cp = cp;
		JPanel p = new JPanel();
		b1 = new JButton("이전");
		b2 = new JButton("다음");
		totalPage = mm.MagazineTotalPage();
		la1 = new JLabel("1page/"+totalPage+"pages");
		p.add(b1);
		p.add(la1);
		p.add(b2);
		
		pan.setLayout(new GridLayout(4,5,5,5));
		//배치
		this.setLayout(new BorderLayout());
		this.add("South",p);
		this.add("Center",pan);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	
	public void cardPrint(ArrayList<MagazineVO> list) {
		int i = 0;
		for(MagazineVO vo:list) {
			psc[i] = new PosterCard(vo);
			pan.add(psc[i]);
			psc[i].addMouseListener(this);
			i++;
		}
	}
	public void cardInit() {
		pan.removeAll();//데이터 제거
		pan.repaint();
		pan.revalidate();// panel 재배치
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			if(curPage>1) {
				curPage--;
				ArrayList<MagazineVO> list = mm.MagazineCategoryData(curPage);
				cardInit();
				cardPrint(list);
				la1.setText(curPage+"page/"+totalPage+"pages");
			}
		}
		else if(e.getSource()==b2) {
			if(curPage<totalPage) {
				curPage++;
				ArrayList<MagazineVO> list = mm.MagazineCategoryData(curPage);
				if(list.size()!=20) {
					MagazineVO mVO = new MagazineVO();
					mVO.setImage(null);
					mVO.setTitle("");
					for(int i=0;i<20-list.size();i++) {
						list.add(mVO);
					}
				}
				cardInit();
				cardPrint(list);
				la1.setText(curPage+"page/"+totalPage+"pages");
			}
			
		}

		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i = 0;i<psc.length;i++) {
			if(e.getSource()==psc[i]) {
				if(e.getClickCount()==2) {
					int p_no = psc[i].mno;
					ArrayList<MagazineDetailVO> vo = mdm.MagazineInfoData(p_no);
					cp.mdp.MagazinePrint(vo);
					cp.card.show(cp, "MagazineDetail");
				}
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