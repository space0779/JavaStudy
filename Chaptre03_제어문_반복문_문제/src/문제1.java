//1) 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		sum=0;
		
		for(int i=2;i<=100;i+=2)
			if(i%2==0)
			sum=sum+i;
		System.out.println("2+4+...100의 합:"+sum);
	}

}
