package com.sist.manager;
//같은 패키지상에 있는 경우 => default/public/protected
//import를 사용하지 않는다 
//=> 프랜들리
import java.util.*;
/*
 *     캡슐화 / 오버라이딩 / 상속 / 포함 
 *     -----  --------         ---
 *                        | POJO 
 *      *** 1) 결합성 
 *      2) 응집성 
 *      *** 3) 가독성 
 *      4) 최적화 
 *    
 */
public class StudentSystem {
    public Student[] students=new Student[3];
    // 입력 
    // 메소드 => 1) 멤버메소드 , 2) static메소드 , 3) 생성자 
    // 접근 지정어 => public 
    public void input()
    {
    	Scanner scan=new Scanner(System.in);
    	for(int i=0;i<students.length;i++)
    	{
    		students[i]=new Student();
    		System.out.print("학번 입력:");
    		students[i].hakbun=scan.nextInt();//public
    		
    		System.out.print("이름 입력:");
    		students[i].name=scan.next();
    		
    		System.out.print("국어 입력:");
    		students[i].kor=scan.nextInt();
    		
    		System.out.print("영어 입력:");
    		students[i].eng=scan.nextInt();
    		
    		System.out.print("수학 입력:");
    		students[i].math=scan.nextInt();
    	
    	}
    }
}