import java.util.Scanner;

public class 문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		num=scan.nextInt();// 키보드로 입력된 값을 받는다
		/*
		 * 정수 : nextInt()
		 * 실수 : nextDouble()
		 * 논리 : nextBoolean()
		 * 문자열: next()
		 * *** 단점은 char는 읽지 못한다
		 *          ---- 문자열로 읽어서 첫번째 문자를 자른다
		 *                          ---------
		 *                          charAt(0)
		 */
		// 결과값 출력
		if(num>=0)
		{
			System.out.println(num+"(은)는 양수입니다");
		}
		else
		{
			System.out.println(num+"(은)는 음수입니다");
		}
		
	}

}
