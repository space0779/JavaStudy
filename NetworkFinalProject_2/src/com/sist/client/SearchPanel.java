package com.sist.client;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import com.sist.vo.*;
import com.sist.common.ImageChange;
import com.sist.manager.*;
import java.net.*;//URL
public class SearchPanel extends JPanel 
implements ActionListener{
     JTextField tf;
     JButton b1,b2;
     JTable table;
     JComboBox cbbox;
     DefaultTableModel model;
     ControlPanel cp;
     AlbumManager fm=new AlbumManager();
     public SearchPanel(ControlPanel cp)
     {
    	 this.cp=cp;// 화면 이동 
    	 tf=new JTextField(20);
    	 b1=new JButton("검색");
    	 b2=new JButton("홈이동");
    	 String[] ss= {"가수명","곡명"};
    	 cbbox=new JComboBox(ss);
    	 
    	 String[] col={"","곡명","가수명","앨범명","발매일"};
    	 //String[] col={"","곡명","가수명","",""};
    	 Object[][] row=new Object[0][5];// 가변 
    	 // 익명의 클래스 : 상속없이 오버라이딩 => 내부 클래스 
    	 /*
    	  *   내부 클래스 : 멤버클래스 (네트워크,쓰레드)
    	  *   => 두개의 클래스가 서로 공유하는 데이터가 있는 경우 
    	  *   => 
    	  *      네트워크 (서버) 
    	  *       = 대기  ==> 접속자의 IP
    	  *       = 통신
    	  *       
    	  *       class Server
    	  *       {
    	  *          Vector vc=new Vector() => IP정보 
    	  *          => 접속시 처리 
    	  *          class Client ==> Thread 
    	  *          {
    	  *             => vc이용 => 클라이언트마다 통신 
    	  *          }
    	  *          
    	  *       }
    	  *       
    	  *       ==> 실시간 데이터 수집 ==> 분석 => 실시간 시각화 
    	  *           ----------------------
    	  *             | 스파크 
    	  */
    	 model=new DefaultTableModel(row,col)
    	 {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
    		// Class.forName("") 
    	 };
    	 table=new JTable(model);
    	 table.setRowHeight(60);
    	 JScrollPane js=new JScrollPane(table);
    	 
    	 // 배치 
    	 JPanel p=new JPanel();
    	 p.add(cbbox);
    	 p.add(tf);
    	 p.add(b1);
    	 p.add(b2);
    	  
    	 
    	 setLayout(new BorderLayout());
    	 
    	 add("North",p);
    	 add("Center",js);
    	 
    	 b1.addActionListener(this);
    	 b2.addActionListener(this);
    	 tf.addActionListener(this);
     }
     public void findPrint(String title,String se)
     {
    	 try
    	 {
    		 ArrayList<AlbumVO> list=fm.FindData(title,se);
    		 for(int i=model.getRowCount()-1;i>=0;i--)
    		 {
    			 model.removeRow(i);
    		 }
    		 
    		 for(AlbumVO vo:list)
    		 {
    			 URL url=new URL(vo.getImage());
    			 Image image=ImageChange.getImage(
    					 new ImageIcon(url), 90, 90);
    			 Object[] obj={
    				new ImageIcon(image),vo.getTitle(),
    				vo.getSinger(),vo.getAlbum(),vo.getDate()
    			 };
    			 model.addRow(obj);
    		 }
    	 }catch(Exception ex){}
     }
     public void AlbumPrint(ArrayList<AlbumVO> list) {
 		try {
 			for(int i = model.getRowCount()-1;i>=0;i--) {
 				model.removeRow(i);
 			}
 			for(AlbumVO vo:list) {
 				URL url = new URL(vo.getImage());
 				Image image = ImageChange.getImage(new ImageIcon(url), 90, 90);
 				
 				Object[] data = {
 						new ImageIcon(image),"<html>"+vo.getTitle()+"</html>","<html>"+vo.getAlbum()+"</html>","<html>"+vo.getSinger()+"</html>",vo.getDate()
 				};
 				model.addRow(data);
 			}
 		} catch (Exception e) {
 			// TODO: handle exception
 		}
 	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1|| e.getSource()==tf)
		{
			String title=tf.getText();
			String se=cbbox.getSelectedItem().toString();
			if(title.trim().length()<1)
			{
				JOptionPane.showMessageDialog(this, "검색어 입력");
				tf.requestFocus();
				return;
			}
			
			findPrint(title,se);
		}
		else if(e.getSource()==b2)
		{
			cp.card.show(cp,"Home");
		}
	}
}
