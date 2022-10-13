package net.lorenzo.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.lorenzo.api.entity.Album;
import net.lorenzo.api.repository.AlbumsRepository;
import net.lorenzo.api.service.IAlbumsService;

@Service
public class AlbumsService implements IAlbumsService {

	@Autowired
	private AlbumsRepository repoAlbums;
	
	@Override
	public List<Album> buscarTodos() {
		// TODO Auto-generated method stub
		return repoAlbums.findAll();
	}

}
