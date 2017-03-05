/**
 * Created by Kimberley on 05/03/2017.
 */

(function () {

    angular.module("qaCinema").service("ticketDal", ["dal", TicketDal]);

    function TicketDal(dal) {

        this.getTickets = function() {
            return dal.http.GET("rest/json/ticket");
        };

        this.createScreen = function() {
            return dal.http.POST("rest/json/ticket");
        };
    }

})();