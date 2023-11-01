package com.sist.vo;
import java.io.Serializable;
public class MusicVO implements Serializable{
	private int number;
	private String rank;
	private String title;
	private String artist;
	private String album;
	private String albumImg;
	private String like;
	private String totalListner;
	private String totalPlay;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
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
	public String getAlbumImg() {
		return albumImg;
	}
	public void setAlbumImg(String albumImg) {
		this.albumImg = albumImg;
	}
	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}
	public String getTotalListner() {
		return totalListner;
	}
	public void setTotalListner(String totalListner) {
		this.totalListner = totalListner;
	}
	public String getTotalPlay() {
		return totalPlay;
	}
	public void setTotalPlay(String totalPlay) {
		this.totalPlay = totalPlay;
	}
	
	
	
	
}
