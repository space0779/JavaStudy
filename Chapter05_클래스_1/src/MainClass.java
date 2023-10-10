/*
 *    프로그램 
 *    1. 데이터 관리 (메모리에 저장, 파일 저장 , ***RDBMS저장)
 *                             ------------------- 영구적인 저장
 *       ---------
 *        1) 데이터 저장 
 *           = 한개 저장 : 변수 
 *           -----------------------
 *           = 같은 데이터 저장 : 배열 
 *           = 다른 데이터 저장 : 클래스 
 *             => 메모리 주소를 이용하는 프로그램 
 *                -------- 참조 변수 => 사용자 정의 데이터형  
 *           ----------------------- 관련된 데이터를 모아서 관리
 *        2) 데이터 가공 
 *           = 명령문 => ;
 *           = 연산자 
 *           = 제어문 
 *           -------------------- 메소드 
 *        3) 가공된 데이터 출력  
 *           = 명령프롬프트 / 윈도우 => Application 
 *           **= 브라우저 => Web Application
 *             -------------------------
 *           = 모바일 => Mobile Application 
 *                     ------- Kotlin => Spring(Kotlin)
 *           ------------------------------ 문법 형식은 동일 
 *           = Front-End (React,Vue)
 *                        ------ React-Query
 *     2. 데이터 관리를 위한 사용자 정의 데이터형 
 *        = 클래스의 구성 요소
 *          class ClassName
 *          {
 *             ------------
 *              ***1) 변수 설정 => 프로그램 종류시까지 사용이 가능 
 *                         => 지역변수 
 *                            메소드 종료시 사라지는 변수
 *                            => 리턴형 , 매개변수 
 *                         => 전역변수 
 *                            => 리턴형 , 매개변수가 단순해 진다 
 *                            = 공유변수 
 *                            = 인스턴스 변수 
 *             ------------
 *              2) 생성자 설정 : 변수에 대한 초기화 
 *                 => 여러개 사용이 사용 , 사용하지 않는 경우
 *                                    ---------------
 *                                         |
 *                                     컴퍼일러에 의해 자동 생성 
 *             
 *             ------------
 *              3) 메소드 설정 : 기능 
 *             ------------
 *          } 
 *        = 클래스의 변수의 종류 
 *          클래스 영역에 선언하는 변수 
 *          ---------------------(멤버변수) ===> heap
 *           = 인스턴스 (객체) 변수 => new를 사용할때마다 따로 저장 
 *             ------------------------ heap영역에 저장 
 *           = 클래스 변수 => 공유변수 => static 
 *                      => Method area
 *           자바의 메모리 
 *           ------------------------
 *             Method Area (static)
 *              = 메소드 저장 , static 변수 
 *           ------------------------
 *             Heap
 *              = 인스턴스 변수 (멤버변수) => 프로그래머 관리 영역
 *                => 프로그래머가 메모리에 저장 , 해제
 *                 *                =>    GC(자동 메모리 해제)
 *                                  => System.gc()   
 *                                     멀티미디어         
 *           ---------------------
 *             Stack
 *              = 지역변수 , 매개변수  => 블록변수 {} => 메모리 자체 관리 
 *           ---------------------
 *           
 *        ------------------------------------------
 *         변수유형   선언위치   메모리 저장     사용 범위
 *        ------------------------------------------
 *         인스턴스변수       = new : 새로운 공간이 생성 => 클래스 전체 
 *         => 클래스를 메모리에 저장한 상태(인스턴스)
 *                 class ClassName
 *                 {
 *                     int a;
 *                 }
 *         정적변수(static)  = 컴파일시에 자동 저장 
 *                 class ClassName
 *                 {
 *                    static int a;
 *                 }
 *         지역변수 : 메소드 호출시마다 생성 => 메소드안에서 사용이 가능 
 *                 class ClassName
 *                 {
 *                    void display()
 *                    {
 *                       int a;
 *                    }
 *                 }
 *                 
 *         = 메모리 저장 
 *           *** 인스턴스 : 메모리에 저장된 상태 (객체)
 *                                       -------
 *                                       클래스에 대한 변수명 
 *                                       => 메모리 주소
 *               int a=10;
 *               class A
 *               {
 *                  int a;
 *                  int b;
 *                  int c;
 *               }
 *                   => malloc(sizeof(A)) => new
 *                   => free(A) => delete => 사용하지 않는다 (C/C++)
 *               A a=new A()
 *                   --- 메모리 크기를 확인
 *                   --- 메모리 확보 
 *                   --- 확보된 메모리 주소를 넘겨주는 역할  
 *                       --- 생성자 (멤버변수에 대한 초기화)
 *                   ------- 초기값 
 *               클래스 : 설계 (필요한 데이터를 모아준다)
 *                 => 메모리에 저장  ====> 활용  ===> 메머리 해제 
 *               *** 클래스는 한개의 정보를 모아둔 곳   
 *               class Movie
 *               {
 *                  ---
 *                  ---
 *                  ---
 *               }
 *               Movie m1=new Movie();
 *               Movie m2=new Movie();
 *               Movie m3=new Movie();
 *               ...
 *               ...
 *               활용 
 *               -----
 *                 m1.변수명 => .은 주소 접근 연산자 
 *               해제
 *               -----
 *                 m1=null
 *        ------------------------------------------
 *        = 메소드 처리 
 *        = 생성자 
 *        ----------------------------- 객체지향 
 *        = 초기화 블록 
 *        = 클래스의 종류 
 *        = 라이브러리 
 *        = 예외처리  *                        
 */
// 학생 => 이름 , 국어 , 영어 , 수학  
/*
 *   파일명는 .java
 *          -----
 *          => 클래스명과 동일 (대소문자 구분)
 *          A.java , a.java
 *   한파일 안에 여러개의 클래스를 사용할 수 있다 
 *   ----------------------------------
 *   class A
 *   public class B
 *   -------------- public class는 한파일안에 1개만 사용이 가능
 *                  ------------ 파일명이 된다 
 *   class A
 *   class B
 *   -------- 저장명은 A.java , B.java
 *   -------- 일반 => 저장명은 main이 있는 클래스를 저장명으로 설정 
 *   
 *   *** 같은 폴더 (src) 
 *   class A
 *   public class MainClass1
 *   
 *   class A
 *   public class MainClass2
 *   ------------------------  오류 (A는 이미 사용중)
 *                   
 */
import java.util.*;
// 가급적이면 따로 클래스를 만드는 것을 권장 
// new => 저장공간을 따로 만들 수 있다 
class Student
{
	String name;
	int kor;
	int eng;
	int math;
	// 멤버변수 사용 => 기본형 , 클래스 , 배열 
}
public class MainClass {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] names=new String[3];
        int[] kor=new int[3];
        int[] eng=new int[3];
        int[] math=new int[3];
        /// 한명에 대한 정보 => index가 같은 것을 이용한다 
        //System.out.println(names);
        /*
         *    names
         *   ------         -names[0]---names[1]---names[2]----
         *   @6504e3b2 --->            |         |
         *   ------         -----------------------------------
         *                  @6504e3b2   @6504e3b2+4  @6504e3b2+4 
         *   모든 클래스는 변수선언시 => 4byte (주소)
         */
        Scanner scan=new Scanner(System.in);
        /*for(int i=0;i<3;i++)
        {
        	System.out.print((i+1)+"번째 이름 입력:");
        	names[i]=scan.next();
        	System.out.print((i+1)+"번째 국어 입력:");
        	kor[i]=scan.nextInt();
        	System.out.print((i+1)+"번째 영어 입력:");
        	eng[i]=scan.nextInt();
        	System.out.print((i+1)+"번째 수학 입력:");
        	math[i]=scan.nextInt();
        }
        // 출력 
        for(int i=0;i<3;i++)
        {
        	System.out.printf("%-5d%-5d%-5d%-7d%-7.2f\n",
        			kor[i],eng[i],math[i],
        			kor[i]+eng[i]+math[i],
        			(kor[i]+eng[i]+math[i])/3.0);
        }*/
        // 클래스 이용 
        Student hong=new Student();
        hong.name="홍길동";
        hong.kor=78;
        hong.eng=90;
        hong.math=67;
        System.out.println(hong.name+" "
        		+hong.kor+" "
        		+hong.eng+" "
        		+hong.math+" "
        		+(hong.kor+hong.eng+hong.math));
      //        변수명 => 구분 (객체,인스턴스)
      //             초기화    
      //클래스(사용자 정의 데이터형)
      // int    a  = 10
        System.out.println("hong="+hong);
        Student shim=new Student();
        shim.name="심청이";
        shim.kor=78;
        shim.eng=90;
        shim.math=67;
        System.out.println("shim="+shim);
        Student park=new Student();
        park.name="박문수";
        park.kor=78;
        park.eng=90;
        park.math=67;
        System.out.println("park="+park);
        /*
         *     stack => 주소 
         *     hong
         *    -------
         *    @3f3afe78
         *    -------     heap (실제 데이터)
         *          ↖      new Student()
         *         @3f3afe78-----name------
         *                                 => 
         *                  ------kor------
         *                    
         *                  ------eng------
         *             
         *                  ------math------
         *             
         *                  ----------------
         *         hong.name , hong.kor , hong.eng
         *            --- 주소 접근 연산자
         */
	}

}