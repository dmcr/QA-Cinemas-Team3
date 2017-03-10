"use strict";

(function(){
    angular.module("cinemaApp").service("screenDal",["dal", ScreenDal]);

    function ScreenDal(dal){

        this.getScreens = function (){
            return dal.http.GET("rest/screen/json");
        };

        this.getScreenByID = function(screenToGetID) {
        	return dal.http.GET("rest/screen/json/" + screenToGetID);
        }

        this.saveScreen = function (screenToSave) {
        	return dal.http.POST("rest/screen/json", screenToSave);
        };

        this.updateScreen = function (screenToUpdateID, screenToUpdate) {
        	return dal.http.PUT("rest/screen/json/" + screenToUpdateID, screenToUpdate);
        }

        this.deleteScreen = function (screenToDeleteID) {
            return dal.http.DELETE("/rest/screen/json/", screenToDeleteID);
        };
    }
}());
