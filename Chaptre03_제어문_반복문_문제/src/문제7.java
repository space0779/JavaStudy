//) 1~10 사이의 숫자 중 3의 배수를 제외하고 출력하라 (continue 사용)
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1;i<=10;i++)
		
		{
			if(i%3==0) {
				continue; // i++ 이동 (증가식으로 이동)
				
			}
				
		System.out.print(i+" ");		
		}
		
	}

}
