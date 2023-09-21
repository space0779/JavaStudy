/*        A B C D E
 *        A B C D E
 *        A B C D E
 *        A B C D E
 *        A B C D E*/
public class 문제16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		for(int i=1;i<=5;i++)
		{
			c='A';
			for(int j=1;j<=5;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}
		System.out.println();
	}

}
