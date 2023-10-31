package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Document doc=
					Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements rank=doc.select("td.info a");
			
			for(int i=0;i<rank.size();i++)
			{
				System.out.println(rank.get(i).text());
				
			}
				
		}catch(Exception ex) {}
			
	}

}
