package com.sist.main;
//객체 대입 => 메모리를 통으로 전송 => 같은 메모리 주소를 제어
class Human
{
	int age;
	String name;
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong=new Human();
		// hong (age,name) => hong.age , hong.name
		hong.age=20;// 메모리에 저장
		hong.name="홍길동";// 쓰기 => setXxx
		
		// 변수(멤버변수,정적변수,지역변수,매개변수) => 읽기/쓰기
		System.out.println(hong.age);//읽기 => getXxx
		System.out.println(hong.name);
		
		//hong => 변수
		Human shim=hong;
		//대입이 가능하다 ==> 메모리 주소를 대입
		
		/*
		 *   int a=10;
		 *   int b=a; ==> 메모리에 있는 값을 대입
		 */
		// shim , hong은 같은 주소를 가지고 있다
		shim.age=30;
		shim.name="심청이";
		System.out.println(hong.age);//읽기 => getXxx
		System.out.println(hong.name);
	}

}
