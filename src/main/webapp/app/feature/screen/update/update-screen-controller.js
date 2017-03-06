(function () {
    var UpdateScreenController = function (screenDal, $stateParams, $state) {
        var vm = this;
        function init() {
        	screenDal.getScreenByID($stateParams.screenId).then(function (result) {
            	vm.screen = result;
            }, function(error) {
            	vm.error = true;
            	vm.errorMessage = error;
            });
        }
        init();
        
        vm.updateScreen = function(screenToUpdate) {
            screenDal.updateScreen(screenToUpdate.screenId, screenToUpdate).then(function (result) {
                vm.screenUpdateMessage  = result;
                $state.go('getscreens');
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        };
    };
    angular.module('cinemaApp').controller('updateScreenController', ['screenDal', '$stateParams', '$state', UpdateScreenController]);
}());