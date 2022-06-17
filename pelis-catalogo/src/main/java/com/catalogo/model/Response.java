package com.catalogo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
	private int count;
	private String next;
	private String previous;
	private List<Detalle> results;
	
	public Response() {
		super();
	}

	public int getCount() {
		return count;
	}

	public String getNext() {
		return next;
	}

	public String getPrevious() {
		return previous;
	}

	public List<Detalle> getResults() {
		return results;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	public void setResults(List<Detalle> results) {
		this.results = results;
	}
	
	
}
