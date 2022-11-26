package com.souhail.projet.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Song {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idSong;
	private String songName;
	private String featuring; 
	private double duration;
	@ManyToOne
	private Album album;
	
	public Song() {
		super();
	}
	
	public Song(String songName, String featuring, double duration) {
		super();
		this.songName = songName;
		this.featuring = featuring;
		this.duration = duration;
	}
	
	
	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public Long getIdSong() {
		return idSong;
	}
	public void setIdSong(Long idSong) {
		this.idSong = idSong;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getFeaturing() {
		return featuring;
	}
	public void setFeaturing(String featuring) {
		this.featuring = featuring;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Song [idSong=" + idSong + ", songName=" + songName + ", featuring=" + featuring + ", duration="
				+ duration + "]";
	}
	
	

}
