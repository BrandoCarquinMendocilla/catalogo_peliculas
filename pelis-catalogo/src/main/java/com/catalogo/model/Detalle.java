package com.catalogo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Detalle {
	private String title;
	private int episode_id;
	private String opening_crawl;
	private String director;
	private String producer;
	private String release_date;
	private List<String> characters;
	
	public Detalle() {

	}
	
	public List<String> getCharacters() {
		return characters;
	}

	public void setCharacters(List<String> characters) {
		this.characters = characters;
	}

	public String getTitle() {
		return title;
	}

	public int getEpisode_id() {
		return episode_id;
	}

	public String getOpening_crawl() {
		return opening_crawl;
	}

	public String getDirector() {
		return director;
	}

	public String getProducer() {
		return producer;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setEpisode_id(int episode_id) {
		this.episode_id = episode_id;
	}

	public void setOpening_crawl(String opening_crawl) {
		this.opening_crawl = opening_crawl;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

}
