package com.sist.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 캡슐화 
@Getter
@Setter
public class Music {
	// 변수 => 저장/값읽기 
	//        --------- 메소드 (setXxx,getXxx)
    private int mno;
    private String title;
    /*
     *   public void setTitle(String title)
     *   {
     *        this.title=title;
     *   }
     */
    private String singer;
    private String album;
    private int idcrement;
    private String state;
   //은닉화 => 클라이언트가 볼 수 있게 만든다 
   //변수 => 메모리에 저장 / 메모리에서 데이터 읽기 
   //      읽기 / 쓰기 => 기능 추가 ==> getter/setter
	
}