(function() {

    var AddBookingController =  function($state, bookingDal) {
        var vm = this;

        vm.addBooking = function(bookingToAdd) {
            bookingDal.saveBooking(bookingToAdd).then(function (results) {
                vm.bookingAddMessage  = results;
                $state.go('getbooking');
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        };
    };

    angular.module('cinemaApp').controller('addBookingController', ['$state','bookingDal',AddBookingController]);
}());