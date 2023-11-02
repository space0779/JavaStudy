package com.sist.manager;
import java.util.*;
import java.io.*;
import com.sist.vo.*;
public class MagazineManager {
	private static ArrayList<MagazineVO> mList=new ArrayList<MagazineVO>();
	
	static
	{
//		FileReader fr=null;
//		FileOutputStream fos=null;
//		ObjectOutputStream oos=null;
//		
//		
//		try {
//			fr=new FileReader("c:\\java_data\\magazine.txt");
//			int i=0;
//			String data="";
//			while((i=fr.read())!=-1)
//			{
//				data+=(char)i;
//			}
//			fr.close();
//			
//			String[] mag=data.split("\n");
//			for(String s:mag)
//			{
//				StringTokenizer st=new StringTokenizer(s,"|");
//				MagazineVO mz=new MagazineVO();
//				mz.setNo(Integer.parseInt(st.nextToken()));
//				mz.setTitle(st.nextToken());
//				mz.setImage(st.nextToken());
//				mz.setDate(st.nextToken());
//				mz.setLink(st.nextToken());
//				mList.add(mz);
//					}
//			fos=new FileOutputStream("c:\\java_data\\mag.txt");
//			oos=new ObjectOutputStream(fos);
//			oos.writeObject(mList);
//			
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//			
//		}finally {
//			try {
//				fr.close();
//			}catch(Exception e)
//			{
//			}
//		}
		
		
		
		
		ObjectInputStream ois=null;
		FileInputStream fis=null;
		try {
			
			fis=new FileInputStream("c:\\java_data\\mag.txt");
			ois=new ObjectInputStream(fis);
			mList=(ArrayList<MagazineVO>)ois.readObject();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try {
				fis.close();
				ois.close();
				
			}catch(Exception e)
			{
				
			}
		}
		

	}
//	public static void main(String[] args) {
//		MagazineManager mm=new MagazineManager();
//		System.out.println("저장완료");
//		
//	}
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