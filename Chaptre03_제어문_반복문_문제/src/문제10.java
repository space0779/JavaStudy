//1~30 짝수합,홀수합을 출력하는 프로그램을 작성
public class 문제10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0;
		for(int i=1;i<=30;i++)
			{if(i%2==0)
				a+=i;
			else
				b+=i;
			}
		System.out.println("짝수합:"+a);
		System.out.println("홀수합:"+b);

}
}