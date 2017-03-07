"use strict";

(function () {

    angular.module('cinemaApp').config(function ($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.otherwise("/dashboard");

        $stateProvider.state("dashboard", {
            url: "/dashboard",
            templateUrl: "app/feature/dashboard/dashboard-partial.html"
        }).state("getfilms", {
            url: "/getfilms",
            templateUrl: "app/feature/film/get/get-films-partial.html"
        }).state("getfilm", {
            url: "/getfilm/{filmId:[0-9]*}",
            templateUrl: "app/feature/film/get/get-film-partial.html"
        }).state("getfilmshowings", {
            url: "/getfilmshowings/{filmId:[0-9]*}",
            templateUrl: "app/feature/film/get/get-film-showings-partial.html"
        }).state("addfilm", {
            url: "/addfilm",
            templateUrl: "app/feature/film/add/add-film-partial.html"
        }).state("updatefilm", {
            url: "/updatefilm/{filmId:[0-9]*}",
            templateUrl: "app/feature/film/update/update-film-partial.html"
        }).state("getbookings", {
            url: "/getbookings",
            templateUrl: "app/feature/booking/get/get-bookings-partial.html"
        }).state("getbooking", {
            url: "/getbooking/{bookingId:[0-9]*}",
            templateUrl: "app/feature/booking/get/get-booking-partial.html"
        }).state("addbooking", {
        	url: "/addbooking",
        	templateUrl: "app/feature/booking/add/add-booking-partial.html"
        }).state("updatebooking", {
        	url: "/updatebooking/{bookingId:[0-9]*}",
        	templateUrl: "app/feature/booking/update/update-booking-partial.html"
//        }).state("addshowing", {
//        	url: "/addshowing",
//        	templateUrl: "app/feature/showing/add/add-showing-partial.html"
        }).state("getshowings", {
        	url: "/getshowings",
        	templateUrl: "app/feature/showing/get/get-showings-partial.html"
        }).state("getshowing", {
        	url: "/getshowing/{showingId:[0-9]*}",
        	templateUrl: "app/feature/showing/get/get-showing-partial.html"
//        }).state("updateshowing", {
//        	url: "/updateshowing/{showingId:[0-9]*}",
//        	templateUrl: "app/feature/showing/update/update-showing-partial.html"
        }).state("addticket", {
        	url: "/addticket",
        	templateUrl: "app/feature/ticket/add/add-ticket-partial.html"
        }).state("gettickets", {
        	url: "/gettickets",
        	templateUrl: "app/feature/ticket/get/get-tickets-partial.html"
        }).state("getticket", {
        	url: "/getticket/{ticketId:[0-9]*}",
        	templateUrl: "app/feature/ticket/get/get-ticket-partial.html"
        }).state("updateticket", {
        	url: "/updateticket/{ticketId:[0-9]*}",
        	templateUrl: "app/feature/ticket/update/update-ticket-partial.html"
        }).state("addscreen", {
        	url: "/addscreen",
        	templateUrl: "app/feature/screen/add/add-screen-partial.html"
        }).state("getscreens", {
        	url: "/getscreens",
        	templateUrl: "app/feature/screen/get/get-screens-partial.html"
        }).state("getscreen", {
        	url: "/getscreen/{screenId:[0-9]*}",
        	templateUrl: "app/feature/screen/get/get-screen-partial.html"
        }).state("updatescreen", {
        	url: "/updatescreen/{screenId:[0-9]*}",
        	templateUrl: "app/feature/screen/update/update-screen-partial.html"
        }).state("getseats", {
        	url: "/getseats",
        	templateUrl: "app/feature/seat/get/get-seats-partial.html"
        }).state("getseat", {
        	url: "/getseat/{seatId:[0-9]*}",
        	templateUrl: "app/feature/seat/get/get-seat-partial.html"
        }).state("addseattype", {
        	url: "/addseattype",
        	templateUrl: "app/feature/seatType/add/add-seatType-partial.html"
        }).state("getseattypes", {
        	url: "/getseattypes",
        	templateUrl: "app/feature/seatType/get/get-seatTypes-partial.html"
        }).state("getseattype", {
        	url: "/getseattype/{seatTypeId:[0-9]*}",
        	templateUrl: "app/feature/seatType/get/get-seatType-partial.html"
//        }).state("updateseattype", {
//        	url: "/updateseattype/{seatTypeId:[0-9]*}",
//        	templateUrl: "app/feature/seatType/update/update-seatType-partial.html"
//        }).state("manageseattypes", {
//        	url: "/manageseattypes",
//        	templateUrl: "app/feature/seatType/manage/manage-seatTypes-partial.html",
//        }).state("updateseattypes", {
//        	url: "/updateseattypes",
//        	templateUrl: "app/feature/seatType/update/update-seatTypes-partial.html"
        }).state("cms", {
        	url: "/cms",
        	templateUrl: "app/feature/cms/manage-content-partial.html"
        }).state("cms.manageseats", {
        	url: "/manageseats",
        	templateUrl: "app/feature/seat/manage/manage-seats-partial.html"
        }).state("cms.manageseats.updateseat", {
        	url: "/updateseat/{seatId:[0-9]*}",
        	templateUrl: "app/feature/seat/update/update-seat-partial.html"
        }).state("cms.manageseats.newseat", {
        	url: "/newseat",
        	templateUrl: "app/feature/seat/add/add-seat-partial.html"
        }).state("cms.manageseattypes", {
        	url: "/manageseattypes",
        	templateUrl: "app/feature/seatType/manage/manage-seatTypes-partial.html"
        }).state("cms.manageseattypes.updateseattype", {
        	url: "/updateseattype/{seatTypeId:[0-9]*}",
        	templateUrl: "app/feature/seatType/update/update-seatType-partial.html"
        }).state("cms.manageshowings", {
        	url: "/manageshowings",
        	templateUrl: "app/feature/showing/manage/manage-showings-partial.html"
        }).state("cms.manageshowings.updateshowing", {
        	url: "/updateshowing/{showingId:[0-9]*}",
        	templateUrl: "app/feature/showing/update/update-showing-partial.html"
        }).state("cms.manageshowings.newshowing", {
        	url: "/newshowing",
        	templateUrl: "app/feature/showing/add/add-showing-partial.html"
        })
    });
}());