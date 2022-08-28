package com.web.x1.model;

public class Search {
	private String Title;
	private String Year;
	private String imdbID;
	private String Type;
	private String Poster;
	
	public Search(String Title, String Year, String imdbID, String Type, String Poster) {
		super();
		this.Title = Title;
		this.Year = Year;
		this.imdbID = imdbID;
		this.Type = Type;
		this.Poster = Poster;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String Title) {
		this.Title = Title;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String Year) {
		this.Year = Year;
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
	public void setType(String Type) {
		this.Type = Type;
	}
	public String getPoster() {
		return Poster;
	}
	public void setPoster(String Poster) {
		this.Poster = Poster;
	}
	
	
}
