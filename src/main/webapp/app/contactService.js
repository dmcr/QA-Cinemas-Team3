"use strict";

(function() {

    var ContactUsService = function(contactUsDal) {

        this.sendEmail = function(emailToSend) {
            return contactUsDal.sendEmail(emailToSend);
        }

    }

    angular.module("cinemaApp").service("contactUsService", ["contactUsDal", ContactUsService]);

}());