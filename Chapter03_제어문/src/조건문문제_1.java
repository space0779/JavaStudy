import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력:");
		int num=scan.nextInt();
		if(num>=50)
		{
			System.out.println("50 이상입니다.");
		}
		if(num<50)
		{
			System.out.println("50 미만입니다.");
		}
	}

}
