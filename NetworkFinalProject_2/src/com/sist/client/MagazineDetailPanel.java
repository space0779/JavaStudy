package com.sist.client;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.sist.common.ImageChange;
import com.sist.manager.MagazineDetailManager;
import com.sist.vo.MagazineDetailVO;

public class MagazineDetailPanel extends JPanel implements ActionListener{
	
	ControlPanel cp;
	JLabel img;
	JLabel la1;
	JTextArea ta;
	JButton b1;
	public MagazineDetailPanel(ControlPanel cp) {
		this.cp = cp;
		img = new JLabel();
		this.add(img);
		la1 = new JLabel();
		la1.setFont(new Font("맑은 고딕",Font.BOLD,18));
		this.add(la1);
		ta = new JTextArea();
		ta.setEditable(false);
		this.add(ta);
		b1 = new JButton("목록");
		this.add(b1);
		
		this.setLayout(null);
		
		img.setBounds(30, 30, 850, 550);
		la1.setBounds(890, 30, 570, 35);
		ta.setBounds(890, 75, 570, 510);
		b1.setBounds(1370, 710, 100, 35);
		
		b1.addActionListener(this);
	}
	
	public void MagazinePrint(ArrayList<MagazineDetailVO> list) {
		try {
			for(MagazineDetailVO vo : list) {
				la1.setText(vo.getTitle());
				String temp = "";
				int cnt = 0;
				for(int i = 0;i<vo.getStory().length();i++) {
					if(cnt==50) {
						temp+="\n";
						cnt = 0;
					}
					temp+=String.valueOf(vo.getStory().charAt(i));
					cnt++;
				}
				System.out.println(temp);
				ta.setText(temp);
				URL url = new URL("https:"+vo.getImage());
				Image image = ImageChange.getImage(new ImageIcon(url), 850, 550);
				img.setIcon(new ImageIcon(image));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			cp.card.show(cp, "Home");
		}
		
	}
}