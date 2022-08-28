package com.web.x1.model;

import java.util.List;

public class SearchList {
	private List<Search> Search;
	private String totalResults;
	private String Response;
	public SearchList(List<Search> Search, String totalResults, String Response) {
		super();
		this.Search = Search;
		this.totalResults = totalResults;
		this.Response = Response;
	}
	public List<Search> getSearch() {
		return Search;
	}
	public void setSearch(List<Search> Search) {
		this.Search = Search;
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
	public void setResponse(String Response) {
		this.Response = Response;
	}
}
