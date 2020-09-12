package com.tg.movie.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tg.movie.model.Movie;

@RestController
@RequestMapping(path = "/movies")
public class MovieDetailsController {
	
	@RequestMapping(path = "/{movieId}")
	public Movie getMovie(@PathVariable("movieId") String movieId) {
		System.out.println("IN controller");
		
		switch (movieId) {
		case "100":
			return new Movie ("101","thomas","AX");
		default:
			return new Movie ("101","george","DK");
		}
		
	}

}
