(function () {
    var GetScreensController = function (screenDal) {
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
    };
    angular.module('cinemaApp').controller('getScreensController', ['screenDal', GetScreensController]);
}());