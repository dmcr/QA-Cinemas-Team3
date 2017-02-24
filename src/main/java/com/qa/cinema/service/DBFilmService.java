package com.qa.cinema.service;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.qa.cinema.util.JSONUtil;


@Stateless
@Default
public class DBFilmService implements FilmService{

	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	@Inject
	private JSONUtil util;

	@Override
	public String getAllFilms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFilmById(Long filmId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addNewFilm(String filmJson) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeFilm(Long filmId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateFilm(Long filmId, String filmUpdated) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
