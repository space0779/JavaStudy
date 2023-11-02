package com.sist.server;
/*
 *   서버 
 *   ----
 *     접속 담당 ==> 1개만 사용 
 *     통신 담당 (요청 => 응답) ==> 클라이언트 접속자 수만큼 
 *     ------- 쓰레드 
 */
/*
 *     서버 
 *      => 서버구동 ServerSocket
 *                bind() ==> 개통 (ip,port) => 유심 
 *      => 대기 (클라이언트 접근) => listen()
 *      => 접속 처리 => accept() => 발신자 정보 확인 
 *         => 메모리에 저장 
 *         => 쓰레드를 클라이언트마다 생성 => 따로 통신 
 *         => 기능별 (Function)
 *            쓰레드 => 사용자 요청 => 처리 결과 응답 
 */
import java.net.*;
import java.io.*;
import java.util.*;

import com.sist.common.Function;
public class Server implements Runnable{
    // 클라이언트 정보 저장 => id,name,sex,ip,port
	private Vector<Client> waitVc=new Vector<Client>();
	private ServerSocket ss;
	private final int PORT=3355;
	
	// 서버 가동 ==> 한번만 실행이 가능 
	public Server()
	{
		try
		{
			ss=new ServerSocket(PORT);//IP자동 인식 
			// bind() => listen()
			// 50명까지 한정 
			System.out.println("Server Start...");
		}catch(Exception ex){}
	}
	// 접속시 처리 
	public void run()
	{
		try
		{
			while(true)
			{
				// 클라이언트 정보 얻기 => Socket (ip,port)
				Socket s=ss.accept();// 발신자 정보를 받는다 
				
				Client client=new Client(s);
				client.start();// 통신 시작 
			}
		}catch(Exception ex){}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Server server=new Server();
        new Thread(server).start();
	}

	// 통신 담당 => 따라 작동 => 쓰레드
	class Client extends Thread
	{
		String id,name,sex,pos;
		Socket s;
		// 클라이언트 요청 / 응답 
		BufferedReader in;// 요청받은 경우
		OutputStream out;// 응답 
		public Client(Socket s)
		{
			this.s=s;// 클라이언트 컴퓨터 
			// 서버는 클라이언트 정보 / 클라이언트는 서버에 대한 정보 
			// PORT 연결선 => 서버는 고정 PORT / 클라이언트 자동 생성 => 중복없이 생성 
			try
			{
				in=new BufferedReader(
						new InputStreamReader(s.getInputStream()));
				// 요청한값을 클라이언트 메모리에서 읽기
				out=s.getOutputStream();// 클라이언트에서 읽을 수 있게 메모리에 저장 
				
			}catch(Exception ex) {}
		}
		// 요청 => 응답 
		public void run()
		{
			try
			{
				while(true)
				{
					String msg=in.readLine();
					System.out.println("Client=>"+msg);
					// 로그인 => 100|id|name|sex
					StringTokenizer st=
							new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					switch(protocol)
					{
					  case Function.LOGIN:
					  {
						id=st.nextToken();
						name=st.nextToken();
						sex=st.nextToken();
						pos="대기실";
						
						// 접속되어 있는 사람들에게 전송 
						messageAll(Function.LOGIN+"|"+id+"|"
								+name+"|"+sex+"|"+pos);
						messageAll(Function.WAITCHAT+"|[알림 ☞] "+
								name+"님 입장하셨습니다");
						// waitVc => 저장 
						waitVc.add(this);
						// Login창을 닫고 , main을 보여준다 
						messageTo(Function.MYLOG+"|"+id);
						// 접속자 명단을 보낸다 
						for(Client client:waitVc)
						{
							messageTo(Function.LOGIN+"|"
									+client.id+"|"
									+client.name+"|"
									+client.sex+"|"
									+client.pos);
						}
						// 개설된 방을 전송 ==> (X)
					  }
					  break;
					  case Function.WAITCHAT:// 웹 => jsp
					  {
						  String data=st.nextToken();
						  messageAll(Function.WAITCHAT+"|["+name+"]"+data);
					  }
					  break;
					  case Function.EXIT:
					  {
						  messageAll(Function.WAITCHAT+"|[알림 ☞] "+name+"님 퇴장하셨습니다");
						  messageAll(Function.EXIT+"|"+id);
						  // id를 테이블에서 제거
						  for(int i=0;i<waitVc.size();i++)
						  {
							  Client client=waitVc.get(i);
							  if(client.id.equals(id))
							  {
								  messageTo(Function.MYEXIT+"|");
								  waitVc.remove(i);
								  try
								  {
									  //  송수신 종료
									  in.close();
									  out.close();
								  }catch(Exception ex) {}
								  break;
							  }
						  }
					  }
					  break;
					}
					
				}
			}catch(Exception ex) {}
		}
		// 처리 방식 => 2개 
		// 1. 접속자 전체로 전송 => 로그인(먼저 로그인 사람) / 나가기(남아 있는 사람) / 채팅 
		public synchronized void messageAll(String msg)
		{
			// synchronized => 동기방식 (쓰레드)
			try
			{
				for(Client client:waitVc)
				{
					client.messageTo(msg);
				}
			}catch(Exception ex) {}
		}
		// 2. 로그인 , 나가기 
		public synchronized void messageTo(String msg)
		{
			try
			{
				out.write((msg+"\n").getBytes());
			}catch(Exception ex) {}
		}
		
	}
}