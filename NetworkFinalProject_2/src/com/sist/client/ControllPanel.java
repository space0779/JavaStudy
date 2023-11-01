package com.sist.client;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class ControllPanel extends JPanel{
	BoardListPanel blp;
	ChatPanel cp = new ChatPanel();
	SearchPanel sp = new SearchPanel();
	HomePanel hp = new HomePanel();
	BoardInsertPanel bip;
	BoardUpdatePanel bup;
	BoardDeletePanel bdp;
	DetailPanel dp;
	
	public CardLayout card = new CardLayout();
	ControllPanel(){
		blp = new BoardListPanel(this);
		bip = new BoardInsertPanel(this);
		bup = new BoardUpdatePanel(this);
		bdp = new BoardDeletePanel(this);
		dp = new DetailPanel(this);
		this.setLayout(card);
		this.add("Home",hp);
		this.add("Search",sp);
		this.add("Chat",cp);
		this.add("Board",blp);
		this.add("Insert",bip);
		this.add("Update",bup);
		this.add("Delete",bdp);
		this.add("Detail",dp);
	}

}