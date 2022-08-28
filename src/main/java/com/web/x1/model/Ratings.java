package com.web.x1.model;

public class Ratings {
	private String Source;
	private String Value;
	public Ratings(String source, String value) {
		super();
		Source = source;
		Value = value;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getValue() {
		return Value;
	}
	public void setValue(String value) {
		Value = value;
	}
}
