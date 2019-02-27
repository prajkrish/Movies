package com.example.IMDB.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Image {

	@Id
	private long id;
}
