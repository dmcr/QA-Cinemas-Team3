package com.qa.cinema.service;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qa.cinema.persistence.Film;
import com.qa.cinema.util.JSONUtil;


@Stateless
@Default
public class FilmServiceDBImp implements FilmService{

	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	@Inject
	private JSONUtil util;

	@Override
	public String getAllFilms() {
		Query query = em.createQuery("SELECT m FROM Film m");
		@SuppressWarnings("unchecked")
		Collection<Film> films = (Collection<Film>) query.getResultList();
		return util.getJSONForObject(films);
	}

	@Override
	public String getFilmById(Long filmId) {
		Query query = em.createQuery("SELECT f FROM Film f WHERE filmId =" + filmId);
		Film film = (Film) query.getSingleResult();
		return util.getJSONForObject(film);
	}

	@Override
	public String addNewFilm(String filmJson) {
		Film newFilm = util.getObjectForJSON(filmJson, Film.class);
		em.persist(newFilm);
		return  "{\"message\": \"film sucessfully added\"}" + filmJson;
	}

	@Override
	public String removeFilm(Long filmId) {
		Film film = findFilm(new Long(filmId));
		if (film != null) {
			em.remove(film);
		}
		return "{\"message\": \"film sucessfully removed\"}";

	}

	@Override
	public String updateFilm(Long filmId, String filmUpdate) {
		Film updateFilm = util.getObjectForJSON(filmUpdate, Film.class);
		Film film = findFilm(new Long(filmId));
		if (film != null) {
			film = updateFilm;
			em.merge(film);
		}
		return "{\"message\": \"film sucessfully updated\"}";
	}
	
	private Film findFilm(Long id) {
		return em.find(Film.class, id);
	}

}
