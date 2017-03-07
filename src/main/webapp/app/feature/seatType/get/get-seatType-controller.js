(function () {
    var GetSeatTypeController = function (seatTypeDal, $stateParams) {
        var vm = this;

        function init() {
            seatTypeDal.getSeatTypeById($stateParams.seatTypeId).then(function (result) {
                vm.seatType = result;
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
    };
    angular.module('cinemaApp').controller('getSeatTypeController', ['seatTypeDal', '$stateParams', GetSeatTypeController]);
}());