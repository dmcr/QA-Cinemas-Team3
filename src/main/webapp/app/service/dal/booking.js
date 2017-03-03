"use strict";

(function(){
    angular.module("cinemaApp").service("bookingDal",["dal", BookingDal]);

    function BookingDal(dal){

        this.getBookings = function (){
            return dal.http.GET("rest/booking/json");

        };
    }
}());
