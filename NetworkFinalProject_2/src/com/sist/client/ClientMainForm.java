package com.sist.client;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import com.sist.client.*;
import com.sist.common.ImageChange;
import com.sist.manager.MagazineManager;
import com.sist.vo.MagazineVO;

public class ClientMainForm extends JFrame implements ActionListener{
	MenuPanel mp = new MenuPanel();
	JLabel logo = new JLabel();
	ControllPanel cp = new ControllPanel();
	Login login = new Login();
	MagazineManager mm = new MagazineManager();
	public ClientMainForm() {
		this.setLayout(null);
		logo.setBounds(10, 15, 100, 150);
		logo.setIcon(new ImageIcon(ImageChange.getImage(new ImageIcon("c:\\javaDev\\logo.png"), 100, 150)));
		
		this.add(logo);
		
		mp.setBounds(10,175,100,250);
		this.add("North",mp);
		
		cp.setBounds(135,15,1500,750);
		this.add(cp);
		
		this.setSize(1650, 840);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		mp.b1.addActionListener(this);
		mp.b2.addActionListener(this);
		mp.b3.addActionListener(this);
		mp.b4.addActionListener(this);
		mp.b5.addActionListener(this);
		
		login.b1.addActionListener(this);
		
		ArrayList<MagazineVO> list = mm.MagazineCategoryData(1);
		cp.hp.cardPrint(list);
		
		
	}
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");//화면 변경
		}
		catch(Exception ex) {}
		
		new ClientMainForm();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mp.b1) {
			cp.card.show(cp, "Home");
		}
		else if(e.getSource()==mp.b2) {
			cp.card.show(cp, "Search");
		}
		else if(e.getSource()==mp.b3) {
			cp.card.show(cp, "Chat");
		}
		else if(e.getSource()==mp.b4) {
			cp.card.show(cp, "Board");
		}
		else if(e.getSource()==mp.b5) {
			System.exit(0);
		}
		else if(e.getSource()==login.b1) {
			login.setVisible(false);
			this.setVisible(true);
		}
		
	}
}