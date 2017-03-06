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

(function(){
    angular.module("cinemaApp").service("filmDal",["dal", FilmDal]);

    function FilmDal(dal){

        this.getFilms = function (){
            return dal.http.GET("rest/film/json");
        };

        this.getFilmByID = function(filmToGetID) {
        	return dal.http.GET("rest/film/json/" + filmToGetID);
        }

        this.saveFilm = function (filmToSave) {
        	return dal.http.POST("rest/film/json", filmToSave);
        };

        this.updateFilm = function (filmToUpdateID, filmToUpdate) {
        	return dal.http.PUT("rest/film/json/" + filmToUpdateID, filmToUpdate);
        }

        this.deleteFilm = function (filmToDeleteID) {
            return dal.http.DELETE("/rest/film/json/" + filmToDeleteId);
        };
    }
}());
