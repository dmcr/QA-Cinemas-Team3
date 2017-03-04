package com.qa.cinema.service;

public interface FilmService {
	
	String getAllFilms();
	
	String getFilmById(Long filmId);
	
	String addNewFilm(String filmJson);
	
	String removeFilm(Long filmId);
	
	String updateFilm(Long filmId, String filmUpdate);
	
}
