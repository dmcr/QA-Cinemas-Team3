(function () {
    var GetTicketController = function (ticketDal, $stateParams) {
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
    };
    angular.module('cinemaApp').controller('getTicketController', ['ticketDal', '$stateParams', GetTicketController]);
}());