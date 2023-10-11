import java.util.*;
/*
 *    int aaa(int a,int b)
 *    {
 *       return a+b;
 *    }
 *    
 *    int a,b
 *    void aaa()
 *    {
 *      
 *    }
 *    
 */
class Student{
	// heap => 프로그램 종료시까지 메모리 유지 => 다른 클래스에서 사용이 가능
	String name;//null
	int kor,eng,math;//0,0,0 => heap
	// 매개변수 / 지역변수 => stack
	
	Student(String n,int kor,int eng,int math)
	{
		// 매개변수 / 지역변수 => 메소드안에서만 사용이 가능 => 자동 메모리 해제
	    this.name=n;// 자신의 객체 => this
	    this.kor=kor;
	    this.eng=eng;
	    this.math=math;
	    
	    // 지역변수,매개변수 => 멤버변수에서 찾는다 
	    
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student[] std=new Student[3];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<std.length;i++)
        {
        	System.out.print((i+1)+"번째 이름 입력:");
        	String name=scan.next();
        	
        	System.out.print((i+1)+"번째 국어 입력:");
        	int kor=scan.nextInt();
        	
        	System.out.print((i+1)+"번째 영어 입력:");
        	int eng=scan.nextInt();
        	
        	System.out.print((i+1)+"번째 수학 입력:");
        	int math=scan.nextInt();
        	
        	std[i]=new Student(name, kor, eng, math);
        	
        }
        
        // 출력 
        for(int i=0;i<std.length;i++)
        {
        	System.out.printf("%-6s%-5d%-5d%-5d%-7d%-7.2f\n",
        			std[i].name,std[i].kor,
        			std[i].eng,std[i].math,
        			(std[i].kor+std[i].eng+std[i].math),
        			(std[i].kor+std[i].eng+std[i].math)/3.0);
        }
        
        
	}

}