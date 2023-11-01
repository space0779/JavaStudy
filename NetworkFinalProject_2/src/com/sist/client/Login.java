package com.sist.client;

import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Login extends JFrame{
	JLabel la1,la2,la3;
	JTextField tf1,tf2;
	JRadioButton rb1,rb2;
	JButton b1,b2;
	
	public Login() {
		setLayout(null);
		
		la1 = new JLabel("아이디");
		la2 = new JLabel("이름");
		la3 = new JLabel("성별");
		
		tf1 = new JTextField();
		tf2 = new JTextField();
		
		rb1 = new JRadioButton("남자");
		rb2 = new JRadioButton("여자");
		rb1.setSelected(true);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		b1 = new JButton("로그인");
		b2 = new JButton("취소");
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		
		la1.setBounds(10, 15, 60, 30);
		tf1.setBounds(75, 15, 150, 30);
		
		la2.setBounds(10, 50, 60, 30);
		tf2.setBounds(75, 50, 150, 30);
		
		la3.setBounds(10, 85, 60, 30);
		rb1.setBounds(75, 85, 70, 30);
		rb2.setBounds(150, 85, 70, 30);
		
		p.setBounds(10, 125, 215, 35);
		
		this.add(la1);
		this.add(tf1);
		
		this.add(la2);
		this.add(tf2);
		
		this.add(la3);
		this.add(rb1);
		this.add(rb2);
		
		this.add(p);
		
		setBounds((1024-255)/2, (768-200)/2, 255, 200);
		this.setVisible(true);
		
	}

}