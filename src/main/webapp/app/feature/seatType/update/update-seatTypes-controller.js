(function () {
    var UpdateSeatTypesController = function (seatTypeDal, $state) {
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
                $state.go('updateseattype', {'seatTypeId' : seatTypeToUpdateId}); 
        };
    };
    angular.module('cinemaApp').controller('updateSeatTypesController', ['seatTypeDal', '$state', UpdateSeatTypesController]);
}());