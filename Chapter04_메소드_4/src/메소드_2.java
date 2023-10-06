// 리턴형(o) , 매개변수(x)
// => 아이디 찾기
import java.util.Scanner;
public class 메소드_2 {
	static String idInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("ID 입력:");
		return scan.next();
	}
	static boolean idCheck(String id)
	{
		boolean bCheck=false;
		String[] ids= {
				"hong","admin","lee","park","shim"
		};
		for(String i:ids)
		{
			if(id.equals(i))
					{
						bCheck=true;
						break;
					}
			
		}
		return bCheck;
	}
	static void process()
	{
		String id=idInput();
		boolean bCheck=idCheck(id);
		
		if(bCheck)
			System.out.println(id+"는 이미 사용중인 아이디입니다");
		else
			System.out.println(id+"는 사용가능한 아이디입니다");
	}
	// 아이디 중복체크
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
