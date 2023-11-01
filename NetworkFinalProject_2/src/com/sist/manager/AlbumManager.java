package com.sist.manager;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

import com.sist.vo.AlbumVO;

public class AlbumManager {
	public static ArrayList<AlbumVO> aList=new ArrayList<AlbumVO>();
	static {
//		FileReader fr=null;
//		ObjectOutputStream oos=null;
//		FileOutputStream fos=null;
//		try
//		{
//			fr = new FileReader("c:\\java_data\\music.txt");
//			StringBuffer sb = new StringBuffer();
//			int i = 0;
//			while((i=fr.read())!=-1) {
//				sb.append((char)i);
//			}
//			fr.close();
//			String[] cates = sb.toString().split("\n");
//			for(String s:cates) {
//				StringTokenizer st = new StringTokenizer(s,"|");
//				AlbumVO vo = new AlbumVO();
//				vo.setNumber(Integer.parseInt(st.nextToken().replace("\ufeff","")));
//				vo.setPoster(st.nextToken());
//				vo.setAlbum(st.nextToken());
//				vo.setSong(st.nextToken());
//				vo.setSinger(st.nextToken());
//				vo.setDate(st.nextToken());
//				aList.add(vo);
//			}
//			fos = new FileOutputStream("c:\\java_data\\ac.txt");
//			oos = new ObjectOutputStream(fos);
//			oos.writeObject(aList);
//		}catch(Exception ex)
//		{
//			ex.printStackTrace();
//		}
//		finally
//		{
//			try {
//				fos.close();
//				oos.close();
//			} catch (Exception ex2) {
//				
//				ex2.printStackTrace();
//			}
//		}
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("c:\\java_data\\ac.txt");
			ois = new ObjectInputStream(fis);
			aList = (ArrayList<AlbumVO>)ois.readObject();
		} catch (Exception ex) {
			
		}
		finally {
			try {
				fis.close();
				ois.close();
			} catch (Exception ex2) {
				
			}
		}
	}
//	public static void main(String[] args) {
//		AlbumManager mm = new AlbumManager();
//		for(AlbumVO m :aList) {
//			System.out.println(m.getNumber());
//			System.out.println(m.getPoster());
//			System.out.println(m.getAlbum());
//			System.out.println(m.getDate());
//			System.out.println(m.getSong());
//			System.out.println(m.getSinger());
//			System.out.println(m.getDate());
//			System.out.println("============================");
//		}
//	}
	public int MagazineTotalPage() {
		int total = (int)(Math.ceil(aList.size()/20.0));
		
		return total;
	}
	
	public ArrayList<AlbumVO> MagazineCategoryData(int no){
		ArrayList<AlbumVO> list = new ArrayList<AlbumVO>();
		int end = no*20;
		int start = end-20;
		if(no!=(int)(Math.ceil(aList.size()/20.0))) {
			for(int i =start;i<end;i++) {
				list.add(aList.get(i));
			}
		}
		else {
			start = (no-1)*20;
			end = aList.size();
			for(int i = start;i<end;i++) {
				list.add(aList.get(i));
			}
		}
		return list;
	}

	public ArrayList<AlbumVO> AlbymData(String title) {
		// TODO Auto-generated method stub
		return null;
	}
}
