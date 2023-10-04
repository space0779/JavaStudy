// 암호화 시저스 => AES

import java.util.Scanner; 
public class 메소드_3 {
	// 입력 값 => 리턴형(o) , 매개변수 (x)
	static String userInput()
	{
		return 메소드_2.userInput();
	}
	// 암호화 => 리턴형(o) , 매개변수 (o)
	static String encode(String msg)
	{
		String result="";
		for(int i=0;i<msg.length();i++)
		{
			char c=msg.charAt(i);
			result+=(char)(c+3);
		}
		return result;
	}
	// 복호화 => 리턴형(x) => void , 매개변수 (o)
	static void decode(String en)
	{
		for(int i=0;i<en.length();i++)
		{
			char c=en.charAt(i);
			System.out.print((char)(c-3));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg=userInput();
		System.out.println("msg:"+msg);
		String en=encode(msg);
		System.out.println("암호화된 문자:"+en);
		decode(en);
	}

}
