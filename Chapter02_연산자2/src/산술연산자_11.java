
public class 산술연산자_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=3;
		
		System.out.println(a+"%"+b+"="+(a%b));
		System.out.println(-a+"%"+b+"="+(-a%b));
		System.out.println(a+"%"+-b+"="+(a%-b));
		System.out.println(-a+"%"+-b+"="+(-a%-b));
		
		System.out.println("===================");
		
		
		
			int c=369;
			int 백단위=c/100;
			int 십단위=(c%100)/10;
			int 단단위=c%10;
			System.out.println("백단위:"+백단위+",십단위:"+십단위+",단단위:"+단단위);
	}

}
