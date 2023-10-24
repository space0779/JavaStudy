package com.sist.seoul;
import java.io.*;
import java.util.*;
public class SeoulManager {
	public Seoul[] seoulAllData(int i)
	{
		Seoul[] seoul=null;
		String path="c:\\javaDev\\";
		if(i==1)
			path+="seoul_location.txt";
		else
			path+="seoul_nature.txt";
		
		FileReader fr=null;
		try
		{
			fr=new FileReader(path);
			String data="";
			int j=0;
			while((j=fr.read())!=-1) // 파일 끝까지 읽어라
			{
				// read() => 한글자 읽기 => 정수로 읽는다
				// A => 65
				data+=(char)j;
			}
			StringTokenizer st=new StringTokenizer(data,"\n");
			seoul=new Seoul[st.countTokens()];// 273 , 110
			
			// 분리 => 데이터를 Seoul[]에 첨부
			i=0;
			// 분리
			String[] seouls=data.split("\n");
			
			for(String s:seouls)
			{
				st=new StringTokenizer(s,"|");
				seoul[i]=new Seoul();
				// 문자열 => 정수형으로 변경 Integer.parseInt()
				// token (단어) => String st.nextToken()
				seoul[i].setNo(Integer.parseInt(st.nextToken()));
				seoul[i].setName(st.nextToken());
				seoul[i].setContent(st.nextToken());
				seoul[i].setAddress(st.nextToken());
				i++;
			}
					 
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
			}catch(Exception ex) {}
			
		}
		return seoul;
	}
	

}
