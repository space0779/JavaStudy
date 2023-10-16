// 정수 1개 입력 => 3의 배수 여부 확인
import java.util.Scanner;
public class 메소드_문제_2 {
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력:");
		
		return scan.nextInt();
	}
	static String check(int num)
	{
		String res="";
		if(num%3==0)
			res=num+"는(은) 3의배수입니다";
		else
			res=num+"는(은) 3의배수가아닙니다";
		return res;
	}
	static void print(String res)
	{
		System.out.println(res);
	}
	static void process()
	{
		int num=userInput();
		String res=check(num);
		print(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
			
			
				
	}

}
