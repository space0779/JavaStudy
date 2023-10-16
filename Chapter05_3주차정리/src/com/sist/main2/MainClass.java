package com.sist.main2;
/*
 *    static 메소드 / 인스턴스 메소드
 *    -----------   => 인스턴스나 static 상관없이 사용이 가능
 *       | static 변수 , static 메소드를 호출
 *         인스턴스 변수 , 인스턴스 메소드는 반드시 객체 생성후에 사용
 *    => 클래스 생성 => 객체 생성 => 자동으로 this(자신이 객체)
 *                                     |
 *                                   멤버변수와 지역변수의 구분
 *                                          
 */
class Student
{
	int hakbun; // 0
	String name; // null
	String sex; // null
	
	public Student() {
		System.out.println("디폴트 생성자 호출...");
		hakbun=1;
		// Student가 가지고 있는 멤버변수
		name="홍길동";
		sex="남자";
		// 지역변수와 충솔이 없는 경우엔 this. 생략이 가능
	}
	public Student(int hakbun,String name)
	{
		// 구분자 멤버변수와 지역변수의 구분
		this.hakbun=hakbun;
		this.name=name;
	}
	
	public Student(String sex)
	{
		this();
		this.sex=sex;
	}
	public Student(int h,String n,String s)
	{
		hakbun=h;
		name=n;
		sex=s;
	}
	
	public void print()
	{
		System.out.println("학번:"+hakbun);
		System.out.println("이름:"+name);
		System.out.println("성별:"+sex);
	}
	// 오버로딩 => 같은 메소드명으로 새로운 기능을 만든다
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.print();
		Student s2=new Student("여자");
		s2.print();
		
		Student s3=new Student(2,"심청이");
		s3.print();
		Student s4=new Student(3,"박문수","남자");
		s4.print();
	}

}
