(function() {

    var AddBookingController =  function(screenDal, $stateParams, $state) {
        var vm = this;

        vm.addShowing = function(screenToAdd) {
            screenDal.saveShowing(screenToAdd).then(function (results) {
                vm.screenAddMessage  = results;
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
            $state.go('cms.managescreens', {}, { reload: true });
        };
    };

    angular.module('cinemaApp').controller('addBookingController', ['screenDal', '$stateParams', '$state',AddBookingController]);
}());