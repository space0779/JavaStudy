package com.sist.main;

import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	Document doc=
        			Jsoup.connect("https://www.visitbusan.net/index.do?menuCd=DOM_000000202008000000").get();
        	Elements link=doc.select("p.tit a");
        	for(int i=0;i<link.size();i++)
        	{
        	   try
        	   {
        		//System.out.println(link.get(i).attr("href"));
        		String subLink="https://www.visitbusan.net"+link.get(i).attr("href");
        		System.out.println(subLink);
        		Document doc2=
        			Jsoup.connect(subLink).get();
        		// 제목
        		/*
        		 *  <h3 class="tit_movie">
                <span class="txt_tit">
                    그대들은 어떻게 살 것인가
                </span>
                    <span class="txt_tag">
                        <span class="txt_state">상영중</span>
                    </span>
            </h3>
        		 */
        		Element title=doc2.selectFirst("a");
        		System.out.println(title.text());
        		Element state=doc2.selectFirst("span.date");
        		System.out.println(state.text());
              /*
               *   <div class="detail_cont">
            <div class="inner_cont">
                        <dl class="list_cont">
                                <dt>개봉</dt>
                            <dd>2023.10.03</dd>
                        </dl>
                    <dl class="list_cont">
                        <dt>장르</dt>
                        <dd>코미디</dd>
                    </dl>
                    <dl class="list_cont">
                        <dt>국가</dt>
                        <dd>한국</dd>
                    </dl>
                        <dl class="list_cont">
                        <dt>등급</dt>
                        <dd>
                            12세이상관람가
                        </dd>
                        </dl>
                    <dl class="list_cont">
                    <dt>러닝타임</dt>
                    <dd>
                        119분
                    </dd>
                    </dl>
            </div>
            
             <div class="thumb_img">
                <span class="bg_img" style="background-image:url(https://img1.daumcdn.net/thumb/C408x596/?fname=https%3A%2F%2Ft1.daumcdn.net%2Fmovie%2F814364da4037f74217243eeee6b4648d7dc2fc79)"></span>
                
            </div>
               */
        		Element dd1=doc2.select("div.detail_cont dl.list_cont dd").get(0);
        		Element dd2=doc2.select("div.detail_cont dl.list_cont dd").get(1);
        		Element dd3=doc2.select("div.detail_cont dl.list_cont dd").get(2);
        		Element dd4=doc2.select("div.detail_cont dl.list_cont dd").get(3);
        		Element dd5=doc2.select("div.detail_cont dl.list_cont dd").get(4);
        		//System.out.println(detail);
        		//String temp="";
        		System.out.println(dd1.text());
        		System.out.println(dd2.text());
        		System.out.println(dd3.text());
        		System.out.println(dd4.text());
        		System.out.println(dd5.text());
        		
        		Element poster=doc2.selectFirst("div.info_poster span.bg_img");
        		String image="";
        		try
        		{
        			image=poster.attr("style");
        		}catch(Exception ex)
        		{
        			image="이미지없음";
        		}
        		/*image=image.substring(image.indexOf("(")+1,
        				   image.lastIndexOf(")"));
        		System.out.println(image);*/
        		
        		String msg=(i+1)+"|"
        		          +title.text()+"|"
        		          +state.text()+"|"
        		          +image+"|"
        		          +dd1.text()+"|"
        		          +dd2.text()+"|"
        		          +dd3.text()+"|"
        		          +dd4.text()+"|"
        		          +dd5.text()+"\r\n";
        		//msg=msg.substring(0,msg.lastIndexOf("|"));
        		//msg+="\r\n";
        		
        		FileWriter fw=
        				new FileWriter("c:\\java_data\\trip.txt",true);
        		fw.write(msg);
        		fw.close();
        	   }catch(Exception ex) {}
        	}
        }catch(Exception ex) {}
	}

}