"use strict";

(function () {

    angular.module('cinemaApp').config(function ($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.otherwise("/dashboard");

        $stateProvider.state("dashboard", {
            url: "/dashboard",
            templateUrl: "app/feature/dashboard/dashboard-partial.html"
        }).state("getfilm", {
            url: "/getfilm",
            templateUrl: "app/feature/film/films.html"
        }).state("getbooking", {
            url: "/getbooking",
            templateUrl: "app/feature/booking/get-booking-partial.html"
        })
    });
}());