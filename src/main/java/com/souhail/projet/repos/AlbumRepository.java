package com.souhail.projet.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.souhail.projet.entites.Album;

@RepositoryRestResource(path = "album")
@CrossOrigin(origins = "http://localhost:4200/")
public interface AlbumRepository extends JpaRepository<Album, Long> {

}
