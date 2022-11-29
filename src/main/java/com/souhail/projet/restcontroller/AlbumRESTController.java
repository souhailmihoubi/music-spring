package com.souhail.projet.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.souhail.projet.entites.Album;
import com.souhail.projet.repos.AlbumRepository;

@RestController
@RequestMapping("/api/album")
@CrossOrigin("*")
public class AlbumRESTController {
	
	@Autowired
	AlbumRepository albumRepository;
	@RequestMapping(method=RequestMethod.GET)
	public List<Album> getAllAlbums()
	{
	return albumRepository.findAll();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Album getAlbumById(@PathVariable("id") Long id) {
	return albumRepository.findById(id).get();
	}


}
