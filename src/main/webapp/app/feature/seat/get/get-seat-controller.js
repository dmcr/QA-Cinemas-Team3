(function () {
    var GetSeatController = function (seatDal) {
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
    };
    angular.module('cinemaApp').controller('getSeatController', ['seatDal', GetSeatController]);
}());