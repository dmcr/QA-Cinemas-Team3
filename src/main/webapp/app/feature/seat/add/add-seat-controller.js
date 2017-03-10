(function() {

    var AddSeatController =  function(seatDal, $stateParams, $state) {
        var vm = this;

        vm.addSeat = function(seatToAdd) {
            seatDal.saveSeat(seatToAdd).then(function (results) {
                vm.seatAddMessage  = results;
                $state.go('cms.manageseats', {}, { reload: true });
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
                $state.go('cms.manageseats', {}, { reload: true });
            });
        };
    };

    angular.module('cinemaApp').controller('addSeatController', ['seatDal', '$stateParams', '$state', AddSeatController]);
}());