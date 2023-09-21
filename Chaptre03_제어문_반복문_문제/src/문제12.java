//1~1000까지에서 7의 배수의 합 ,9의 배수의 합
public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0;
		for(int i=1;i<=1000;i++)
			{if(i%7==0)
				a+=i;
			if(i%9==0)
				b+=i;
			
			}
		System.out.println("7의 배수의 합:"+a);
		System.out.println("9의 배수의 합:"+b);
		System.out.println("7의 배수+9의배수:"+(a+b));
}
}