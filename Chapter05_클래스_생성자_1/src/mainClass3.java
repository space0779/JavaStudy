class Member{
	// 우선 순위는 명시적 초기화
	// 1
	int mno=1;
	String id="admin";
	String pwd="1234";
	String name="홍길동";
	
	// Member(){}
	// 2
	{
		mno=3;
		id="park";
		pwd="1234";
		name="심청이";
		// 파일 읽어서 값 대입 
	}
	// 3
	/*Member(){
		mno=2;
		id="hong";
		pwd="1234";
		name="박문수";
	}*/



	Member(){
		mno=2;
		id="hong";
		pwd="1234";
		name="박문수";
	}
		
}
public class mainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1=new Member(); // 메모리 저장 => 생성자 호출
		System.out.println("번호:"+m1.mno);
		System.out.println("ID:"+m1.id);
		System.out.println("PWD:"+m1.pwd);
		System.out.println("NAME:"+m1.name);
		System.out.println("============");
		Member m2=new Member();
		System.out.println("번호:"+m2.mno);
		System.out.println("ID:"+m2.id);
		System.out.println("PWD:"+m2.pwd);
		System.out.println("NAME:"+m2.name);
	}

}
