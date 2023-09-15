import java.util.Scanner;
public class 조건문문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		num=scan.nextInt();
		if(num>=0)
		{
			System.out.println(num+"는(은) 양수다.");
		}
		if(num<0)
		{
			System.out.println(num+"는(은) 음수다.");
		}
		
				
	}

}
