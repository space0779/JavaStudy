class B
{
	int a=10;
	// 생성자 (X) , 일반 메소드
	B(){
		System.out.println("B클래스의 디폴트 생성자 호출");
	}
	/*
	 *    생성자 => 초기화가 필요하다 (명시적인 초기화가 불가능하다)
	 *            제어문 / 파일읽기 
	 *         => 시작과 동시에 처리 => 가장 먼저 호출 
	 *            --------------
	 *                 |
	 *               자동 로그인
	 *               윈도우 화면 설정 
	 *               서버 연결 
	 *               데이터베이스 연결 
	 */
}
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //B();
		//new B();// 반드시 new 생성자()
		//new B().a=100;
		B b=new B();
		//b.B();
		//b.a=100;
		//new B().a=1000;
		//System.out.println(b.a);
	}

}