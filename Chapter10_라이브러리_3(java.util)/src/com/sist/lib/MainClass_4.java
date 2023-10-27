package com.sist.lib;
import java.util.*;
/*
 *    class A
 *    {
 *       int a,b;
 *       public void aaa(){}
 *       public void bbb(){}
 *    }
 *    class B extends A
 *    {
 *       int c;
 *       public void ccc(){}
 *       --------상속-----------
 *       int a,b;
 *       public void aaa(){}
 *       public void bbb(){}
 *       -------------------
 *    }
 *    
 *    B b=new B(); 
 *      => a,b,c,aaa(),bbb(),ccc() => B가 가지고 있는 변수,메소드 사용
 *    A a=new A();
 *      => a,b,aaa(),bbb() => A가 가지고 있는 변수,메소드 사용이 가능 
 *    A b=new B();
 *    --- ------- A가 가지고 있는 메소드를 덮어쓴다
 *      => a,b,aaa(),bbb()
 *             ----------- B가 가지고 있는 메소드 호출 
 */
class Sawon
{
	private int sabun;
	private String name;
	private String dept;
	public Sawon(int sabun,String name,String dept)
	{
		this.sabun=sabun;
		this.name=name;
		this.dept=dept;
	}
	public void print()
	{
		System.out.println("사번:"+sabun);
		System.out.println("이름:"+name);
		System.out.println("부서:"+dept);
	}
}
// Object대신 저장해야 되는 데이터형 설정 => 모든 매개변수,리턴형이 변경된다
// => 제네릭 => 컬렉션은 가급적이면 제네릭을 사용 권장 
// => 데이터 첨부시에 원하는 데이터만 첨부가 가능하게 만들어 준다 
// => 분석 => 가독성 => 명시적이기 때문에 
// 데이터를 저장할때 => 같은 데이터를 첨부 => 제네릭을 선언하면 다른 데이터형은을 첨부할 수 없다 
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Sawon> list=new ArrayList<Sawon>();
        // 제네릭 => <클래스> => 기본형은 반드시 Wrapper
        // 제네릭 => 폴도별로 저장 => 찾기 
        // ArrayList<int> => ArrayList<Integer>
        list.add(new Sawon(1,"홍길동1","개발부"));
        list.add(new Sawon(2,"홍길동2","영업부"));
        list.add(new Sawon(3,"홍길동3","총무부"));
        //list.add("Hello");
        for(int i=0;i<list.size();i++)
        {
        	//Object obj=list.get(i);
        	Sawon obj=list.get(i);
        	// clone() , finalize() , toString()...
        	obj.print();
        }
        // list => Object
        /*list.add(1);
        list.add(2);
        list.add(3);
        list.add("홍길동");
        list.add(4);
        list.add(5);
        for(int i=0;i<list.size();i++)
        {
        	Object obj=list.get(i);
        	System.out.println(obj);
        }*/
        
	}

}