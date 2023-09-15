/*
 *    비트 연산자
 * 
 *    int a=10;
 *    a&=2 ===> a=10&2 
 *    
 *      1010 => 10
 *      0010 => 2
 *     ------
 *      0010 => 2
 *      
 *    a|=2 ===> a=10|2 
 *    
 *      1010
 *      0010
 *     ------
 *      1010 => 10
 *      
 *    a^=2 ===> a=10^2
 *    
 *      1010
 *      0010
 *     ------
 *      1000 => 8
 */
public class 복합대입연산자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		a&=2;
		System.out.println(a);
		
		a=10;
		a|=2;
		System.out.println(a);
		
		a=10;
		a^=2;
		System.out.println(a);
		

	}

}
