"use strict";

(function () {

    angular.module('cinemaApp').config(function ($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.otherwise("/dashboard");

        $stateProvider.state("dashboard", {
            url: "/dashboard",
            templateUrl: "app/feature/dashboard/dashboard-partial.html"
        })
            .state("getfilms", {
            url: "/getfilms",
            templateUrl: "app/feature/film/get/get-films-partial.html"
        })
            .state("getfilm", {
            url: "/getfilm/{filmId:[0-9]}",
            templateUrl: "app/feature/film/get/get-film-partial.html"
        })
            .state("addfilm", {
            url: "/addfilm",
            templateUrl: "app/feature/film/add/add-film-partial.html"
        })
            .state("filminfo", {
            url: "/filminfo",
            templateUrl: "app/feature/film/get/partials/main-info.html"
        })
            .state("getbookings", {
            url: "/getbookings",
            templateUrl: "app/feature/booking/get/get-bookings-partial.html"
        })
            .state("getbooking", {
            url: "/getbooking/{bookingId:[0-9]}",
            templateUrl: "app/feature/booking/get/get-booking-partial.html"
        })
            .state("addbooking", {
        	url: "/addbooking",
        	templateUrl: "app/feature/booking/add/add-booking-partial.html"
        })
            .state("addshowing", {
        	url: "/addshowing",
        	templateUrl: "app/feature/showing/add/add-showing-partial.html"
        })
            .state("getshowings", {
        	url: "/getshowings",
        	templateUrl: "app/feature/showing/get/get-showings-partial.html"
        })
            .state("getshowing", {
        	url: "/getshowing/{showingId:[0-9]}",
        	templateUrl: "app/feature/showing/get/get-showing-partial.html"
        })
            .state("addticket", {
        	url: "/addticket",
        	templateUrl: "app/feature/ticket/add/add-ticket-partial.html"
        })
            .state("getticket", {
        	url: "/getticket",
        	templateUrl: "app/feature/ticket/get/get-ticket-partial.html"
        })
            .state("addscreen", {
        	url: "/addscreen",
        	templateUrl: "app/feature/screen/add/add-screen-partial.html"
        })
            .state("getscreen", {
        	url: "/getscreen",
        	templateUrl: "app/feature/screen/get/get-screen-partial.html"
        })
            .state("addseat", {
        	url: "/addseat",
        	templateUrl: "app/feature/seat/add/add-seat-partial.html"
        })
            .state("getseat", {
        	url: "/getseat",
        	templateUrl: "app/feature/seat/get/get-seat-partial.html"
        })
            .state("addseattype", {
        	url: "/addseattype",
        	templateUrl: "app/feature/seatType/add/add-seatType-partial.html"
        })
            .state("getseattype", {
        	url: "/getseattype",
        	templateUrl: "app/feature/seatType/get/get-seatType-partial.html"
        })
            .state("getfilminfo", {
            url: "/getfilminfo/{filmId:[0-9]}",
            templateUrl: "app/feature/showing/get/get-showing-partial.html"
        })
            .state("BookingTest", {
            url: "/BookingTest",
            templateUrl: "app/feature/showing/get/BookingTest.html",
            params: {starttime: null}

        })
    });
}());