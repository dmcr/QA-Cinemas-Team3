package com.qa.cinema.service;

public interface FilmService {
	
	String getAllFilms();
	
	String addNewFilm(String filmJson);
	
	String removeFilm(Long filmId);
	
	String updateFilm(Long filmId, String filmUpdated);
	
}
