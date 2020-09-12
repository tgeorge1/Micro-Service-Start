package com.tg.movie.model;

public class Movie {
	
	private String id;
	private String director;
	private String description;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	
	public Movie(String id	, String director, String description) {
		this.id=id;
		this.description=description;
		this.director=director;
	}
	
	public String getId() {
		return id;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
