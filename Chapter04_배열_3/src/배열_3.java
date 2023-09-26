import java.util.*;
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		int[] arr2=arr.clone();// arr의 메모리에 있는 모든 내용을 copy해서 새로운 메모리를 저장
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		// 깊은 복사
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));

	}

}
