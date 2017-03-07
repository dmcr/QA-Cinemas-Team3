(function () {
    var UpdateSeatTypeController = function (seatTypeDal, $stateParams, $state) {
        var vm = this;
        function init() {
        	seatTypeDal.getSeatTypeByID($stateParams.seatTypeId).then(function (result) {
            	vm.seatType = result;
            }, function(error) {
            	vm.error = true;
            	vm.errorMessage = error;
            });
        }
        init();
        
        vm.updateSeatType = function(seatTypeToUpdate) {
            seatTypeDal.updateSeatType(seatTypeToUpdate.typeId, seatTypeToUpdate).then(function (result) {
                vm.seatTypeUpdateMessage  = result;
                $state.go('cms.manageseattypes', {}, { reload: true });
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        };
    };
    angular.module('cinemaApp').controller('updateSeatTypeController', ['seatTypeDal', '$stateParams', '$state', UpdateSeatTypeController]);
}());