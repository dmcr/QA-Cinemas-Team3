(function () {
    var GetBookingController = function (filmDal, $stateParams) {
        var vm = this;
        function init() {
        	filmDal.getBookingByID($stateParams.bookingId).then(function (result) {
            	vm.booking = result;
            }, function(error) {
            	vm.error = true;
            	vm.errorMessage = error;
            });
        }
        init();
    };
    angular.module('cinemaApp').controller('getBookingController', ['bookingDal', '$stateParams', GetBookingController]);
}());