package com.souhail.projet.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.souhail.projet.entites.Album;
import com.souhail.projet.entites.Song;

public interface SongRepository extends JpaRepository<Song, Long> {
	
	List<Song> findBySongName(String name);
	List<Song> findBySongNameContains(String name);
	
	
	@Query("select s from Song s where s.songName like %?1 and s.featuring like %?2")
	List<Song> findByNameFeaturing (String name,String feat);

	@Query("select s from Song s where s.album = ?1")
	List<Song> findByAlbum (Album album);
	
	List<Song> findByAlbumIdAlbum (Long id);
	
	List<Song> findByOrderBySongNameAsc();
	
	@Query("select s from Song s order by  s.duration ASC")
	List<Song> trierSongDurationASC ();
	
	@Query("select s from Song s order by  s.duration DESC")
	List<Song> trierSongDurationDESC ();

}
