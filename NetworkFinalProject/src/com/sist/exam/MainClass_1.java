package com.sist.exam;
/*
 *    Thread
 *    ------ 모든 프로그램에 한개 이상 존재
 *               ------ 프로세스
 *           => 프로그램안에서 여러개의 프로그램을 동시에 수행
 *           => main => Thread    
 *    => 서버에는 반드시 쓰레드를 필요로 한다
 *       --- 여러명이 접근시에 통신부분을 따로 수행 
 *       --- 클라이언트 <==> 쓰레드 : 멀티쓰레드
 *    => 사용처 (사용자 정의 쓰레드)
 *       1. 데이터 수집 
 *       2. 네트워크 서버 => 서버를 여러개 수행
 *       3. 게임 (비행기...) => 비행기 , 총알
 *       4. 웹 서버
 *          ------ 아파치 / IIS => 톰캣(테스트용 => 웹서버)
 *                                => WAS       
 *       5. 데이터베이스 서버 : 오라클 (서버)
 *       ------ 서버는 한개 수행 (사용자 요청에 대한 처리 ==> 쓰레드)
 *    => 사용자 정의 쓰레드
 *       => 서버개발자
 *       => 서버측 사이드 (서버에서 동작하게 코딩) => Back-End                               
 */
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
	}

}
