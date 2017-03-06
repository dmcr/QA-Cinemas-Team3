(function () {
	
	var ContactController = function(cntactDal) {
		
		var vm = this;
		
		vm.sendEmail = function(emailToSend) {
			contactDal.sendEmail(emailToSend).then(function (results) {
				vm.sendEmailMessage = results;
			}, function (error) {
				vm.error = true;
				vm.errorMessage = error;
			});
		};
	};
	
	angular.module('cinemaApp').controller('contactController', ['contactDal', ContactController]);
	
}());
