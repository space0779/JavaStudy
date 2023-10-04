/*
 *     데이터 저장 =========> 데이터 가공(처리) =========> 가공된 데이터 출력
 *     		                    |                      사용자 요청
 *                            사용자 요청 처리 => 로그인 , 검색결과
 *                              |
 *                          1) 연산자
 *                          2) 제어문   
 *                          -------- 묶어서 사용
 *                          -------- 명령문의 집합 : 메소드
 *                          -------- 기능별 처리 
 *         |
 *       데이터 한개 저장 : 변수 (지역변수 , 전역변수=> 공유 변수, 객체 변수) 
 *                           -------  ------------- 클래스
 *       데이터를 묶어서 사용 : 같은 데이터형을 묶어서 관리
 *       ---------------- 변수명을 통일 (인덱스) => 배열
 *       ---------------- : 다른 데이터형을 묶어서 관리 ( 클래스)
 *       
 *       메소드 (Method) => 클래스의 구성 요소
 *                              |
 *                            생성자 , 변수 , 메소드
 *                                   ----  -----
 *      1) 사용 목적 => 1. 가독성 , 2. 재사용성 , 3. 속도 (최적화)
 *                    --------------------
 *                        |
 *                       메소드
 *         = 분석 (가독성) => 수정 (유지보수) , 오류처리
 *           기능별 분리 (로그인처리 , 회원가입 , 목록 , 페이징....)          
 *         = 다른 클래스와 연결 (메세지)
 *           객체지향 프로그램은 여러개의 클래스를 만들어서 연관관계...
 *           => Scanner.... (사용자 정의)
 *              scan.nextInt()
 *                   --------- 입력된 정수 읽기
 *              System.out.println() => 화면에 출력
 *              trim() , length()
 *              => 메소드는 한가지 기능만 수행이 가능하게 만든다
 *                 1) 입력
 *                 2) 요청 처리 => 기능에 따라 세분화 (여러개 메소드 제작)
 *                 3) 출력 
 *         = 반복 수행을 제거
 *           오라클 연결
 *           ---------
 *            = 목록 출력
 *              오라클 연결
 *              데이터 처리
 *              오라클 닫기
 *            = 데이터 저장
 *            = 데이터 수정
 *            = 데이터 삭제
 *              오라클 연결
 *              데이터 처리
 *              오라클 닫기
 *            = 상세보기   
 *         = 재사용이 높다
 *         = 구조적인 프로그램 작성 => 단락을 나눠서 작업
 *    2) 메소드 형식
 *       [접근지정어]  [옵션]  리턴형 메소드명(매개변수...) : 선언부
 *       public(공개) static : new를 사용하지 않고 자동으로 메소드에 저장
 *       private     abstract : 선언 => 추상 클래스 / 인터페이스 (설계)
 *                              => 요구사항 분석
 *       default     final : 상속이 불가능 (수정이 불가능)
 *                           => Math, String, System...      
 *       protected
 *       
 *       {
 *           구현부
 *       }
 *       
 *       리턴형 : 사용자 요청에 대한 처리결과값
 *       매개변수 : 사용자의 요청값 ()
 *                예) 로그인 요청
 *                   --------- id,pwd
 *                   아이디 찾기
 *                   --------- id
 *                   검색
 *                   --------- 검색어
 *                   String substring(int start, int end)
 *                   ------           -------------------
 *                   리턴형               매개변수
 *               => 일반 : 3개이상이면 묶어서 매개변수로 설정
 *                        ----- 배열 , 클래스
 *      메소드명 : 식별자 (변수)
 *               = 알파벳이나 한글로 시작한다
 *               = 메소드명의 길이 제한은 없다
 *                 ---------------------- (3~10)
 *               = 숫자를 사용할 수 있다 (앞에 사용 금지)
 *               = 특수문자 사용이 가능 (_ , $)
 *               = 키워드는 사용할 수 없다
 *               = 공백을 사용하면 안된다
 *     ===> 선언부 , 구현부
 *          리턴형 메소드명(매개변수...) => 선언부
 *          {
 *              구현부 => 소스 코딩 위치
 *          }            
 *      *** 약속 사항
 *          => 소문자로 시작한다
 *          => 두개의 단어가 있는 경우
 *              두번째 단어 첫자는 대문자 ,  _
 *          => 데이터 저장 : set변수명()...
 *          => 데이터 읽기 : get변수명()                   
 *       
 *    3) 메소드 제작시 고민
 *       ---------------------------------------
 *          리턴형 (처리 결과값) 매개변수 (사용자 요쳥값)
 *       ---------------------------------------
 *               o                o
 *               => String replace(char c1, char c2)
 *               => 리턴형으로 사용
 *                  -----------
 *                    기본형 : int , long , double , boolean , char
 *                    참조형 : int[] , boolean[]
 *                    ------------------------
 *                      리텬형은 한개만 사용할 수 있다
 *       ---------------------------------------
 *               o                x
 *               => double Math.random()
 *               => String trim()
 *               => int nextInt()
 *       ---------------------------------------
 *               x                o
 *               => 메소드 자체에서 처리 => 출력
 *               void main(String[] args) =>리턴형이 없는 경우 => void
 *                 
 *       ---------------------------------------
 *               x                x
 *               System.out.println() =>다음줄에 출력 (거의 빈도수가 없다)
 *       ---------------------------------------
 *    4) 메소드 선언 및 호출 방법
 *       public class A
 *       {
 *          --------------------------
 *            메소드 선언 위치
 *          --------------------------  
 *          public static void main(String[] args) {
 *          }
 *          --------------------------
 *            메소드 선언 위치 (메소드 안에 메소드 선언은 불가능)
 *            클래스안에 선언
 *          --------------------------
 *          자바는 메소드 클래스 종속 => 메소드
 *          클래스 밖에서 선언 => 함수(C/C++) => 독립적 사용이 불가능
 *       }
 *       
 *       형식)
 *           리턴형 메소드명(매개변수...)
 *           {
 *               사용자 요청 처리
 *               return 값;
 *                      -- 일치 (리턴형이 실제 전송값보다 클 수도 있다)
 *           }
 *           int 메소드명(매개변수)
 *           {
 *               return int,char,short,byte
 *           }
 *           
 *           void 메소드명(매개변수)
 *           ---- 전송할 데이터가 없다 => 자체 처리
 *           {
 *              return; => 생략이 가능 => 컴파일러가 자동 추가
 *              ------- 메소드의 종료
 *           }
 *           
 *           ==> 호출
 *           int 메소드명(매개변수)
 *           ---
 *           {
 *               return 10;
 *           }
 *           
 *           => int a=메소드명(값...)
 *              ---
 *           => 메소드는 호출시마다 처음부터 시작한다
 *           
 *           
 *    5) 메소드 응용      
 *                                                                          
 *     
 */
public class 메소드_1 {
	static void a()
	{
		System.out.println("a() start...");
		System.out.println("a() 사용자 요청 처리 종료..." );
		System.out.println("a() end...");
		return; // 생략이 가능 => 값을 보내줄때 한개만 사용이 가능
	}
	// 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();
		System.out.println();
		a();
		System.out.println("=====================");
		a();
		System.out.println("=====================");
		a();
		System.out.println("=====================");
		
	}

}
