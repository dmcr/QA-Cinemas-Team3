"use strict";

(function() {
	angular.module("cinemaApp").service("contactDal", ["dal", ContactDal]);
	
	function ContactDal(dal) {
		
		this.sendEmail = function(emailToSend) {
			//Don't want to go to a specific page? Keep on home page
			return dal.http.POST("/qa-cinemas3/rest/email/send", emailToSend);
		};
		
	}	
	
}());