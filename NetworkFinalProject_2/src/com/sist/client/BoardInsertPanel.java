package com.sist.client;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.sist.manager.BoardManager;
import com.sist.vo.BoardVO;

public class BoardInsertPanel extends JPanel implements ActionListener{
	ControllPanel cp;
	JLabel la,la1,la2,la3,la4;
	JTextField tf1,tf2,tf3;
	JTextArea ta;
	JButton b1,b2;
	public BoardInsertPanel(ControllPanel cp) {
		this.cp = cp;
		la = new JLabel("자유 게시판");
		this.setLayout(null);
		la.setHorizontalAlignment(JLabel.CENTER);
		la.setFont(new Font("굴림체",Font.BOLD,35));
		la.setBounds(10, 15, 710, 50);
		this.add(la);
		
		la1 = new JLabel("이름");
		la2 = new JLabel("제목");
		la3 = new JLabel("내용");
		la4 = new JLabel("비밀번호");
		
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		
		ta = new JTextArea();
		JScrollPane js = new JScrollPane(ta);
		
		b1 = new JButton("글쓰기");
		b2 = new JButton("취소");
		
		la1.setBounds(10, 75, 70, 30);
		tf1.setBounds(85, 75, 150, 30);
		
		la2.setBounds(10, 115, 70, 30);
		tf2.setBounds(85, 115, 450, 30);
		
		la3.setBounds(10, 155, 70, 30);
		js.setBounds(85, 155, 550, 350);
		
		la4.setBounds(10, 515, 70, 30);
		tf3.setBounds(85, 515, 150, 30);
		
		this.add(la1);
		this.add(tf1);
		this.add(la2);
		this.add(tf2);
		this.add(la3);
		this.add(js);
		this.add(la4);
		this.add(tf3);
		
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		p.setBounds(10, 555, 625, 40);
		this.add(p);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			String name = tf1.getText();
			if(name.trim().length()<1) {
				tf1.requestFocus();
				return;
			}
			String subject = tf2.getText();
			if(subject.trim().length()<1) {
				tf2.requestFocus();
				return;
			}
			String content = ta.getText();
			if(content.trim().length()<1) {
				ta.requestFocus();
				return;
			}
			String pwd = tf3.getText();
			if(pwd.trim().length()<1) {
				tf3.requestFocus();
				return;
			}
			BoardManager bm = new BoardManager();
			BoardVO vo = new BoardVO();
			vo.setNo(bm.boardSequence());
			vo.setName(name);
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setPwd(pwd);
			vo.setHit(0);
			vo.setRegdate(new Date());
			bm.boardInsert(vo);
			
			cp.card.show(cp, "Board");
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			ta.setText("");
			cp.blp.boardList();
		}
		else if(e.getSource()==b2) {
			cp.card.show(cp, "Board");
			cp.blp.boardList();
		}
	}

}