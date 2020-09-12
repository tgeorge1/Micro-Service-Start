package com.tg.movie.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.tg.movie.model.CatelogItem;
import com.tg.movie.model.MovieDetails;
import com.tg.movie.model.MovieRatings;
import com.tg.movie.model.UserMovieRatings;

@RestController
@RequestMapping(path ="/movie-catelog" )
public class MovieCatelogController {
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@RequestMapping(path ="/{userId}" )
	public List<CatelogItem> getMovieRatings(@PathVariable String userId) {
		
		UserMovieRatings movieRatings=webClientBuilder.build()
					.get()
					//.uri("http://localhost:8082/movie-ratings/"+userId)  //same is replaced by microservice url below
					.uri("http://movie-rating-service/movie-ratings/"+userId)
					.retrieve().bodyToMono(UserMovieRatings.class)
					.block();
					
	return	movieRatings.getUserMovieRatings().stream().map(x->{
			
			MovieDetails movieDetails=webClientBuilder.build()
					.get()
					//.uri("http://localhost:8084/movies/"+x.getMovieId())  //same is replaced by microservice url below
					.uri("http://movie-details-service/movies/"+x.getMovieId())
					.retrieve().bodyToMono(MovieDetails.class)
					.block();
			
			return new CatelogItem(movieDetails.getId(),movieDetails.getName(),x.getRating());
			
		}).collect(Collectors.toList());
	}

}
