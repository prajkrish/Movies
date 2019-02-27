package com.example.IMDB.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Producers {
	
	private long id;
	
	private String name;
	private String sex;
	private String bio;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
	private Date dob;
	
}
