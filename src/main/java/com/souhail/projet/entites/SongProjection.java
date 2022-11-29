package com.souhail.projet.entites;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "songName", types = { Song.class })
public interface SongProjection {
	
	public String getSongName();
	//public String getFeaturing();
	

}
