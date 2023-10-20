package com.sist.exception;
class AA
{
	public void display() {
		System.out.println("A:display() Call...");
	}
}
public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	Class clsName=Class.forName("com.sist.exception.AA");
        	Object obj=clsName.getDeclaredConstructor().newInstance();
        	AA a=(AA)obj;
        	a.display();
        }catch(Exception ex){}
	}

}