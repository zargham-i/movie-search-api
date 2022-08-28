package com.web.x1.model;

import java.util.List;

public class MovieList {
	private List<Movie> movie;
	private String totalResults;
	private String Response;
	public MovieList(List<Movie> movie, String totalResults, String response) {
		super();
		this.movie = movie;
		this.totalResults = totalResults;
		this.Response = response;
	}
	public MovieList() {
		movie = null;
		totalResults = null;
		Response = null;
	}
	public List<Movie> getMovie() {
		return movie;
	}
	public void setMovie(List<Movie> movie) {
		this.movie = movie;
	}
	public String getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}
	public String getResponse() {
		return Response;
	}
	public void setResponse(String response) {
		Response = response;
	}
}
