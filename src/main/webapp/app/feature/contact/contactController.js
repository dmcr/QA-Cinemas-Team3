(function () {
	
	var ContactController = function(contactDal) {
		
		var vm = this;
		var string = [];
		
		vm.sendEmail = function(emailToSend) {
			console.log(emailToSend);
			string = emailToSend;
			
			var emailToJson = JSON.stringify(string);
			
			
			console.log(emailToJson);
			
			contactDal.sendEmail(string);
		};
	};
	
	angular.module('cinemaApp').controller('contactController', ['contactDal', ContactController]);
	
}());
