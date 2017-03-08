(function() {

    var AddScreenController =  function($state, $stateParams,screenDal) {
        var vm = this;

        vm.addScreen = function(screenToAdd) {
            screenDal.saveScreen(screenToAdd).then(function (results) {
                vm.screenAddMessage  = results;
                $state.go('cms.managescreens', {}, { reload: true });
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
                $state.go('cms.managescreens', {}, { reload: true });
            });

        };
    };

    angular.module('cinemaApp').controller('addScreenController', ['$state','$stateParams','screenDal',AddScreenController]);

}());