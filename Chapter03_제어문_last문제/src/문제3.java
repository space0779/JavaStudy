//3.	1에서 100까지 3의 배수를 더하는 while 문의 빈칸에 적절한 코드를 삽입하라
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, 
		i=1;
		while (i<100) 
		{
		    if(i%3 != 0) 
		    {
		        i++;
		        continue;
		    }
		    else sum += i;
		    i++;

	}
		System.out.println("답:"+sum);
}
}
