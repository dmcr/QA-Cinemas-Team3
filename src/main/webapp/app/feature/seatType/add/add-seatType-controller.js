(function() {

    var AddSeatTypeController =  function($state, seatTypeDal) {
        var vm = this;

        vm.addSeatType = function(seatTypeToAdd) {
            seatTypeDal.saveSeatType(seatTypeToAdd).then(function (results) {
                vm.seatTypeAddMessage  = results;
                $state.go('getseattype');
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        };
    };

    angular.module('cinemaApp').controller('addSeatTypeController', ['$state','seatTyoeDal',AddSeatTypeController]);
}());