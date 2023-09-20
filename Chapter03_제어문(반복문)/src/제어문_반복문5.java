// 1~100까지 => 3의 배수의 합, 5의 배수의 합, 7의 배수의 합 => 출력
public class 제어문_반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,c=0;
		for(int i=1;i<=100;i++)
		{
		
			if(i%3==0)
				a+=i;
			if(i%5==0)
				b+=i;
			if(i%7==0)
				c+=i;
			
		}
		System.out.println("1~100까지 3의 배수합:"+a);
		System.out.println("1~100까지 5의 배수합:"+b);
		System.out.println("1~100까지 7의 배수합:"+c);
	}

}
