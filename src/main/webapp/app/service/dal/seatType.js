"use strict";

(function(){
    angular.module("cinemaApp").service("seatTypeDal",["dal", SeatTypeDal]);

    function SeatTypeDal(dal){

        this.getSeatTypes = function (){
            return dal.http.GET("rest/seattype/json");
        };

        this.getSeatTypeByID = function(seatTypeToGetID) {
        	return dal.http.GET("rest/seattype/json/" + seatTypeToGetID);
        }

        this.saveSeatType = function (seatTypeToSave) {
        	return dal.http.POST("rest/seattype/json", seatTypeToSave);
        };

        this.updateSeatType = function (seatTypeToUpdateID, seatTypeToUpdate) {
        	return dal.http.PUT("rest/seattype/json/" + seatTypeToUpdateID, seatTypeToUpdate);
        }

        this.deleteSeatType = function (seatTypeToDeleteID) {
            return dal.http.DELETE("/rest/seattype/json/" + seatTypeToDeleteId);
        };
    }
}());
