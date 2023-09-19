import java.util.Scanner;
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력:");
		num=scan.nextInt();
		if(num%3==0)
		{
			System.out.println(num+"은(는) 3의 배수입니다");
		}
		else
		{
			System.out.println(num+"은(는) 3의 배수가 아닙니다");
		}
	}

}
