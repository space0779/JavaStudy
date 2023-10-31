package com.sist.manager;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> list=
        		new ArrayList<String>();
        list.add("박문수");
        list.add("이순신");
        list.add("홍길동");
        System.out.println(list);
        
        ArrayList<String> list2=
        		new ArrayList<String>();
        for(int i=list.size()-1;i>=0;i--)
        {
        	list2.add(list.get(i));
        }
        System.out.println(list2);
	}

}