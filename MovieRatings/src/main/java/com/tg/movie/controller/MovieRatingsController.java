package com.tg.movie.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tg.movie.model.MovieRatings;
import com.tg.movie.model.UserMovieRatings;

@RestController
public class MovieRatingsController {
	
	@RequestMapping(path = "/movie-ratings/{userId}")
	public UserMovieRatings getMovieRatings(@PathVariable String userId) {
		
		return new UserMovieRatings(
				Arrays.asList( new MovieRatings(userId,"100","3"),	new MovieRatings(userId,"101","4")));
	}

}
