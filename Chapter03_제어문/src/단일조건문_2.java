/*
 *    정수 입력을 1개를 받는다
 *    >>11
 *    같은 숫자입니다
 *    >>88 다른 숫자입니다
 */
import java.util.Scanner;
public class 단일조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("1~99사이의 수 입력:");
		int a=scan.nextInt();
		if(a>=0 && a<=100);
		{
			if(a%11==0)
			{
				System.out.println("같은 숫자입니다.");
			}	
			if(a%11!=0)
			{
				System.out.println("다른 숫자입니다.");
			}
				
		}
		if(a<1 || a>99)
		{
			System.out.println("잘못된 입력값입니다");
		}
				
	}

}
