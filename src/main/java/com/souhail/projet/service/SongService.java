package com.souhail.projet.service;

import java.util.List;

import com.souhail.projet.entites.Album;
import com.souhail.projet.entites.Song;

public interface SongService {
	
	Song saveSong(Song s);
	Song updateSong(Song s);
	void deleteSong(Song s);
	void deleteSongById(Long id);
	Song getSong(Long id);
	List<Song> getAllSongs();
	List<Song> findBySongName(String name);
	List<Song> findBySongNameContains(String name);
	List<Song> findByNameFeaturing (String name, String feat);
	List<Song> findByAlbum (Album album);
	List<Song> findByAlbumIdAlbum(Long id);
	List<Song> findByOrderBySongNameAsc();



}
