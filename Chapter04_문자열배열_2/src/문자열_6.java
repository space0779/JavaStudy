import java.io.*;
import java.util.*;
public class 문자열_6 {
	static String seoulData="";
	static // 자동 실행 
	{
		try
		{
			FileReader fr=new FileReader("C:\\javaDev\\seoul_location.txt");
			int i=0;
			while((i=fr.read())!=-1)
			{
				seoulData+=(char)i;
			}
			fr.close();
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(seoulData);
		//1. 페이징 기법 => 10page
		String[] seoul=seoulData.split("\n");
		Scanner scan=new Scanner(System.in);
		int curpage=1;
		int totalpage=(int)(Math.ceil(seoul.length/10.0));
		//System.out.println("총페이지:"+totalpage);
		while(true)
		{
			System.out.println("페이지 선택(1~"+totalpage+"):");
			curpage=scan.nextInt();
			if(curpage<1 || curpage>28)
			{
				System.out.println("프로그램을 종료합니다!!");
				break;
			}
			final int ROW=20;
			int j=0; // 10개씩 나눠주는 변수
			int pagecnt=(curpage*ROW)-ROW; // for의 시작위치 (출력)
			/*
			 *  1page 0~9
			 *  2page 10~19
			 *  3page 20~29
			 *  
			 * 
			 */
			for(int i=0;i<seoul.length;i++)
			{
				String[] ss=seoul[i].split("\\|");
				if(j<ROW && j>=pagecnt)
				{
					System.out.println(ss[0]+"."+ss[1]);
					j++;
				}
			}
		}
	}

}
