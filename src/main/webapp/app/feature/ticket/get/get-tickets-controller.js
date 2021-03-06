(function () {
    var GetTicketsController = function (ticketDal) {
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
    };
    angular.module('cinemaApp').controller('getTicketsController', ['ticketDal', GetTicketsController]);
}());