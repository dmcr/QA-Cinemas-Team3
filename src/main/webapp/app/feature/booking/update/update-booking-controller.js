(function () {
    var UpdateBookingController = function (bookingDal, $stateParams, $state) {
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
        
        vm.updateFilm = function(bookingToUpdate) {
            filmDal.updateFilm(bookingToUpdate.filmId, bookingToUpdate).then(function (result) {
                vm.bookingUpdateMessage  = result;
                $state.go('getbookings');
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        };
    };
    angular.module('cinemaApp').controller('updateBookingController', ['bookingDal', '$stateParams', '$state', UpdateBookingController]);
}());