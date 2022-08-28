package com.web.x1.calculator;

import com.web.x1.model.Movie;

public class PriceCalculator {
	public static Movie calculateMoviePrice(Movie movie) {
		
		String moviePrice;
		
		if (movie.getBoxOffice() == null || movie.getBoxOffice().equals("N/A")) {
			moviePrice = "N/A";
		}
		else {
			//Box Office String Format: "$659,363,944"
			//This line will remove the '$' and ',' parse the number to int
			Integer boxOffice = Integer.parseInt(movie.getBoxOffice().replaceAll("[$,]", ""));
			Integer year = Integer.parseInt(movie.getYear());
			
			if (boxOffice > 100000000 && year >= 2010) {
				moviePrice = "19.99";
			}
			else if ((boxOffice > 50000000 && year >= 2010) || (boxOffice > 100000000 && year >= 1990)) {
				moviePrice = "9.99";
			}
			else {
				moviePrice = "4.99";
			}
			
			movie.setOriginalPrice(moviePrice);
			movie.setCurrentPrice(moviePrice);
		}
		return movie;
	}
}
