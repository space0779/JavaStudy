package com.sist.main;
/*
 *    추상클래스 => 확장 (보완) => 인터페이스 
 *    인터페이스 
 *    --------
 *     1. 추상클래스의 일종 => 인터페이스도 클래스 
 *        구분) 클래스 / 인터페이스 
 *             -----  --------
 *              | 단일 상속 | 다중 상속 
 *     2. 인터페이스는 구현된 메소드가 없이 추상메소드만 가지고 있다 
 *                  ----------
 *                   | 인터페이스에 메소드 추가가 되면 문제 발생 
 *                   | JDK 1.8 => 구현 메소드를 사용하게 만든다 
 *                                ---------
 *                                default / static 
 *        => 소프트공학 : 인터페이스 고정을 해야 된다 
 *     3. 형식 => 247page 
 *        public interface interface명
 *        {
 *           -------------------------
 *            변수
 *             => 상수형변수 
 *             int a; ==> 오류
 *             int a=10;
 *             ---------
 *              추가 => (public static final) int a=10;
 *                     ------------------- 생략이 가능 
 *           -------------------------
 *            구현이 안된 메소드
 *              void display(); ==> 구현이 내용이 많은 경우
 *              => 프로그램에 맞게 구현해서 사용 
 *              => public abstract void display();
 *                 ---------------
 *                 *** 인터페이스는 모든 메소드가 public이어야 한다  
 *           -------------------------
 *            구현이 된 메소드 
 *            default void aaa(){
 *            
 *            }
 *            => (public) default void aaa(){
 *            
 *               }
 *            static void bbb(){
 *            
 *            }
 *            => (public) static void bbb(){
 *            
 *               }
 *               
 *               ==> public void aaa();
 *               ==> public default void bbb(){}
 *           -------------------------
 *            생성자가 존재하지 않는다 (추상 클래스는 생성자가 있다)
 *           -------------------------
 *        }
 *        인터페이스는 모든 접근지정어가 public (변수,메소드)
 *        변수 => 반드시 명시적인 초기화를 한다 
 *        int a;  => int a=10;
 *        
 *     
 *        상속 
 *        ---
 *         implements => 구현해서 사용 
 *         ------------------------
 *         interface =====> interface
 *         interface A
 *         interface B (extends) A
 *                     ---------
 *         interface =====> class
 *         interface A
 *         class B (implements) A
 *         class     =====> interface 
 *         ------------------------------
 *         class A
 *         interface B () A ==> 오류 
 *         ------------------------------ X
 *         
 *         interface A
 *         interface B extends A => A,B
 *         interface C extends B => A,B,C
 *         ------------------------------
 *         interface D extends A,B
 *                            ----- 여러개를 동시에 받을 수 있다
 *                                  ,로 구분한다 
 *         interface A
 *         interface B
 *         class C implements A,B ==> 다중 상속 
 *         
 *         
 *         interface A
 *         interface B
 *         class C
 *         class D extends C implements A,B
 *               ----------- ---------------
 *                 |class상속  | 인터페이스 상속 
 *         => 윈도우 
 *         => 인터페이스에 설정된 모든 것(메소드,변수)
 *            public만 사용이 가능 => 
 *                public을 설정하지 않으면 자동 추가 
 *         => 인터페이스 사용 
 *            => 윈도우 이벤트 처리 
 *            => 사용자 정의 => 클래스 관리 (스프링:클래스 찾기(DL))
 *               ---------------------
 *                 | => 인터페이스 대신 어노테이션으로 변경 
 *                                  --------
 *         => 설계 
 *               1차 프로젝트 
 *               ---------- 예약 , 추천 ,결제 
 *            1. 개발기간이 단축 
 *               예)
 *                  예약 
 *                  로그인 
 *                  맛집선택 
 *                  예약일 선택 
 *                  예약 시간 선택 
 *                  인원 확인 
 *                  계약금을 전송 
 *                  => 좌석선택 
 *                  -----------
 *            2. 인터페이스 => 표준화 
 *            3. 서로 다른 클래스 연결해 주는 역할 (스프링)
 *            
 *      -----------------------------------------
 *      실무 
 *       개발기간 : 8개월
 *       1. 설계(요구사항분석) => 3개월 => 인터페이스 => 아키텍쳐
 *          
 *       2. 데이터베이스 설계 : 1개월 => DBA
 *          
 *       ***3. 화면 UI : 1개월 : 퍼블리셔 
 *          
 *       ***4. 구현 : 2개월 : 웹프로그래머(*********)
 *          
 *       ***5. 테스트 배포 : 1개월 : 테스터 
 *             
 *            
 *      *** 인터페이스는 자신이 메모리 할당을 할 수 없다 
 *          => 구현된 클래스를 이용해서 메모리 할당을 한다 
 *          
 *      interface A
 *      class B implements A
 *      
 *      => A a=new B();
 *                           
 */
/*interface A
{
	 int a=10;
	 void disp();
}
class B implements A
{
	public void disp() {}
}*/
import javax.swing.*;
import java.awt.event.*;
public class MainClass_3 extends JFrame implements ActionListener,MouseListener,KeyListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}