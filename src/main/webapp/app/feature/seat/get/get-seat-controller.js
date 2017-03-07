(function () {
    var GetSeatController = function (seatDal, $stateParams) {
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
    };
    angular.module('cinemaApp').controller('getSeatController', ['seatDal', '$stateParams', GetSeatController]);
}());