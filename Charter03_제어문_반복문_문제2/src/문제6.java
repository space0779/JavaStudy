/*사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 
   끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.
*/
import java.util.Scanner;
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=1;
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int start=scan.nextInt();
		System.out.print("두번째 정수 입력:");
		int end=scan.nextInt();
		
		for(int i=1;i<=start;i++)
			{sum*=i;
			
			}
		for(int j=1;j<=end;j++)
			{sum*=j;
			
			}
		System.out.println(sum);
		
	}
	

}
