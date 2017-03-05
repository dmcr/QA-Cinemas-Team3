"use strict";

(function () {

    angular.module("cinemaApp").service("filmDal", ["dal", FilmDal]);

    function FilmDal (dal) {

        this.getFilms = function() {
            return dal.http.GET("rest/json/film");
        };


        this.getFilmById = function (filmIdToGet) {
            return dal.http.GET("rest/json/film/" + filmIdToGet);
        };

        this.saveFilm = function (filmToSave) {
            return dal.http.POST("rest/json/film", filmToSave);
        };

        this.updateFilm = function (filmId, filmToUpdate) {
            return dal.http.PUT("rest/json/film" + filmId, filmToUpdate);
        };

        this.deleteFilm = function (filmDeleteId) {
            return dal.http.DELETE("rest/json/film" + filmDeleteId);
        };
    }


})();