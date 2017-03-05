"use strict";

(function () {

    angular.module('cinemaApp').config(function ($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.otherwise("/dashboard");

        $stateProvider.state("dashboard", {
            url: "/dashboard",
            templateUrl: "app/feature/dashboard/dashboard-partial.html"
        }).state("getfilm", {
            url: "/getfilm",
            templateUrl: "app/feature/film/get/get-film-partial.html"
        }).state("addfilm", {
            url: "/addfilm",
            templateUrl: "app/feature/film/add/add-film-partial.html"
        }).state("getbooking", {
            url: "/getbooking",
            templateUrl: "app/feature/booking/get/get-booking-partial.html"
        }).state("addbooking", {
        	url: "/addbooking",
        	templateUrl: "app/feature/booking/add/add-booking-partial.html"
        }).state("addshowing", {
        	url: "/addshowing",
        	templateUrl: "app/feature/showing/add/add-showing-partial.html"
        }).state("getshowing", {
        	url: "/getshowing",
        	templateUrl: "app/feature/showing/get/get-showing-partial.html"
        })
    });
}());