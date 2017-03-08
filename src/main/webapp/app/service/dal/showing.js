"use strict";

(function(){
    angular.module("cinemaApp").service("showingDal",["dal", ShowingDal]);

    function ShowingDal(dal){

        this.getShowings = function (){
            return dal.http.GET("rest/showing/json");
        };

        this.getShowingByID = function(showingToGetID) {
        	return dal.http.GET("rest/showing/json/" + showingToGetID);
        }

        // this.getShowingStartTime = function(showingToGetID) {
        //     return dal.http.GET("rest/showing/json/" + showingToGetID);
        // }

        this.saveShowing = function (showingToSave) {
        	return dal.http.POST("rest/showing/json", showingToSave);
        };

        this.updateShowing = function (showingToUpdateID, bookingToUpdate) {
        	return dal.http.PUT("rest/showing/json/" + showingToUpdateID, showingToUpdate);
        }

        this.deleteShowing = function (showingToDeleteID) {
            return dal.http.DELETE("/rest/showing/json/" + showingToDeleteId);
        };
    }
}());