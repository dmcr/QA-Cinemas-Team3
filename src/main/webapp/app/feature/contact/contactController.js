(function () {
	
	var contactController = function(contactService) {
		
		var vm = this;
		var string = [];
		
		vm.sendEmail = function(emailToSend) {
			console.log(emailToSend);
			string = emailToSend;
			
			//JSON convert?
			var emailJson = JSON.stringify(string);
			console.log(emailJson);
			contactService.sendEmail(emailToSend);
			
		};
		
	}
	
	angular.module('cinemaApp').controller('contactController', ['contactService', contactController]);
	
}());
