"use strict";

(function () {

    angular.module('cinemaApp').config(function ($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.otherwise("/dashboard");

        $stateProvider.state("dashboard", {
            url: "/dashboard",
            templateUrl: "app/feature/dashboard/dashboard-partial.html"
        }).state("whatson-upcoming", {
            url: "/films",
            templateUrl: "app/feature/films/films.html"
        }).state("screens", {
            url: "/screens",
            templateUrl: "app/feature/screen/screen.html" })
    });
}());