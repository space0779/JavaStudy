//1~10까지 합을 구하는 메소드 구현
//---------------- 사용자가 요청하는 값은 없다 (매개변수(x))
//메소드 자체에서 출력 => 결과값 => main()
// 리턴형 
public class 문제2 {
	// 리턴형 (o) , 매개변수 (x)
	static int sum()
	{
		int hap=0;
		for(int i=0;i<=10;i++)
		{
			hap+=i;
		}
		return hap;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap=sum();
		System.out.println("hap:"+hap);
		
	}

}
