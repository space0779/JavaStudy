package com.sist.client;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class ControlPanel extends JPanel{
	BoardListPanel blp;
	ChatPanel cp = new ChatPanel();
	SearchPanel sp;
	HomePanel hp;
	BoardInsertPanel bip;
	BoardUpdatePanel bup;
	BoardDeletePanel bdp;
	DetailPanel dp;
	MagazineDetailPanel mdp;
	MusicPanel mp;
	public CardLayout card = new CardLayout();
	ControlPanel(){
		blp = new BoardListPanel(this);
		bip = new BoardInsertPanel(this);
		bup = new BoardUpdatePanel(this);
		bdp = new BoardDeletePanel(this);
		dp = new DetailPanel(this);
		mdp = new MagazineDetailPanel(this);
		hp = new HomePanel(this);
		sp = new SearchPanel(this);
		mp = new MusicPanel(this);
		this.setLayout(card);
		this.add("Home",hp);
		this.add("Search",sp);
		this.add("Chat",cp);
		this.add("Board",blp);
		this.add("Insert",bip);
		this.add("Update",bup);
		this.add("Delete",bdp);
		this.add("Detail",dp);
		this.add("MagazineDetail",mdp);
		this.add("Search",sp);
		this.add("Music",mp);
	}

}