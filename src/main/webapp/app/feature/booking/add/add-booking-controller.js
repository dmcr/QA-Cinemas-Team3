(function() {

    var AddBookingController =  function(bookingDal, $stateParams, $state) {
        var vm = this;

        vm.addShowing = function(bookingToAdd) {
            bookingDal.saveShowing(bookingToAdd).then(function (results) {
                vm.bookingAddMessage  = results;
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
            $state.go('cms.managebookings', {}, { reload: true });
        };
    };

    angular.module('cinemaApp').controller('addBookingController', ['bookingDal', '$stateParams', '$state',AddBookingController]);
}());