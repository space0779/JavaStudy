import java.util.Scanner;
public class 문제_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cum=(int)(Math.random()*3);
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0),바위(1),보(2)");
		int user=scan.nextInt();
		
		switch(cum)
		{
		case 0:
			switch(user)
			{
			case 0:
				System.out.println("비겼다");
				break;
			case 1:
				System.out.println("사용자 win");
				break;
			case 2:
				System.out.println("컴퓨터 win");
				break;
			}
			break;
		case 1:
			switch(user)
			{
			case 0:
				System.out.println("컴퓨터 win");
				break;
			case 1:
				System.out.println("비겼다");
				break;
			case 2:
				System.out.println("사용자 win");
				break;
			}
			break;
		case 2:
			switch(user)
			{
			case 0:
				System.out.println("사용자 win");
				break;
			case 1:
				System.out.println("컴퓨터 win");
				break;
			case 2:
				System.out.println("비겼다");
				break;
			}
			break;
				
		}
	}

}
