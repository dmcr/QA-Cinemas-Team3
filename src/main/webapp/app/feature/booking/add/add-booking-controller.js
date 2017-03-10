(function() {

    var AddBookingController =  function(bookingDal, $stateParams, $state) {
        var vm = this;

        vm.addBooking = function(bookingToAdd) {
            bookingDal.saveBooking(bookingToAdd).then(function (results) {
                vm.bookingAddMessage  = results;
                $state.go('cms.managebookings', {}, { reload: true });
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
                $state.go('cms.managebookings', {}, { reload: true });
            });
        };
    };

    angular.module('cinemaApp').controller('addBookingController', ['bookingDal', '$stateParams', '$state', AddBookingController]);
}());