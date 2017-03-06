(function() {

    var AddScreenController =  function($state, screenDal) {
        var vm = this;

        vm.addScreen = function(screenToAdd) {
            screenDal.saveScreen(screenToAdd).then(function (results) {
                vm.screenAddMessage  = results;
                $state.go('getscreen');
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        };
    };

    angular.module('cinemaApp').controller('addScreenController', ['$state','screenDal',AddScreenController]);
}());