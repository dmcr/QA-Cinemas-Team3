"use strict";

(function () {

    angular.module('cinemaApp').config(function ($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.otherwise("/dashboard");

        $stateProvider.state("dashboard", {
            url: "/dashboard",
            templateUrl: "app/feature/dashboard/dashboard-partial.html"
        }).state("film", {
            url: "/film",
            templateUrl: "app/feature/film/films.html"
        }).state("/film", {
            url: "/film",
            templateUrl: "app/feature/booking/get-booking-partial.html"
        })
    });
}());