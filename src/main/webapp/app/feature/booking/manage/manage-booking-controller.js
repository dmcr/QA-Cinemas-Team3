(function () {
    var ManageBookingController = function (bookingDal, $state) {
        var vm = this;

        function init() {
            bookingDal.getBookings().then(function (results) {
                vm.bookings = results;
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
        
        vm.updateBooking = function(bookingToUpdateId) {
                $state.go('cms.managebookings.updatesbooking', {'bookingId' : bookingToUpdateId});
        };
        
        vm.addBooking = function() {
        	$state.go('cms.managebookings.newbooking');
        };
        
        vm.deleteBooking = function(bookingToDeleteID) {
        	console.log(bookingToDeleteID);
            bookingDal.deleteBooking(bookingToDeleteID);
            $state.go($state.current, {}, {reload: true});
        };
    };
    angular.module('cinemaApp').controller('manageBookingController', ['bookingDal', '$state', ManageBookingController]);
}());