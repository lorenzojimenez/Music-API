package net.lorenzo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.lorenzo.api.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
