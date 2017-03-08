(function() {

    var AddBookingController =  function(filmDal, $stateParams, $state) {
        var vm = this;

        vm.addShowing = function(filmToAdd) {
            filmDal.saveShowing(filmToAdd).then(function (results) {
                vm.filmAddMessage  = results;
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
            $state.go('cms.managefilms', {}, { reload: true });
        };
    };

    angular.module('cinemaApp').controller('addBookingController', ['filmDal', '$stateParams', '$state',AddBookingController]);
}());