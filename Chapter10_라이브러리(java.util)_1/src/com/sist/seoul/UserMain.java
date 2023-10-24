package com.sist.seoul;
import java.util.*;
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("명소(1),자연(2):");
		int no=scan.nextInt();
		
		SeoulManager sm=new SeoulManager();
		Seoul[] seoul=sm.seoulAllData(no);
		for(Seoul s:seoul)
		{
			System.out.println(s.getNo()+"."+s.getName());
		}
	}

}
