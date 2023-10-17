package com.sist.main2;
class Super // double
{
	
}
class Sub extends Super // int
{
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 묵시적 형변환 => 자동 형변환 
		Super su=new Sub(); // 데이터형 (사용자)
		//double su=10
		// 강제 형변환 
		Sub s=(Sub)su;
		// int a=(int)10.5
		
		String str="";
		StringBuffer sb=new StringBuffer();
		Object obj=new Object();
		
		// 객체 비교 => instnaceof 
		if(str instanceof Object)
			System.out.println("true");
		else 
			System.out.println("false");
		
		if(sb instanceof Object)
			System.out.println("true");
		else 
			System.out.println("false");
		
		if(str instanceof String)
			System.out.println("true");
		else 
			System.out.println("false");
		
		/*if(sb instanceof String)
			System.out.println("true");
		else 
			System.out.println("false");*/
		
	}

}