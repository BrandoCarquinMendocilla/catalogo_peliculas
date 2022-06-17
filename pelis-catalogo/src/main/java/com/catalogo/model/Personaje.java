package com.catalogo.model;

public class Personaje {
	private String name;
	private double height;
	private String birth_year;
	private String gender;
	
	public Personaje() {
		super();
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public String getBirth_year() {
		return birth_year;
	}

	public String getGender() {
		return gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}
