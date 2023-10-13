package com.sist.main;
class Member
{
	// 변수를 은닉
	private int age; //0
	private String name; //null => 읽기/쓰기
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m=new Member(); //m(age,name)
		m.setAge(20);// m.age
		m.setName("홍길동");// m.name
	}

}
