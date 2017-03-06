"use strict";

(function(){
    angular.module("cinemaApp").service("bookingDal",["dal", BookingDal]);

    function BookingDal(dal){

        this.getBookings = function (){
            return dal.http.GET("rest/booking/json");
        };

        this.getBookingByID = function(bookingToGetID) {
        	return dal.http.GET("rest/booking/json/" + bookingToGetID);
        }

        this.saveBooking = function (bookingToSave) {
        	return dal.http.POST("rest/booking/json", bookingToSave);
        };

        this.updateBooking = function (bookingToUpdateID, bookingToUpdate) {
        	return dal.http.PUT("rest/booking/json/" + bookingToUpdateID, bookingToUpdate);
        }

        this.deleteBooking = function (bookingToDeleteID) {
            return dal.http.DELETE("/rest/booking/json/" + bookingToDeleteId);
        };
    }
}());
