package com.example.IMDB.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.IMDB.model.Image;

public interface ImageRepository extends PagingAndSortingRepository<Image, Long> {
	
	public Image findByName(String name);
}
