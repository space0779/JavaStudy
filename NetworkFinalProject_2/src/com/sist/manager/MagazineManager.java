package com.sist.manager;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

import com.sist.vo.MagazineVO;

public class MagazineManager {
	public static ArrayList<MagazineVO> mList = new ArrayList<MagazineVO>();
	static{
//		FileReader fr = null;
//		ObjectOutputStream oos = null;
//		FileOutputStream fos = null;
//		try {// 정상 수행 문장
//			fr = new FileReader("c:\\java_data\\Magazine.txt");
//			StringBuffer sb = new StringBuffer();
//			int i = 0;
//			while((i=fr.read())!=-1) {
//				sb.append((char)i);
//			}
//			fr.close();
//			String[] cates = sb.toString().split("\n");
//			for(String s:cates) {
//				StringTokenizer st = new StringTokenizer(s,"|");
//				MagazineVO vo = new MagazineVO();
//				vo.setNo(Integer.parseInt(st.nextToken().replace("\ufeff","")));
//				vo.setTitle(st.nextToken());
//				vo.setImage(st.nextToken());
//				vo.setDate(st.nextToken());
//				vo.setLink(st.nextToken());
//				mList.add(vo);
//			}
//			fos = new FileOutputStream("c:\\java_data\\mc.txt");
//			oos = new ObjectOutputStream(fos);
//			oos.writeObject(mList);
//		} catch (Exception e) {//에러 확인 후 복구
//			// TODO: handle exception
//			e.printStackTrace();
//		}finally {//무조건 수행하는 문장
//			try {
//				fos.close();
//				oos.close();
//			} catch (Exception e2) {
//				// TODO: handle exception
//				e2.printStackTrace();
//			}
//		}
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("c:\\java_data\\mc.txt");
			ois = new ObjectInputStream(fis);
			mList = (ArrayList<MagazineVO>)ois.readObject();
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
	
	public static void main(String[] args) {
		MagazineManager mm = new MagazineManager();
		for(MagazineVO m :mList) {
			System.out.println(m.getNo());
			System.out.println(m.getTitle());
			System.out.println(m.getImage());
			System.out.println(m.getDate());
			System.out.println(m.getLink());
			System.out.println("============================");
		}
	}
	public int MagazineTotalPage() {
		int total = (int)(Math.ceil(mList.size()/20.0));
		
		return total;
	}
	
	public ArrayList<MagazineVO> MagazineCategoryData(int no){
		ArrayList<MagazineVO> list = new ArrayList<MagazineVO>();
		int end = no*20;
		int start = end-20;
		if(no!=(int)(Math.ceil(mList.size()/20.0))) {
			for(int i =start;i<end;i++) {
				list.add(mList.get(i));
			}
		}
		else {
			start = (no-1)*20;
			end = mList.size();
			for(int i = start;i<end;i++) {
				list.add(mList.get(i));
			}
		}
		return list;
	}
}