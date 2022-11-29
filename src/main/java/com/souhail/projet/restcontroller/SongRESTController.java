package com.souhail.projet.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.souhail.projet.entites.Song;
import com.souhail.projet.service.SongService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class SongRESTController {
	
	@Autowired
	SongService songService;
	
	@RequestMapping(method = RequestMethod.GET)
	List<Song> getAllSongs(){
		return songService.getAllSongs();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Song getProduitById(@PathVariable("id") Long id) {
		return songService.getSong(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Song createSong(@RequestBody Song song) {
		return songService.saveSong(song);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Song updateSong(@RequestBody Song song) {
		return songService.updateSong(song);
	}
	
	@RequestMapping(value="/{id}" , method = RequestMethod.DELETE)
	public void deleteSong(@PathVariable("id") Long id) {
		songService.deleteSongById(id);
	}
	
	@RequestMapping(value="/prodscat/{idAlbum}",method = RequestMethod.GET)
	public List<Song> getSongsByAlbumId(@PathVariable("idAlbum") Long id) {
	return songService.findByAlbumIdAlbum(id);
	}
	
	@RequestMapping(value="/songsByName/{name}",method = RequestMethod.GET)
	public List<Song> findByNomProduitContains(@PathVariable("name") String name) {
	return songService.findBySongNameContains(name);
	}

	

}
