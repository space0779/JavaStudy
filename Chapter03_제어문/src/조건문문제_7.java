/*
 *  정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램
        작성 ( 90이상이면 A,80이상이면 B, 70이상이면 C,60이상이면 D, 
        나머지는 F)

 */
import java.util.Scanner;
public class 조건문문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫 번째 정수 입력:");
		int a=scan.nextInt();
		System.out.print("두 번째 정수 입력:");
		int b=scan.nextInt();
		System.out.print("세 번째 정수 입력:");
		int c=scan.nextInt();
		int total=(a+b+c);
		double avg=(total)/3.0;
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
		
		if(avg>=90 && avg<=100)
		{
			System.out.println("학점:"+'A');
			
		}
		if(avg>=80 && avg<=90)
		{
			System.out.println("학점:"+'B');
			
		}
		if(avg>=70 && avg<=80)
		{
			System.out.println("학점:"+'C');
			
		}
		if(avg>=70 && avg<=60)
		{
			System.out.println("학점:"+'D');
			
		}
		if(avg<60)
		{
			System.out.println("학점:"+'F');
			
		}
	}

}