package com.sist.main;
// 패키지가 다르면 클래스 사용시에 import
import com.sist.manager.*; // Student / StudentSystem
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentSystem ss=new StudentSystem();
		ss.input();
		for(Student s:ss.student)
		{
			System.out.println(s.hakbun);
			System.out.println(s.name);
			System.out.println(s.kor);
			System.err.println(s.eng);
			System.out.println(s.math);
			System.out.println("=======");
		}
	}

}
