import java.util.Scanner;
public class 조건문문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		if(num%3==0)
		{
			System.out.println("3의 배수입니다.");
		}
		if(num%3!=0)
		{
			System.out.println("3의 배수가 아닙니다.");
		}
	}

}
