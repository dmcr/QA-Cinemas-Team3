(function() {

    var AddShowingController =  function(showingDal, $stateParams, $state) {
        var vm = this;

        vm.addShowing = function(showingToAdd) {
            showingDal.saveShowing(showingToAdd).then(function (results) {
                vm.showingAddMessage  = results;
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
            $state.go('cms.manageshowings', {}, { reload: true });
        };
    };

    angular.module('cinemaApp').controller('addShowingController', ['showingDal', '$stateParams', '$state', AddShowingController]);
}());