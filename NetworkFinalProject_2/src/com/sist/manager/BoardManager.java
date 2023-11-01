package com.sist.manager;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.sist.vo.BoardVO;
import com.sist.vo.*;
public class BoardManager {
	private static ArrayList<BoardVO> bList = new ArrayList<BoardVO>();
	static {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("c:\\java_data\\board.txt");
			ois = new ObjectInputStream(fis);
			bList = (ArrayList<BoardVO>)ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			try {
				fis.close();
				ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public ArrayList<BoardVO> boardListData(int page){
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		int j = 0;
		int rowSize = 10;
		int pagecnt = (page*rowSize)-rowSize;
		
		ArrayList<BoardVO> temp = new ArrayList<BoardVO>();
		for(int i = bList.size()-1;i>=0;i--) {
			temp.add(bList.get(i));
		}
		
		for(int i =0;i<temp.size();i++) {
			if(j<10 && i>=pagecnt) {
				BoardVO vo = temp.get(i);
				list.add(vo);
				j++;
			}
		}
//		for(int i = bList.size()-pagecnt-1;i>=0;i--) {
//			list.add(bList.get(i+pagecnt));
//		}
		
		return list;
	}
	
	public int boardTotalPage() {
		return (int)(Math.ceil(bList.size()/10.0));
	}
	
	public void boardInsert(BoardVO vo) {
		bList.add(vo);
		filesave();
	}
	
	public BoardVO boardDetailData(int no) {
		BoardVO vo = new BoardVO();
		for(int i = 0; i<bList.size();i++) {
			BoardVO bVO = bList.get(i);
			if(bVO.getNo()==no) {
				bVO.setHit(bVO.getHit()+1);//조회수 증가
				vo=bVO;
				filesave();//파일과 list가 동일
				break;
				// 다음주부터 =>파일 /오라클
				//UPDATE board SET hit = hit+1 WHERE no=1;
				//오라클 (웹 핵심) => SQL
				//SQL (CRUD => SELECT, INSERT, UPDATE, DELETE)
			}
		}
		return vo;
	}
	
	public BoardVO boardUpdateData(int no) {
		BoardVO vo = new BoardVO();
		//SELECT * FROM board WHERE no=1;
		for(BoardVO bVO:bList) {
			if(bVO.getNo()==no) {
				vo = bVO;
				break;
			}
		}
		return vo;
	}
	
	public String boardUpdate(BoardVO vo) {
		String result = "NO";
		for(int i = 0; i<bList.size();i++) {
			BoardVO pVO = bList.get(i);
			if(vo.getNo()==pVO.getNo() && vo.getPwd().equals(pVO.getPwd())) {
				result = "YES";
				pVO.setContent(vo.getContent());
				pVO.setName(vo.getName());
				pVO.setSubject(vo.getSubject());
				//bList의 i번째 인덱스의 위치를 vo로 바꾼다.
				filesave();
				break;
			}
		}
		
		return result;
	}
	
	public String boardDelete(int no, String pwd) {
		String result = "NO";//NO,YES
		
		for(int i =0;i<bList.size();i++) {
			BoardVO vo = bList.get(i);
			if(vo.getNo()==no && vo.getPwd().equals(pwd)) {
				result="YES"; // 삭제
				bList.remove(i);
				filesave();
				break;
			}
		}
		
		return result;
		
	}
	
	public void filesave() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("c:\\java_data\\board.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(bList);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			try {
				fos.close();
				oos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public int boardSequence() {
		int max = 0;
		for(BoardVO vo:bList) {
			if(vo.getNo()>max) max=vo.getNo();
		}
		return max+1;
	}

}