(function () {
	
	var ContactController = function(contactDal) {
		
		var vm = this;
		
		vm.sendEmail = function(emailToSend) {
			contactDal.sendEmail(emailToSend).then(function (results) {
				vm.sendEmailMessage = results;
				console.log(results);
			}, function (error) {
				vm.error = true;
				vm.errorMessage = error;
				console.log(results);
			});
		};
	};
	
	angular.module('cinemaApp').controller('contactController', ['contactDal', ContactController]);
	
}());
