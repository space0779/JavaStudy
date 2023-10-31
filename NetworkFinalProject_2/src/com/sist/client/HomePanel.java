package com.sist.client;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import com.sist.manager.FoodManager;
import com.sist.vo.FoodCategoryVO;
public class HomePanel extends JPanel{
   JButton b1,b2,b3;
   PosterCard[] psc=new PosterCard[12];
   FoodManager fm=new FoodManager();
   JPanel pan=new JPanel();
   public HomePanel()
   {
	   JPanel p=new JPanel();
	   p.setLayout(new GridLayout(1,3,5,5));
	   b1=new JButton("믿고 보는 맛집 리스트");
	   b1.setPreferredSize(new Dimension(300,45));
	   b2=new JButton("지역별 인기 맛집");
	   b2.setPreferredSize(new Dimension(300,45));
	   b3=new JButton("메뉴별 인기 맛집");
	   b3.setPreferredSize(new Dimension(300,45));
	   p.add(b1);p.add(b2);p.add(b3);
	   
	   pan.setLayout(new GridLayout(4,3,5,5));
	   //배치
	   setLayout(new BorderLayout());
	   add("North",p);
	   add("Center",pan);
			   
   }
   public void cardPrint(ArrayList<FoodCategoryVO> list)
   {
	   int i=0;
	   for(FoodCategoryVO vo:list)
	   {
		   psc[i]=new PosterCard(vo);
		   pan.add(psc[i]);
		   i++;
	   }
   }
   public void cardInit()
   {
	   pan.removeAll();// 데이터 제거
	   pan.validate();// Panel 재배치
   }
}