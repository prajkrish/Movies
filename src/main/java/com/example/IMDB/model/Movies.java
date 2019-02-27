package com.example.IMDB.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Entity
@Data
public class Movies {

	@Id
	private long id;
	
	private String name;
	
	private int year;
	
	@Lob
    @Column(name="MOVIE_IMAGE", nullable=false, columnDefinition="mediumblob")
    private byte[] poster;
	
}
