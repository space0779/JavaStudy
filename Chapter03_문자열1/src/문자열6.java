import java.util.Scanner;
// startswith, 
public class 문자열6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data= {
				"Java와 JSP",
				"Java와 Oracle",
				"Oracle Programming",
				"JQuery AND AJAX",
				"Spring AND Java"
		};
		Scanner scan=new Scanner(System.in);
		System.out.println("검색어 입력:");
		String findData=scan.nextLine();
		System.out.println(findData);
		for(int i=0;i<data.length;i++)
		{
			if(data[i].contains(findData))
			{
				try
				{
					Thread.sleep(i);
		  
		        }catch(Exception ex) {}
			    System.out.println(data[i]);
			}
	}
	

}
}
