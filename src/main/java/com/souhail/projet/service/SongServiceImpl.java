package com.souhail.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.souhail.projet.entites.Album;
import com.souhail.projet.entites.Song;
import com.souhail.projet.repos.SongRepository;

@Service
public class SongServiceImpl implements SongService{
	
	@Autowired
	SongRepository songRepository;

	@Override
	public Song saveSong(Song s) {
		return songRepository.save(s);
	}

	@Override
	public Song updateSong(Song s) {
		return songRepository.save(s);
	}

	@Override
	public void deleteSong(Song s) {
		songRepository.delete(s);		
	}

	@Override
	public void deleteSongById(Long id) {
		songRepository.deleteById(id);		
	}

	@Override
	public Song getSong(Long id) {
		return songRepository.findById(id).get();
	}

	@Override
	public List<Song> getAllSongs() {
		return songRepository.findAll();
	}

	@Override
	public List<Song> findBySongName(String name) {
		return songRepository.findBySongName(name);
	}

	@Override
	public List<Song> findBySongNameContains(String name) {
		return songRepository.findBySongNameContains(name);
	}


	@Override
	public List<Song> findByNameFeaturing(String name, String feat) {
		return songRepository.findByNameFeaturing(name, feat);
	}

	@Override
	public List<Song> findByAlbum(Album album) {
		return songRepository.findByAlbum(album);
	}

	@Override
	public List<Song> findByAlbumIdAlbum(Long id) {
		return songRepository.findByAlbumIdAlbum(id);
	}

	@Override
	public List<Song> findByOrderBySongNameAsc() {
		return songRepository.findByOrderBySongNameAsc();
	}

}
