//1~10까지 출력하는 메소드 구현
/*
 *    리턴형 메소드명(매개변수...)
 *    {           ----------- 가변 매개변수
 *      => 자체에서 void (결과값 없는 상태)
 *    }
 *    메소드 : 기능처리 (연산자+제어문)
 *           = 다른 클래스 연결
 *           = 재사용 (호출)
 */
public class 문제1 {
	// 매개변수 (x) , 리턴형 (x)
	static void print()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
	}

}
