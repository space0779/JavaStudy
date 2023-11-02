package com.sist.manager;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.sist.vo.RealTimeChartVO;

public class RealTimeChartManager {
	private static ArrayList<RealTimeChartVO> rtList = new ArrayList<RealTimeChartVO>();
	public RealTimeChartManager() {
//		FileReader fr = null;
//		FileOutputStream fos = null;
//		ObjectOutputStream oos = null;
//		try {
//			fr = new FileReader("c:\\java_data\\chartdata.txt");
//			int i = 0;
//			StringBuffer sb = new StringBuffer();
//			while((i=fr.read())!=-1) {
//				sb.append((char)i);
//			}
//			String[] data = sb.toString().split("\n");
//			for(String s:data) {
//				String[] ss = s.split("\\|");
//				RealTimeChartVO vo = new RealTimeChartVO();
//				vo.setNo(Integer.parseInt(ss[0].replace("\ufeff", "")));
//				if(ss[1].contains("상승")) {
//					vo.setGrade(ss[1].replace("상승", "▲"));
//				}
//				else if(ss[1].contains("하강")) {
//					vo.setGrade(ss[1].replace("하강", "▼"));
//				}
//				else {
//					vo.setGrade(ss[1].replace("유지", "-"));
//				}
//				vo.setTitle(ss[2]);
//				vo.setArtist(ss[3]);
//				vo.setAlbum(ss[4]);
//				vo.setImage(ss[5]);
//				vo.setLike(Integer.parseInt(ss[6].replaceAll("[^0-9]", "")));
//				vo.setAllListener(Integer.parseInt(ss[7].replaceAll("[^0-9]", "")));
//				vo.setAllplayCount(Integer.parseInt(ss[8].replaceAll("[^0-9]", "")));
//				
//				rtList.add(vo);
//			}
//			fos = new FileOutputStream("c:\\java_data\\rtdata.txt");
//			oos = new ObjectOutputStream(fos);
//			oos.writeObject(rtList);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		finally {
//			try {
//				
//			} catch (Exception e2) {
//				// TODO: handle exception
//			}
//		}
		
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("c:\\java_data\\rtdata.txt");
			ois = new ObjectInputStream(fis);
			rtList = (ArrayList<RealTimeChartVO>)ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
//	public static void main(String[] args) {
//		new RealTimeChartManager();
//		for(RealTimeChartVO vo:rtList) {
//			System.out.println(vo.getGrade());
//			System.out.println(vo.getTitle());
//			System.out.println(vo.getAllListener());
//			System.out.println("==========================");
//		}
//	}
	public ArrayList<RealTimeChartVO> ReadMusicData(){
		return rtList;
	}

}
