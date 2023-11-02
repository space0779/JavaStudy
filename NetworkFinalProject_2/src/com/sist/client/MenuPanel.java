package com.sist.client;
// Home : 맛집 카테고리 
// 검색 
// 채팅 
// 오늘의 뉴스 
// 커뮤니티 => 파일 입출력 
import javax.swing.*;
import java.awt.*;
public class MenuPanel extends JPanel{
   public JButton b1,b2,b3,b4,b5,b6;
   public MenuPanel()
   {
	   b1=new JButton("HOME");
	   b2=new JButton("Search");
	   b3=new JButton("Chat");
	   b4=new JButton("Community");
	   b5=new JButton("Chart");
	   b6=new JButton("Exit");
	   setLayout(new GridLayout(6, 1,10,10));
	   add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);
   }
}