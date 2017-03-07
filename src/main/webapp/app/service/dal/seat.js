"use strict";

(function(){
    angular.module("cinemaApp").service("seatDal",["dal", SeatDal]);

    function SeatDal(dal){

        this.getSeats = function (){
            return dal.http.GET("rest/seat/json");
        };

        this.getSeatByID = function(seatToGetID) {
        	return dal.http.GET("rest/seat/json/" + seatToGetID);
        }

        this.saveSeat = function (seatToSave) {
        	return dal.http.POST("rest/seat/json", seatToSave);
        };

        this.updateSeat = function (seatToUpdateID, seatToUpdate) {
        	return dal.http.PUT("rest/seat/json/" + seatToUpdateID, seatToUpdate);
        }

        this.deleteSeat = function (seatToDeleteID) {
            return dal.http.DELETE("/rest/seat/json/", seatToDeleteID);
        };
    }
}());
