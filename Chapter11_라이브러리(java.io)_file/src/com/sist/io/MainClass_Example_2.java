package com.sist.io;
import java.util.*;
import java.io.*;
// 입출력 => IO
// ----- 메모리 제어 ==> IO를 이용해서 파일로 전송
// 캡슐화
class Student
{
	private int hakbun;
	private String name;
	private int kor,eng,math;
	private int total;
	private double avg;
	// 기능 => 읽기/쓰기
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
}
class StudentManager
{
	private static ArrayList<Student> list=
			new ArrayList<Student>();
	static 
	{
		FileReader fr=null;
		try
		{
			// 1|홍길동|90|90|90|270|90.0\n
			fr=new FileReader("c:\\java_data\\student.txt");
			String data="";
			int i=0;
			while((i=fr.read())!=-1)
			{
				data+=(char)i;
			}
			
			String[] stds=data.split("\n");
			// 한명의 정보를 저장
			for(String s:stds)
			{
				StringTokenizer st=
						new StringTokenizer(s,"|");
				Student ss=new Student();
				ss.setHakbun(Integer.parseInt(st.nextToken()));
				ss.setName(st.nextToken());
				ss.setKor(Integer.parseInt(st.nextToken()));
				ss.setEng(Integer.parseInt(st.nextToken()));
				ss.setMath(Integer.parseInt(st.nextToken()));
				ss.setTotal(Integer.parseInt(st.nextToken()));
				ss.setAvg(Double.parseDouble(st.nextToken()));
				list.add(ss);
				
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
		
	}
	// 파일을 읽어서 초기화
	public ArrayList<Student> studentAllData()
	{
		return list;
	}
	// 학생 한명에 대한 상세보기
	public Student studentDetailData(int hakbun)
	{
		Student ss=new Student();
		for(Student s:list)
		{
			if(s.getHakbun()==hakbun)
			{
				ss=s;
				break;
			}
		}
		return ss;
	}
	public void studentInsert(Student ss)
	{
		list.add(ss);
	}
	public void studentUpdate(int hakbun,Student ss)
	{
		int i=0;
		for(i=0;i<list.size();i++)
		{
			Student s=list.get(i);
			if(s.getHakbun()==hakbun)
			{
				break;
			}
		}
		list.set(i, ss);// 수정하기
	}
	public void studentDelete(int hakbun)
	{
		int i=0;
		for(i=0;i<list.size();i++)
		{
			Student s=list.get(i);
			if(s.getHakbun()==hakbun)
			{
				break;// i가 몇번인지 확인 => index
			}
		}
		list.remove(i);
	}
	public void save()
	{
		FileWriter fw=null;
		try
		{
			fw=new FileWriter("c:\\java_data\\student.txt");
			String msg="";
			for(Student s:list)
			{
				msg+=s.getHakbun()+"|"
						+s.getName()+"|"
						+s.getKor()+"|"
						+s.getEng()+"|"
						+s.getMath()+"|"
						+s.getTotal()+"|"
						+s.getAvg()+"\r\n";
			}
			msg=msg.substring(0,msg.lastIndexOf("\r\n"));
			fw.write(msg);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				
			}catch(Exception ex) {}
		}
	}
	public void getRead()
	{
		
	}
	
}
public class MainClass_Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
