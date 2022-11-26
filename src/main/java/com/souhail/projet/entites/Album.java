package com.souhail.projet.entites;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Album {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idAlbum;
	private String albumName;
	private String SingerName;	
	private Date releaseDate;
	
	@OneToMany (mappedBy = "album")
	@JsonIgnore
	private List<Song> songs;

}
