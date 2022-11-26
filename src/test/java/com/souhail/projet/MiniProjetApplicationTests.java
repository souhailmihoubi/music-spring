package com.souhail.projet;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.souhail.projet.entites.Album;
import com.souhail.projet.entites.Song;
import com.souhail.projet.repos.SongRepository;

@SpringBootTest
class MiniProjetApplicationTests {

	
	@Autowired
	private SongRepository songRepository;
	
	@Test
	public void testCreateSong() {
		Song song = new Song("Normal","",3.42);
		songRepository.save(song);
	}
	
	@Test
	public void testListerTousSongs(){
		
		List<Song> songs = songRepository.findAll();
		for (Song s : songs){
			System.out.println(s);
		}
	}
	
	@Test
	public void testFindSongByName() {
		List<Song> songs = songRepository.findBySongName("ANAMAN");
		
		for(Song s:songs) {
			System.out.println(s);
		}
	}
	
	
	
	@Test
	public void testFindSongByNameContains() {
		List<Song> songs = songRepository.findBySongNameContains("A");
		
		for(Song s:songs) {
			System.out.println(s);
		}
	}
	
	
	
	@Test
	public void testfindByNameFeaturing() {
		List<Song> songs = songRepository.findByNameFeaturing("Nice Guy!", "Jessie Reyez");
		
		for(Song s:songs) {
			System.out.println(s);
		}
	}
	
	@Test
	public void testfindByAlbum() {
		Album alb = new Album();
		alb.setIdAlbum(2L);
		List<Song> songs = songRepository.findByAlbum(alb);
		for(Song s:songs) {
			System.out.println(s);
		}
		
	}
	
	@Test
	public void testfindByAlbumIdAlbum() {
		List<Song> songs = songRepository.findByAlbumIdAlbum(2L);
		for(Song s:songs) {
			System.out.println(s);
		}
	}

	@Test
	public void testfindByOrderBySongNameAsc() {	
		List<Song> songs = songRepository.findByOrderBySongNameAsc();
		for(Song s:songs) {
			System.out.println(s);
		}
	}
	
	@Test
	public void testtrierSongDurationASC() {	
		List<Song> songs = songRepository.trierSongDurationASC();
		for(Song s:songs) {
			System.out.println(s);
		}
	}
	
	@Test
	public void testtrierSongDurationDESC() {	
		List<Song> songs = songRepository.trierSongDurationDESC();
		for(Song s:songs) {
			System.out.println(s);
		}
	}


}
