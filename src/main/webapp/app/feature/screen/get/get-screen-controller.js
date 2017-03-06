(function () {
    var GetScreenController = function (screenDal, $stateParams) {
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
    };
    angular.module('cinemaApp').controller('getScreenController', ['screenDal', '$stateParams', GetScreenController]);
}());