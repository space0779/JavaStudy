package com.sist.vo;

import java.io.Serializable;

public class RealTimeChartVO implements Serializable{
	private int no;
	private String grade;
	private String title;
	private String artist;
	private String album;
	private String image;
	private int like;
	private int AllListener;
	private int AllplayCount;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public int getAllListener() {
		return AllListener;
	}
	public void setAllListener(int allListener) {
		AllListener = allListener;
	}
	public int getAllplayCount() {
		return AllplayCount;
	}
	public void setAllplayCount(int allplayCount) {
		AllplayCount = allplayCount;
	}
}