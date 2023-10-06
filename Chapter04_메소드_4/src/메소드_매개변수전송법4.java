
public class 메소드_매개변수전송법4 {
	static void swap(int a,int b)
	{
		System.out.println("변경전=>swap:a="+a+",b="+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("변경후=>swap:a="+a+",b="+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		// 기본형은 => 복사(값) => Call By Value
		System.out.println("변경전=>main:a="+a+",b="+b);
		swap(a,b);
		System.out.println("변경후=>main:a="+a+",b="+b);
	}

}
