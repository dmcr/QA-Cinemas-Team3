"use strict";

(function(){
    angular.module("cinemaApp").service("ticketDal",["dal", TicketDal]);

    function TicketDal(dal){

        this.getTickets = function (){
            return dal.http.GET("rest/ticket/json");
        };

        this.getTicketByID = function(ticketToGetID) {
        	return dal.http.GET("rest/ticket/json/" + ticketToGetID);
        }

        this.saveTicket = function (ticketToSave) {
        	return dal.http.POST("rest/ticket/json", ticketToSave);
        };

        this.updateTicket = function (ticketToUpdateID, ticketToUpdate) {
        	return dal.http.PUT("rest/ticket/json/" + ticketToUpdateID, ticketToUpdate);
        }

        this.deleteTicket = function (ticketToDeleteID) {
            return dal.http.DELETE("/rest/ticket/json/" + ticketToDeleteId);
        };
    }
}());