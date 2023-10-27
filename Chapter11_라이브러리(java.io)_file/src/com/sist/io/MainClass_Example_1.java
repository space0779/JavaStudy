package com.sist.io;
import java.io.*;
// => JavaDev => genie.txt => 읽어서 출력
public class MainClass_Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		try
		{
			fr=new FileReader("c:\\javaDev\\genie.txt");
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
			}catch(Exception ex) {}
		}
	}

}
