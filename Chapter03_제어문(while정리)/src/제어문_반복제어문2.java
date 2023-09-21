// break ==> while , for => System.exit(0)
public class 제어문_반복제어문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *    i=1  j=1 j=2 j=3
		 *    i=2  j=1 j=2 j=3
		 *    i=3  j=1 j=2 j=3  ==> 9
		 */
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
					break;
				System.out.println("i="+i+",j="+j);
			}
		}
	
	
	System.out.println("\n====== continue ======");
	for(int i=1;i<=3;i++)
	{
		for(int j=1;j<=3;j++)
		{
			if(j==2)
				continue;
			System.out.println("i="+i+",j="+j);
		}
	}
	
	System.out.println("====== 이름있는 break ======");
	outer:for(int i=1;i<=3;i++)
	{
		for(int j=1;j<=3;j++)
		{
			if(j==2)
				break outer;
			System.out.println("i="+i+",j="+j);
		}
	}
}
}
