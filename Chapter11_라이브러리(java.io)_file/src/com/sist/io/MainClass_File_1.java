package com.sist.io;
// 존재여부 확인 ==> exists() 
// => 폴더 / 파일 => mkdir / createNewFile
import java.io.*;
/*
 *   exists() : 존재 여부
 *   createNewFile() : 파일 생성
 *   mldir() : 디테로리 생성
 */
public class MainClass_File_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			// 폴더만들기
			File dir=new File("c:\\java_data");
			if(dir.exists())
			{
				System.out.println("이미 존재하는 폴더입니다!!");
			}
			else
			{
				dir.mkdir();// 폴더를 만든다
				System.out.println("폴더 생성 완료!!");
			}
			File file=new File("c:\\java_data\\category.txt");
			if(file.exists())
			{
				System.out.println("이미 존재하는 파일입니다!!");
			}
			else
			{
				file.createNewFile();// 파일을 만든다
				System.out.println("파일 생성 완료!!");
			}
		}catch(Exception ex) {}
	}

}
