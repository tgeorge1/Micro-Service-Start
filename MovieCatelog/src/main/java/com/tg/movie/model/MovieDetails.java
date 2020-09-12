package com.tg.movie.model;

public class MovieDetails {
	
	private String id;
	private String director;
	private String description;
	private String name;
	
	
	public  MovieDetails() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public MovieDetails(String id, String director, String description, String name) {
		super();
		this.id = id;
		this.director = director;
		this.description = description;
		this.name = name;
	}


	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
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
