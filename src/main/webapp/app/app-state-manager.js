"use strict";

(function () {

    angular.module('cinemaApp').config(function ($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.otherwise("/dashboard");

        $stateProvider.state("dashboard", {
            url: "/dashboard",
            templateUrl: "app/feature/dashboard/dashboard-partial.html"
        }).state("films", {
            url: "/films",
            templateUrl: "app/feature/films/films.html"
        }).state("/films", {
            url: "/films",
            templateUrl: "app/feature/bookings/get-booking-partial.html"
        })
    });
}());