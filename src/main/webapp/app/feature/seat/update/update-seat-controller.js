(function () {
    var UpdateSeatController = function (seatDal, $stateParams, $state) {
        var vm = this;
        function init() {
        	seatDal.getSeatByID($stateParams.seatId).then(function (result) {
            	vm.seat = result;
            }, function(error) {
            	vm.error = true;
            	vm.errorMessage = error;
            });
        }
        init();
        
        vm.updateSeat = function(seatToUpdate) {
            seatDal.updateSeat(seatToUpdate.seatId, seatToUpdate).then(function (result) {
                vm.seatUpdateMessage  = result;
                $state.go('cms.manageseats', {}, { reload: true });
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        };
    };
    angular.module('cinemaApp').controller('updateSeatController', ['seatDal', '$stateParams', '$state', UpdateSeatController]);
}());