(function () {
    var ManageScreenController = function (screenDal, $state) {
        var vm = this;

        function init() {
            screenDal.getScreens().then(function (results) {
                vm.screens = results;
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
        
        vm.updateScreen = function(screenToUpdateId) {
                $state.go('cms.managescreens.updatescreen', {'screenId' : screenToUpdateId});
        };
        
        vm.addScreen = function() {
        	$state.go('cms.managescreens.newscreen');
        };
        
        vm.deleteScreen = function(screenToDeleteID) {
            screenDal.deleteScreen(screenToDeleteID);
            $state.go($state.current, {}, {reload: true});
        };
    };
    angular.module('cinemaApp').controller('manageScreenController', ['screenDal', '$state', ManageScreenController]);
}());