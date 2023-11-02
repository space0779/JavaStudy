package com.sist.client;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import com.sist.common.ImageChange;
import com.sist.vo.RealTimeChartVO;

public class MusicPanel extends JPanel{
	ControlPanel cp;
	JLabel la1;
	DefaultTableModel model;
	JTable ta;
	public MusicPanel(ControlPanel cp) {
		this.cp = cp;
		
		la1 = new JLabel("실시간 차트 순위");
		la1.setPreferredSize(new Dimension(la1.getWidth(),50));
		la1.setFont(new Font("맑은 고딕",Font.BOLD,20));
		
		String[] col = {"등수","순위변동","","곡명","가수명","앨범명","좋아요","전체 청취수","전체 재생수"};
		Object[][] row = new Object[0][9];
		
		model = new DefaultTableModel(row,col) {
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
		};
		ta = new JTable(model);
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        ta.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        ta.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
		ta.setRowHeight(100);
		ta.getColumn("등수").setPreferredWidth(5);
		ta.getColumn("순위변동").setPreferredWidth(5);
		JScrollPane js = new JScrollPane(ta);
		
		this.setLayout(new BorderLayout());
		this.add("Center",js);
		this.add("North",la1);
		
	}
	
	public void MusicPrint(ArrayList<RealTimeChartVO> list) {
		for(int i = ta.getRowCount()-1;i>=0;i--) {
			ta.remove(i);
		}
		try {
			DecimalFormat formatter = new DecimalFormat("###,###,###,###");
			ArrayList<RealTimeChartVO> vo = list;
			for(RealTimeChartVO rtVO:vo) {
				URL url = new URL("https://"+rtVO.getImage());
				Image img = ImageChange.getImage(new ImageIcon(url), 90, 90);
				Object[] data = {
					rtVO.getNo(),rtVO.getGrade(),new ImageIcon(img)
					,"<html>"+rtVO.getTitle()+"</html>"
					,"<html>"+rtVO.getArtist()+"</html>"
					,"<html>"+rtVO.getAlbum()+"</html>"
					,"♥ "+formatter.format(rtVO.getLike())
					,formatter.format(rtVO.getAllListener())
					,formatter.format(rtVO.getAllplayCount())
				};
				model.addRow(data);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}