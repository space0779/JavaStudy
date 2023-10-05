//10개의 난수를 발생하여 배열에 저장한 후에 인덱스가 1인 곳의 값을 출력하시오.
//위 문제 배열 중에서 최대값의 인덱스를 출력하시오

import java.util.Arrays;

public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("index[1]="+arr[1]);
		
		
		System.out.println("MAX:"+max);
	}

}
