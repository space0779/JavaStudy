import java.util.Scanner;
public class 문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력:");
		num=scan.nextInt();
		if(num>=0)
		{
			System.out.println("a="+num);
		}
		if(num<0)
		{
			System.out.println("a="+(num*(-1)));
			
		}
		
		
	}

}
