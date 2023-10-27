package com.sist.io;
// => 한글 파일 읽기 => (X) => 다운로드 / 업로드
// read() / write() / => append
// => new FileInputStream / new FileOuputSteam("경로명")
// => create => new FileOuputSteam("경로명",true)
// 파일은 반드시 닫는다
import java.io.*;
import java.util.*;
public class MainClass_FileOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String[] cate={
					 "얼큰한 칼국수 맛집 베스트 20곳",
					 "여의도 맛집 베스트 50곳",
					 "일본 라멘 맛집 베스트 70곳",
					 "어복쟁반 맛집 베스트 15곳",
					 "한식 주점 베스트 30곳"
			};
			// category.txt
			for(String s:cate)
			{
				//파일 저장
				FileOutputStream fos=
						new FileOutputStream("c:\\java_data\\category.txt",true);
				fos.write((s+"\r\n").getBytes());
				// 문자열을 byte[]변환
				fos.close();
			}
			System.out.println("파일 저장 완료!!");
		}catch(Exception ex) {}
	}

}
