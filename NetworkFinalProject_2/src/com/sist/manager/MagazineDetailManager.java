package com.sist.manager;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.sist.vo.*;
public class MagazineDetailManager {
	private static ArrayList<MagazineDetailVO> mdList = new ArrayList<MagazineDetailVO>();
	static {
//		FileReader fr = null;
//		FileOutputStream fos = null;
//		ObjectOutputStream oos = null;
//		try {
//			fr = new FileReader("c:\\java_data\\magazineDetail.txt");
//			int i = 0;
//			StringBuffer sb = new StringBuffer();
//			while((i=fr.read())!=-1) {
//				sb.append((char)i);
//			}
//			String[] data = sb.toString().split("\n");
//			for(String dt:data) {
//				MagazineDetailVO vo = new MagazineDetailVO();
//				String[] dd = dt.split("\\|");
//				vo.setCno(Integer.parseInt(dd[0]));
//				vo.setTitle(dd[1]);
//				vo.setImage(dd[2]);
//				vo.setStory(dd[3]);
//				
//				mdList.add(vo);
//			}
//			fr.close();
//			fos = new FileOutputStream("c:\\java_data\\mdlist.txt");
//			oos = new ObjectOutputStream(fos);
//			oos.writeObject(mdList);
//			
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		finally {
//			try {
//				fos.close();
//				oos.close();
//				
//			} catch (Exception e2) {
//				// TODO: handle exception
//			}
//		}
		
		
		
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("c:\\java_data\\mdlist.txt");
			ois = new ObjectInputStream(fis);
			mdList = (ArrayList<MagazineDetailVO>)ois.readObject();
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
//		MagazineDetailManager mdm = new MagazineDetailManager();
//		for(MagazineDetailVO vo:mdList) {
//			System.out.println(vo.getCno());
//			System.out.println(vo.getImage());
//			System.out.println(vo.getTitle());
//			System.out.println(vo.getStory());
//		}
//	}
	public ArrayList<MagazineDetailVO> MagazineInfoData(int no){
		ArrayList<MagazineDetailVO> list = new ArrayList<MagazineDetailVO>();
		for(MagazineDetailVO vo:mdList) {
			if(vo.getCno() == no) {
				list.add(vo);
				break;
			}
		}
		
		return list;
	}

}