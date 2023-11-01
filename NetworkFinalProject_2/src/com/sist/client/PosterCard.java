package com.sist.client;
import java.awt.*;
import javax.swing.*;
import java.net.*;
import com.sist.vo.*;
import com.sist.common.ImageChange;
public class PosterCard extends JPanel{
	JLabel poLa = new JLabel();
	JLabel tLa = new JLabel();
	public PosterCard(MagazineVO vo) {
		this.setLayout(null);
		poLa.setBounds(5, 5, 260, 130);
		tLa.setBounds(5, 140, 260, 30);
		
		this.add(poLa);
		this.add(tLa);
		
		try {
			if(vo.getImage()!=null) {
				URL url = new URL("https:"+vo.getImage());
				Image image = ImageChange.getImage(new ImageIcon(url), 260, 130);
				poLa.setIcon(new ImageIcon(image));
				tLa.setText(vo.getTitle());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}