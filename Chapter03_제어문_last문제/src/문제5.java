
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=10;i++)
		  {
			int j  = (int)(Math.random()*10)+1;
			sum+=j;
			System.out.print(j+" ");
			
		}
		System.out.println("\n합:"+sum);
		System.out.println("평균:"+(sum/10.0));
	}

}
