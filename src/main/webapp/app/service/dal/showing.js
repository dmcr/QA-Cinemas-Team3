/**
 * Created by Kimberley on 05/03/2017.
 */

(function () {

    angular.module("qaCinema").service("showingDal", ["dal", ShowingDal]);

    function ShowingDal(dal) {

        this.getShowings = function() {
            return dal.http.GET("rest/json/showing");
        };

        this.createShowing = function() {
            return dal.http.POST("rest/json/showing");
        };
    }

})();