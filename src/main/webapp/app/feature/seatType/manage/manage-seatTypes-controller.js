(function () {
    var ManageSeatTypesController = function (seatTypeDal, $state) {
        var vm = this;

        function init() {
            seatTypeDal.getSeatTypes().then(function (results) {
                vm.seatTypes = results;
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
        
        vm.updateSeatType = function(seatTypeToUpdateId) {
                $state.go('cms.manageseattypes.updateseattype', {'seatTypeId' : seatTypeToUpdateId}); 
        };
    };
    angular.module('cinemaApp').controller('manageSeatTypesController', ['seatTypeDal', '$state', ManageSeatTypesController]);
}());