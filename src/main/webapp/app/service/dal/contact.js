"use strict";

(function() {
	
	function ContactDal(dal) {
		
		this.sendEmail = function(emailToSend) {
			return dal.http.POST("/qa-cinemas3/rest/email/send", emailToSend);
		};
		
	}	
	

	angular.module("cinemaApp").service("contactDal", ["dal", ContactDal]);
}());