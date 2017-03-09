"use strict";

(function() {
	
	var contactDal = function (dal) {
		
		this.sendEmail = function(emailToSend) {
			//Don't want to go to a specific page? Keep on home page
			return dal.http.POST("/qa-cinemas3/rest/email/send", emailToSend);
		}
		
	}	
	
	angular.module("cinemaApp").service("contactDal", ["dal", contactDal]);
}());