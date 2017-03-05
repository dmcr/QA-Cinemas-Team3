(function() {

    var AddTicketController =  function($state, ticketDal) {
        var vm = this;

        vm.addTicket = function(ticketToAdd) {
            ticketDal.saveTicket(ticketToAdd).then(function (results) {
                vm.ticketAddMessage  = results;
                $state.go('getbooking');
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        };
    };

    angular.module('cinemaApp').controller('addTicketController', ['$state','ticketDal',AddTicketController]);
}());