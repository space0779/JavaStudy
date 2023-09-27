import java.util.Scanner;
// 사용자로부터 입력값(문자열) => 좌우대칭 여부 확인
// ABBA => 문자갯수 => length()
public class 문자열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
				String msg="";//''
		while(true)
		{
			System.out.println("문자열 입력:");
			msg=scan.next();
			if(msg.length()%2==0) {
				break;
			}
			
		}
		//좌우 대칭 확인
		boolean bCheck=true;
		int j=msg.length()-1;
		for(int i=0;i<msg.length()/2;i++)
		{
			
			char c=msg.charAt(i);
			char c1=msg.charAt(i);
			if(c!=c1)
			{
				bCheck=false;
				break;
			}
				j--;
		}
		if(bCheck==false)
		{
			System.out.println(msg+"는(은)대칭 구조가 아닙니다");
		}
		else
		{
			System.out.println(msg+"는(은) 좌우 대칭입니다");
		}
				
	}

}
