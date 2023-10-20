package com.sist.exception;
// 예외처리의 기본 (267page)
/*
 *    가장 많이 사용된다 => 예외복구
 *    try~catch~finally
 *    1) 형식
 *       try
 *       {
 *           에러없이 실행이 가능한 소스
 *           // main ==> 정상수행하는 문장 => 개발자 실수, 사용자의 입력  
 *       }catch(Exception e)
 *       {
 *           예외복구 ==> 다시 입력 요청 => 다음 문장으로 이동 
 *       } ==> catch는 예상되는 예외를 따라 처리 => 여러개 사용이 가능 
 *       
 *    2) 동작 흐름 
 *    
 *       문장 1
 *       문장 2
 *       try ==> 전체 / 부분 => 에러가 발생할 수 있는 부분 
 *       {
 *          문장 3
 *          문장 4
 *          문장 5
 *       }catch(Exception e)
 *       {
 *          문장 6
 *       }
 *       문장 7
 *       문장 8
 *       
 *       => 문장 1 => 문장 2 => 문장 3 => 문장 4 => 문장 5
 *       => 문장 7 => 문장 8
 * ----------------------------------------------------      
 *       문장 1
 *       문장 2
 *       try ==> 전체 / 부분 => 에러가 발생할 수 있는 부분 
 *       {
 *          문장 3
 *          문장 4 => int a=10/0 => 에러발생 ==> catch이동 
 *          문장 5
 *       }catch(Exception e)
 *       {
 *          문장 6
 *       }
 *       문장 7
 *       문장 8
 *       
 *       1 => 2 => 3 => 6 => 7 => 8
 *       
 *       -----------------------------------------
 *       문장 1
 *       문장 2 ==> 에러발생 
 *       try ==> 전체 / 부분 => 에러가 발생할 수 있는 부분 
 *       {
 *          문장 3
 *          문장 4  === 에러 발생 ==> catch로 이동 밑에 있는 문장은 수행을 못한다
 *          문장 5 
 *             ---------------------------
 *             int a=10/0; ==> 10/1
 *             System.out.println(a); 10
 *             --------------------------- 무시 => catch
 *       }catch(Exception e)
 *       {
 *          문장 6 ==> 복구 => 문장 3번으로 이동 
 *       }
 *       문장 7
 *       문장 8
 *       
 *       1 => 종료 ==> 비정상 종료 
 *       
 *       try ==> 정상으로 수행하는 문장 
 *               => 개발자 실수 , 사용자 입력값 : 에러발생 
 *                                          ------
 *                                             | 종료 => 종료방지를 위해서 catch
 *                                             
 *       *** 수행문장에 이상이 없는 경우 (에러가 없는 경우)
 *           try{ 소스 }
 *       *** 수행문장에 이상이 있는 경우 (에러가 있는 경우)
 *                   ---------- 무시 => catch로 이동
 */
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("문장1");
        
        try
        {
        	 System.out.println(10/0);//종료
        	 System.out.println("문장3");
        	 //System.out.println(10/0);// 종료 
        	 System.out.println("문장5");
        	 System.out.println("문장5");
        	 System.out.println("문장5");
        	 System.out.println("문장5");
        	 System.out.println("문장5");
        	 System.out.println("문장5");
        	 System.out.println("문장5");
        	 System.out.println("문장5");
        	 System.out.println("문장5");
        	 System.out.println("문장5");
        	 System.out.println("문장5");
        	 
        }catch(Exception ex) {
        	 System.out.println("문장6");
        }
        System.out.println("문장7");
        System.out.println("문장8==정상종료");
	}

}