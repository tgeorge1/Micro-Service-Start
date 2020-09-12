package com.tg.movie.model;

import java.util.List;

public class UserMovieRatings  {
	
	private List<MovieRatings> userMovieRatings;
	
	public UserMovieRatings() {
		// TODO Auto-generated constructor stub
	}

	
	
	public UserMovieRatings(List<MovieRatings> userMovieRatings) {
		super();
		this.userMovieRatings = userMovieRatings;
	}



	public List<MovieRatings> getUserMovieRatings() {
		return userMovieRatings;
	}

	public void setUserMovieRatings(List<MovieRatings> userMovieRatings) {
		this.userMovieRatings = userMovieRatings;
	}
	
	

}
