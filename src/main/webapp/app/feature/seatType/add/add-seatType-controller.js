(function() {

    var AddSeatTypeController =  function($state, seatTypeDal) {
        var vm = this;

        vm.addSeatType = function(seatTypeToAdd) {
            seatTypeDal.saveSeatType(seatTypeToAdd).then(function (results) {
                vm.seatTypeAddMessage  = results;
                $state.go('cms.manageseattypes', {}, { reload: true });
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
                $state.go('cms.manageseattypes', {}, { reload: true });
            });
        };
    };

    angular.module('cinemaApp').controller('addSeatTypeController', ['$state','seatTypeDal',AddSeatTypeController]);
}());