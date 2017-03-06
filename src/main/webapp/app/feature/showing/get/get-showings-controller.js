(function () {
    var GetShowingsController = function (showingDal) {
        var vm = this;

        function init() {
            showingDal.getShowings().then(function (results) {
                vm.showings = results;
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
    };
    angular.module('cinemaApp').controller('getShowingsController', ['showingDal', GetShowingsController]);
}());