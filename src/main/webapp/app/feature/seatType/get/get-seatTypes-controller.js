(function () {
    var GetSeatTypesController = function (seatTypeDal) {
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
    };
    angular.module('cinemaApp').controller('getSeatTypesController', ['seatTypeDal', GetSeatTypesController]);
}());