/**
 * Created by Kimberley on 05/03/2017.
 */

"use strict";

(function () {

    angular.module("qaCinema").service("screenDal", ["dal", ScreenDal]);

    function ScreenDal(dal) {
        this.getScreens = function() {
            return dal.http.GET("rest/json/screen");
        };

        this.createScreen = function() {
            return dal.http.POST("rest/json/screen");
        };
    }
})();