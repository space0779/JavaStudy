
/*
 *    선택 정렬 / 버블 정령
 *    
 *    30 10 50 40 20     ASC(올림차순:10 20 30 40 50 ) /  DESC (내침차순"50 40 30 20 10)
 *    -- --
 *    --    --
 *    -- 
 *    --
 * 
 */
import java.util.*;
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("====== 정렬전 ======");
		System.out.println(Arrays.toString(arr));
		
		//정렬
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("====== 정렬후(ASC) ======");
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("====== 정렬후(DESC) ======");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("====== API ======");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
