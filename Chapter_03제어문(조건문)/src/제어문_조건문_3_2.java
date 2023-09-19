/*
 *   컴퓨터 vs 플레이어 => 가위바위보
 *   ------------------------
 *   => 다중조건문 => 경우의 수 9개
 *                -------- 조건문
 *      컴퓨터     플레이어
 *       가위       가위
 *                 바위
 *                 보
 *       바위       가위
 *                 바위
 *                 보
 *       보        가위
 *                 바위
 *                 보
 *       ---------------- 가정 0(가위) , 1(바위) , 2(보)
 *       ==> 중첩 if      
 *          -------
 *             로그인상태
 *          if(조건문) ==> 한개의 조건문 ==> &&
 *          {
 *             if(조건문) // 관리자
 *             {
 *             
 *             }
 *             if(조건문) //사용자
 *             {
 *             
 *             }
 *         }   
 *         else
 *         {
 *            Guest
 *         }
 */
import java.util.Scanner;
public class 제어문_조건문_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com,user;
		com=(int)(Math.random()*3); // 0,1,2
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0),바위(1),보(2):");
		user=scan.nextInt();
		
		//가공
		System.out.print("컴퓨터:");
		if(com==0)
			System.out.println("가위");
		else if(com==1)
			System.out.println("바위");
		else if(com==2)
			System.out.println("보");
		
		System.out.println();
		
		System.out.print("사용자:");
		if(user==0)
			
		System.out.println("가위");
		
		if(user==1)
			
		System.out.println("바위");
		
		if(user==2)
		
		System.out.println("보");
		
		int res=com-user;
		if(res==-2 || res==1)
		{
			System.out.println("컴퓨터 win!!");
		}
		else if(res==2 || res==-1)
		{
			System.out.println("사용자 win!!");
		}
		else
		{
			System.out.println("비겼다");
			
		}
	
		
		
		/*if(com==0)
		{
			if(user==0)
			{
				System.out.println("비겼다");
			}
			else if(user==1)
			{
				System.out.println("사용자 win");
			}
			else if(user==2)
			{
				System.out.println("컴퓨터 win");
			}
		}
		else if(com==1)
		{
			if(user==0)
			{
				System.out.println("컴퓨터 win");
			}
			else if(user==1)
			{
				System.out.println("비겼다");
			}
			else if(user==2)
			{
				System.out.println("사용자 win");
		}
		else if(com==2)
		{
			if(user==0)
			{
				System.out.println("사용자 win");
			}
			else if(user==1)
			{
				System.out.println("컴퓨터 win");
			}
			else if(user==2)
			{
				System.out.println("비겼다");*/
		}
			
		
		
		}
	


	
