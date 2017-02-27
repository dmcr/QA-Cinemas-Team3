"use strict";

(function () {
    angular.module("cinemaApp").service("filmsDal", ["dal", FilmsDal]);

    function FilmsDal(dal) {

        this.getFilms = function () {
            return dal.http.GET("rest/films/json");
        };

    }
}());