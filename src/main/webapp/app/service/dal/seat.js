/**
 * Created by Kimberley on 05/03/2017.
 */

(function () {

    angular.module("qaCinema").service("seatDal", ["dal", SeatDal]);

    function SeatDal(dal) {

        this.getSeats = function() {
            return dal.http.GET("rest/json/seat");
        };

        this.createSeat = function() {
            return dal.http.POST("rest/json/seat");
        };

        this.updateSeat = function() {
            return dal.http.PUT("rest/json/seat");
        };
    }

})();