package com.example.IMDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.IMDB.model.Actors;

public interface ActorsRepository extends JpaRepository<Actors,Long> {

}
