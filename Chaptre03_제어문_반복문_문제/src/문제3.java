//B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라 (for 사용)
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char c='B';c<='N';c+=2)
	    {
	    	if(c!='N')
	    	 System.out.print(c+",");
	    	else
	    	 System.out.print(c);
	    }
	}

}