package com.sist.temp;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MainClass_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	for(int i=1;i<=348;i++)
        	{
        	  Document doc=
        			Jsoup.connect("https://www.menupan.com/restaurant/bestrest/bestrest.asp?page="+i+"&trec=8679&pt=rt").get();
        	
        	  Elements link=doc.select("div.rankingList p.listPhoto a");
        	  for(int j=0;j<link.size();j++)
        	  {
        		  System.out.println("https://www.menupan.com"+link.get(j).attr("href"));
        	  }
        	}
        }catch(Exception ex) {}
	}

}
