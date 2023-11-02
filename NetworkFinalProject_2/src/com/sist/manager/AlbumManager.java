package com.sist.manager;

import java.util.ArrayList;

import com.sist.client.ControlPanel;
import com.sist.client.SearchPanel;
import com.sist.vo.AlbumVO;
import com.sist.vo.MagazineDetailVO;

import java.io.*;
public class AlbumManager {
	private static ArrayList<AlbumVO> aList=new ArrayList<AlbumVO>();
	ControlPanel cp;
	SearchPanel sp;
	static
	{
//		FileReader fr = null;
//		FileOutputStream fos = null;
//		ObjectOutputStream oos = null;
//		try {
//			fr = new FileReader("c:\\java_data\\music.txt");
//			int i=0;
//			StringBuffer sb=new StringBuffer();
//			while((i=fr.read())!=-1)
//			{
//				sb.append((char)i);
//			}
//			
//			
//			
//			String[] data = sb.toString().split("\n");
//			for(String dt:data) {
//				AlbumVO vo = new AlbumVO();
//				String[] dd = dt.split("\\|");
//				vo.setNo(Integer.parseInt(dd[0]));
//				vo.setImage(dd[1]);
//				vo.setAlbum(dd[2]);
//			    vo.setTitle(dd[3]);
//				vo.setSinger(dd[4]);
//				vo.setDate(dd[5]);
//				aList.add(vo);
//			}
//			fr.close();
//			fos=new FileOutputStream("c:\\java_data\\ab.txt");
//			oos = new ObjectOutputStream(fos);
//			oos.writeObject(aList);
//			
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		finally {
//			try {
//				fr.close();
//				fos.close();
//				oos.close();
//			}catch(Exception e)
//			{
//				
//			}
//		}
		
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("c:\\java_data\\ab.txt");
			ois = new ObjectInputStream(fis);
			aList = (ArrayList<AlbumVO>)ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			try {
				fis.close();
				ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
//	public static void main(String[] args) {
//		AlbumManager am=new AlbumManager();
//		for(AlbumVO vo:aList)
//		{
//			System.out.println(vo.getNo());
//			System.out.println(vo.getImage());
//			System.out.println(vo.getAlbum());
//			System.out.println(vo.getTitle());
//			System.out.println(vo.getSinger());
//			System.out.println(vo.getDate());
//			System.out.println("======================");
//		}
//	}
	
	public ArrayList<AlbumVO> FindData(String title,String se)
	   {
		   ArrayList<AlbumVO> list=
				   new ArrayList<AlbumVO>();
		   
		   
		   for(AlbumVO fvo:aList)
		   {
			  if(se.equals("곡명")) 
			  {
			   if(fvo.getTitle().contains(title))
			   {
				   list.add(fvo);
			   }
			  }else if(se.equals("가수명"))
			  {
				  if(fvo.getSinger().contains(title))
				   {
					   list.add(fvo);
				   }
			  }
			   
			   
		   }
		   return list;
	   }
    public ArrayList<AlbumVO> AlbumDataRead(){
		
		return aList;
	}
	
}