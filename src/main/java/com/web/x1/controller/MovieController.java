package com.web.x1.controller;

import com.google.gson.Gson;
import com.web.x1.calculator.PriceCalculator;
import com.web.x1.model.Movie;
import com.web.x1.model.MovieList;
import com.web.x1.model.SearchList;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import java.util.ArrayList;

@RestController
public class MovieController {

	@Value("${moviedb.api.key}")
	private String apiKey;

	@GetMapping("/movieSearch")
	@ResponseBody
	MovieList movieSearch (
			@RequestParam(value = "s", defaultValue = "") String movieName
			) {
		
		String url = "http://www.omdbapi.com/?apikey=" + apiKey + "&s=" + movieName;
		
		WebClient.Builder builder = WebClient
				.builder()
				.exchangeStrategies(ExchangeStrategies.builder()
						.codecs(configurer -> configurer.defaultCodecs())
				.build());
		
		String result = builder.build()
				.get()
				.uri(url)
				.retrieve()
				.bodyToMono(String.class)
				.block();
		
		SearchList sl = new Gson().fromJson(result, SearchList.class);
		
		int counter = 0;
		
		MovieList movieList = new MovieList();
		movieList.setMovie(new ArrayList<Movie>());
		movieList.setResponse(sl.getResponse());
		movieList.setTotalResults(sl.getTotalResults());
		
		while (counter < sl.getSearch().size()) {
			
			String movieID = sl.getSearch().get(counter).getImdbID();
			
			String movieUrl = "http://www.omdbapi.com/?apikey=" + apiKey + "&i=" + movieID;
			
			result = builder.build()
					.get()
					.uri(movieUrl)
					.retrieve()
					.bodyToMono(String.class)
					.block();
			
			Movie movie = new Gson().fromJson(result, Movie.class);
			movie = PriceCalculator.calculateMoviePrice(movie);
			movieList.getMovie().add(movie);
			
			counter++;
		}
		
		
		
		return movieList;
	}
}
