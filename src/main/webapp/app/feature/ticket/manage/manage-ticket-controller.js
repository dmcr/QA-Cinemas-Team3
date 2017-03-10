(function () {
    var ManageTicketController = function (ticketDal, $state) {
        var vm = this;

        function init() {
            ticketDal.getTickets().then(function (results) {
                vm.tickets = results;
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
        
        vm.updateTicket = function(ticketToUpdateId) {
                $state.go('cms.managetickets.updateticket', {'ticketId' : ticketToUpdateId});
        };
        
        vm.addTicket = function() {
        	$state.go('cms.managetickets.newticket');
        };
        
        vm.deleteTicket = function(ticketToDeleteID) {
            ticketDal.deleteTicket(ticketToDeleteID);
            $state.go($state.current, {}, {reload: true});
        };
    };
    angular.module('cinemaApp').controller('manageTicketController', ['ticketDal', '$state', ManageTicketController]);
}());