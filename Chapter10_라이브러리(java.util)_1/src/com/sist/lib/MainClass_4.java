package com.sist.lib;
/*
 *    Random : 난수 발생 
 *      => ***nextInt(int bound) ==> 0~bound-1 발생 
 *    326page 
 *     Arrays : 배열과 관련된 기능 제어 
 *     ------
 *      1) ***sort => 정렬 
 *         ==> ORDER BY no DESC(ASC) => 걸리는 시간ㅇ이 오래 걸린다
 *             ==> index (최적화) ***
 *      2) copyOf => 다른 배열에서 복사 
 *      3) toString() => 배열값 출력 
 *    328page StringTokenizer
 *      ==> 문자열 분리 
 *      가자미회무침 (소) 25,000원 ^
        가자미회무침 (대) 35,000원 ^
        홍게칼국수 7,000원 ^
        망치매운탕 23,000원 ^
        가지미회덮밥 13,000원 ^
        ==> split() => 정규식을 이용 => 쉽게 제작 
        ==> 네트워크 / 빅데이터 / 웹 
        ==> 기능(메소드)
            1) countTokens() : 분리된 데이터 갯수 
            2) nextToken() : 실제 분리된 데이터 읽기
            3) hasMoreTokens(): 분리된 수만큼 루프 수행 
 *      
 *    
 *      
 */
import java.util.*;
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[7];
        Random r=new Random();
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=r.nextInt(100)+1;//1~100
        }
        System.out.println("===== 정렬전 =====");
        System.out.println(Arrays.toString(arr));
        System.out.println("===== 정렬후 =====");
        Arrays.sort(arr);//ASC (올림차순)
        System.out.println(Arrays.toString(arr));
        // 가변 배열 
        // 작은 배열을 만들때
        int[] subArr=Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(subArr));
        // 큰 배열로 변경할때 
        int[] subArr2=Arrays.copyOf(arr, 10); // 0
        // 나머지영역은 초기값 설정 
        /*
         *   int 0
         *   double 0.0
         *   클래스 null
         *   boolean false
         */
        System.out.println(Arrays.toString(subArr2));
        
        
	}

}