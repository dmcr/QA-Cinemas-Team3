(function() {

    var AddSeatController =  function($state, seatDal) {
        var vm = this;

        vm.addSeat = function(seatToAdd) {
            seatDal.saveSeat(seatToAdd).then(function (results) {
                vm.seatAddMessage  = results;
                $state.go('getseat');
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        };
    };

    angular.module('cinemaApp').controller('addSeatController', ['$state','seatDal',AddSeatController]);
}());