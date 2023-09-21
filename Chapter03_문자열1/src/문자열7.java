import java.util.Scanner;
// equals (==): 대소문자구분 
public class 문자열7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String MID="admin",MPWD="1234";
		Scanner scan=new Scanner(System.in);
		System.out.println("아이디 입력:");
		String id=scan.next();
		System.out.println("비밀번호 입력:");
		String pwd=scan.next();
		if(id.equalsIgnoreCase(MID) && pwd.equals(MPWD))
		{
			System.out.println(id+"님 로그인되었습니다");
		}
		else
		{
			System.out.println("ID나 Password가 틀립니다");
		}
	}

}
