//9. 0~12까지 2의 배수, 3의 배수의 합을 구하여라.

public class 문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0;
		for(int i=0;i<=12;i++)
			{if(i%2==0)
				a+=i;
			if(i%3==0)
				b+=i;
			}
		System.out.println("2의 배수의 합:"+a);
		System.out.println("3의 배수의 합:"+b);
	}

}
