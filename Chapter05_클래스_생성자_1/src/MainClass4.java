import java.util.Arrays;

class A{
	static int[] arr=new int[5];
	// 클래스 영역에는 선언만 가능하다
	A() {
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A(); // arr=>저장
		System.out.println(Arrays.toString(a.arr));
		
		A b=new A(); // arr
		System.out.println(Arrays.toString(b.arr));
		System.out.println(Arrays.toString(a.arr));
	}

}
