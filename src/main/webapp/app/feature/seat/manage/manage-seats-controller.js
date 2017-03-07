(function () {
    var ManageSeatsController = function (seatDal, $state) {
        var vm = this;

        function init() {
            seatDal.getSeats().then(function (results) {
                vm.seats = results;
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
        
        vm.updateSeat = function(seatToUpdateId) {
                $state.go('cms.manageseats.updateseat', {'seatId' : seatToUpdateId}); 
        };
        
        vm.deleteSeat = function(seatToDeleteID) {
        	console.log(seatToDeleteID);
            seatDal.deleteSeat(seatToDeleteID);
            $state.go($state.current, {}, {reload: true});
        };
    };
    angular.module('cinemaApp').controller('manageSeatsController', ['seatDal', '$state', ManageSeatsController]);
}());