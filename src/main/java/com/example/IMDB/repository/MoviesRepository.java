package com.example.IMDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.IMDB.model.Movies;

public interface MoviesRepository extends JpaRepository<Movies,Long> {

}
