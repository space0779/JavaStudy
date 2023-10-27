package com.sist.student;
import java.util.*;
// 액션 
/*
 *   클래스 
 *   -----
 *    1) 데이터 ===> 오라클의 column
 *       ------------------------
 *       데이터형을 만든다 
 *       => Music => 가수명 , 제목 , 앨범...
 *       => Movie => 제목 , 감독, 출연...
 *       -----> 캡슐화 
 *              변수에 읽기/쓰기 추가 
 *    2) 사용자 요청 => 기능 
 *       --------- 목록출력 , 상세보기,찾기,예매 , 추천...
 *       -----> 상속 / 포함 / 오버라이딩 
 *              -------------------
 *    3) 데이터가 여러개일 경우 => 모아서 관리 
 *       => 컬렉션 / 배열 
 *                 ---- 고정하기 어렵다 
 *           | 계속 갱신 , 추가 ==> 가변 
 *       => 배열 대신 컬렉션을 이용해서 처리 편리 
 *                  ----
 *                  List => 중복허용 , 순서(인덱스)
 *                   |
 *                 ArrayList => 비동기 , 데이터베이스 프로그램 특성화 
 *                  => 읽기 기능 => get() 
 *                  => 총갯수 => size()
 *                  => 추가  => add()
 *                  => 실제 수정 => 오라클에서 수정 ,삭제 , 추가 
 */
public class StudentManager {
   private static ArrayList<Student> list=
		   new ArrayList<Student>();
   // 여러명 저장 
   // 초기화 => 생성자 
   public StudentManager()
   {
	   list.add(new Student(1, "홍길동", 89, 79, 90));
	   list.add(new Student(2, "심청이", 80, 75, 95));
	   list.add(new Student(3, "춘향이", 78, 73, 92));
	   list.add(new Student(4, "이순신", 67, 72, 95));
	   list.add(new Student(5, "박문수", 90, 70, 80));
   }
   // => 리턴형 / 매개변수 
   // 목록 출력 
   public ArrayList<Student> studentAllData()
   {
	   return list;
   }
   // 상세보기
   public Student studentDetailData(int hakbun)
   {
	   Student s=new Student();
	   for(Student std:list)
	   {
		   if(std.getHakbun()==hakbun)
		   {
			   s=std;
			   break;
		   }
	   }
	   return s;
   }
   // 자동 증가 => sequence ==> 중복이 없는 데이터를 만든다 
   // CREATE SEQUENCE 
   // MYSQL => auto_increment()
   public int hakbunMaxData()
   {
	   int max=0;
	   for(Student std:list)
	   {
		   if(max<std.getHakbun())
			   max=std.getHakbun();
	   }
	   return max+1;
   }
   // 학생 추가 ==> add
   // 추가 , 수정 => 매개변수가 많다 (클래스로 전송)
   // 순서없이 처리 
   public void studentInsert(Student std)
   {
	   list.add(std);
	   System.out.println("학생 추가 완료!!");
   }
   // 학생 수정 ==> set
   public void studentUpdate(Student std)
   {
	   int index=0;
	   for(int i=0;i<list.size();i++)
	   {
		   Student s=list.get(i);
		   if(s.getHakbun()==std.getHakbun())
		   {
			   index=i;
			   break;
		   }
	   }
	   
	   list.set(index, std);
	   System.out.println("수정이 완료되었습니다!!");
   }
   // 학생 삭제 ==> remove
   // 인덱스 
   // remove(int index) => set(int index,데이터)
   public void studentDelete(int hakbun)
   {
	   for(int i=0;i<list.size();i++)
	   {
		   Student s=list.get(i);
		   if(s.getHakbun()==hakbun)
		   {
			   list.remove(i);
			   System.out.println(hakbun+"학번을 삭제하였습니다");
			   break;
		   }
	   }
   }
   // 학생 찾기 ==> contains
   public ArrayList<Student> studentFindData(String name)
   {
	   ArrayList<Student> arr=
			   new ArrayList<Student>();
	   for(Student std:list)
	   {
		   if(std.getName().contains(name))
		   {
			   arr.add(std);
		   }
	   }
	   return arr;
   }
   
}