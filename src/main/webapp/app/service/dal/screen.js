"use strict";

(function () {
    angular.module("cinemaApp").service("screenDal", ["dal", ScreenDal]);

    function ScreenDal(dal) {

        this.getScreens = function () {
            return dal.http.GET("rest/screen/json");
        };

    }
}());