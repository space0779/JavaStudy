package com.sist.client;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import com.sist.vo.*;
import com.sist.common.ImageChange;
import com.sist.manager.*;
import java.net.*;
public class MusicFindPanel extends JPanel{
	JTextField tf;
	JButton b1,b2;
	JTable table;
	DefaultTableModel model;
	ControllPanel cp;
	
	public MusicFindPanel(ControllPanel cp)
	{
		this.cp=cp;
		
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
		
	}
	public void findPrint(String title)
	{
		try
		{
			ArrayList<FoodHouseVO> list=fm.foodFindData(title);
			for(int i=model.getRowCount()-1;i>=0;i--)
			{
				model.removeRow(i);
				
			}
			
			for(FoodHouseVO vo:list)
			{
				URL url=new URL(vo.getPoster());
				Image image=ImageChange.getImage(new ImageIcon(url), 90, 90);
				Object[] obj= {
						new ImageIcon(image),vo.getName(),
						vo.getPhone()
				};
				model.addRow(obj);
			}
		}catch(Exception ex) {}
	}
}
