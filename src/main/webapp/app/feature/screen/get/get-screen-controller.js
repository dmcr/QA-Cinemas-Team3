(function () {
    var GetScreenController = function (screenDal) {
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
    angular.module('cinemaApp').controller('getScreenController', ['screenDal', GetScreenController]);
}());