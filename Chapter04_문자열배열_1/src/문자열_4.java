// substring() => 문자를 자른다
/*
 *    "Hello Java"
 *     0123456789
 *     
 *     substring(6)
 *     substring(0,5)
 *                 - 제외
 *     
 */



public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address="서울특별시 마포구 와우산로13길 49-10 지번 서울시 마포구 상수동 316-3";
		//String s1=s.substring(0,5);
		//String s1=s.substring(6);
//		int a=address.lastIndexOf(" ");
//		String addr=address.substring(a-3,a);
//		System.out.println(addr);
		String ext="Hello.Java.java";
		String s=ext.substring(ext.lastIndexOf(".")+1);
		System.out.println(s);
		
	}

}
