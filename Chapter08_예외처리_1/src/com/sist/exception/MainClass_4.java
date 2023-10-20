package com.sist.exception;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 *    예외처리 
 *      = 예외복구 => try~catch
 *        try => 정상 수행 문장 => 에러발생  
 *        catch => try를 수행하는 과정 => 에러발생하면 
 *                              1)확인 2)복구 => 처음부터 수행 
 *                              ----- getMessage()
 *                                    printStackTrace()
 *        => catch를 여러번 사용이 가능 
 *           catch=> 순서가 존재한다 (계층구조) 
 *                   Throwable
 *                   ---------
 *                      |
 *                    Exception => 사용 
 *                      |
 *                 --------------|
 *                 IOExceptio RuntimeException 
 *                                  |
 *                                NumberFormatException
 *                   
 *      = 예외회피 => throws
 */
// UpDown Game 
public class MainClass_4 extends JFrame implements ActionListener{
    JTextField tf;
    JTextArea ta;
    JButton b1,b2;
    // 난수 
    int com; // 0
    // 초기화 ==> 생성자 
    public MainClass_4()
    {
    	tf=new JTextField(10);
    	tf.setEnabled(false);// 비활성화 
    	ta=new JTextArea();
    	JScrollPane js=new JScrollPane(ta);
    	b1=new JButton("Start");
    	b2=new JButton("Exit");
    	
    	// 윈도우 배치 
    	JPanel p=new JPanel();
    	p.add(tf);
    	p.add(b1);
    	p.add(b2);
    	
    	add("North",p);
    	add("Center",js);
    	
    	setSize(300,450);
    	setVisible(true);
    	
    	// 버튼 클릭시에 => actionPerformed호출 요청 
    	// 이벤트 처리 
    	b1.addActionListener(this);
    	//                 위치 
    	b2.addActionListener(this);
    	tf.addActionListener(this);// 엔터
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MainClass_4();
	}
    // 버튼 처리 , 엔터 처리 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
		    com=(int)(Math.random()*100)+1;
		    b1.setEnabled(false);
		    tf.setEnabled(true);
		    tf.requestFocus();
		    ta.append("게임을 시작합니다\n");
		}
		if(e.getSource()==b2)
		{
			dispose();
			System.exit(0);
		}
		if(e.getSource()==tf)
		{
			try
			{
				// 정상수행 
				String num=tf.getText();// 입력된 값 읽기
				int user=Integer.parseInt(num);
				// user/com
				if(user<1 || user>100)
				{
					ta.append("1~100까지 입력이 가능합니다\n");
				}
				else
				{
					if(com>user)
						ta.append("입력값보다 큰값을 입력하세요\n");
					else if(com<user)
						ta.append("입력가뵤보다 작은 값을 입력하세요\n");
					else
					{
						ta.append("Game Over!!\n");
						tf.setText("");
						b1.setEnabled(true);
						tf.setEnabled(false);
					}
				}
				tf.setText("");
				
			}catch(Exception ex)
			{
				// 에러발생 복구 
				JOptionPane.showMessageDialog(this, 
						"1~100까지 정수만 입력하세요");
				tf.setText("");
				tf.requestFocus();
			}
		}
	}

}