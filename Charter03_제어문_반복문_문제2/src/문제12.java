//12. 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램
public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a3=0,a5=0;
		for(int i=1;i<=10;i++)
		{
			int a=(int)(Math.random()*100)+1;
			System.out.print(a+" ");
			if(a%3==0)
				a3++;
			if(a%5==0)
				a5++;
		}
		System.out.println("\n3의 배수 갯수:"+a3);
		System.out.println("5의 배수 갯수:"+a5);
	}

}
