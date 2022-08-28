package com.web.x1.model;

import java.util.List;
import com.web.x1.model.Ratings;

public class Movie {
	private String Title;
	private String Year;
	private String Rated;
	private String Released;
	private String Runtime;
	private String Genre;
	private String Director;
	private String Writer;
	private String Actors;
	private String Plot;
	private String Language;
	private String Country;
	private String Awards;
	private String imdbID;
	private String Type;
	private String Poster;
	private List<Ratings> Ratings;
	private String Metascore;
	private String imdbRating;
	private String imdbVotes;
	private String DVD;
	private String BoxOffice;
	private String Production;
	private String Website;
	private String Response;
	private String OriginalPrice;
	private String CurrentPrice;
	
	public Movie(String title, String year, String rated, String released, String runtime, String genre,
			String director, String writer, String actors, String plot, String language, String country, String awards,
			String imdbID, String type, String poster, List<com.web.x1.model.Ratings> ratings, String metascore,
			String imdbRating, String imdbVotes, String dVD, String boxOffice, String production, String website,
			String response, String originalPrice, String currentPrice) {
		super();
		Title = title;
		Year = year;
		Rated = rated;
		Released = released;
		Runtime = runtime;
		Genre = genre;
		Director = director;
		Writer = writer;
		Actors = actors;
		Plot = plot;
		Language = language;
		Country = country;
		Awards = awards;
		this.imdbID = imdbID;
		Type = type;
		Poster = poster;
		Ratings = ratings;
		Metascore = metascore;
		this.imdbRating = imdbRating;
		this.imdbVotes = imdbVotes;
		DVD = dVD;
		BoxOffice = boxOffice;
		Production = production;
		Website = website;
		Response = response;
		OriginalPrice = originalPrice;
		CurrentPrice = currentPrice;
	}
	public String getOriginalPrice() {
		return OriginalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		OriginalPrice = originalPrice;
	}
	public String getCurrentPrice() {
		return CurrentPrice;
	}
	public void setCurrentPrice(String currentPrice) {
		CurrentPrice = currentPrice;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	public String getRated() {
		return Rated;
	}
	public void setRated(String rated) {
		Rated = rated;
	}
	public String getReleased() {
		return Released;
	}
	public void setReleased(String released) {
		Released = released;
	}
	public String getRuntime() {
		return Runtime;
	}
	public void setRuntime(String runtime) {
		Runtime = runtime;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public String getDirector() {
		return Director;
	}
	public void setDirector(String director) {
		Director = director;
	}
	public String getWriter() {
		return Writer;
	}
	public void setWriter(String writer) {
		Writer = writer;
	}
	public String getActors() {
		return Actors;
	}
	public void setActors(String actors) {
		Actors = actors;
	}
	public String getPlot() {
		return Plot;
	}
	public void setPlot(String plot) {
		Plot = plot;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getAwards() {
		return Awards;
	}
	public void setAwards(String awards) {
		Awards = awards;
	}
	public String getImdbID() {
		return imdbID;
	}
	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getPoster() {
		return Poster;
	}
	public void setPoster(String poster) {
		Poster = poster;
	}
	public List<Ratings> getRatings() {
		return Ratings;
	}
	public void setRatings(List<Ratings> ratings) {
		Ratings = ratings;
	}
	public String getMetascore() {
		return Metascore;
	}
	public void setMetascore(String metascore) {
		Metascore = metascore;
	}
	public String getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}
	public String getImdbVotes() {
		return imdbVotes;
	}
	public void setImdbVotes(String imdbVotes) {
		this.imdbVotes = imdbVotes;
	}
	public String getDVD() {
		return DVD;
	}
	public void setDVD(String dVD) {
		DVD = dVD;
	}
	public String getBoxOffice() {
		return BoxOffice;
	}
	public void setBoxOffice(String boxOffice) {
		BoxOffice = boxOffice;
	}
	public String getProduction() {
		return Production;
	}
	public void setProduction(String production) {
		Production = production;
	}
	public String getWebsite() {
		return Website;
	}
	public void setWebsite(String website) {
		Website = website;
	}
	public String getResponse() {
		return Response;
	}
	public void setResponse(String response) {
		Response = response;
	}
}
