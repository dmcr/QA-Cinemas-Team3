(function () {
    var UpdateTicketController = function (ticketDal, $stateParams, $state) {
        var vm = this;
        function init() {
            ticketDal.getTicketByID($stateParams.ticketId).then(function (result) {
                vm.ticket = result;
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();

        vm.updateTicket = function(ticketToUpdate) {
            ticketDal.updateTicket(ticketToUpdate.ticketId, ticketToUpdate).then(function (result) {
                vm.ticketUpdateMessage  = result;
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
            $state.go('cms.managetickets', {}, { reload: true });
        };
    };
    angular.module('cinemaApp').controller('updateTicketController', ['ticketDal', '$stateParams', '$state', UpdateTicketController]);
}());