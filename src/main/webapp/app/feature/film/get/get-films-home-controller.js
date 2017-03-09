(function () {
    var GetFilmsHomeController = function (filmDal) {
        var vm = this;

        function init() {
            filmDal.getFilms().then(function (results) {
                vm.films = results;
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
    };
    angular.module('cinemaApp').controller('getFilmsHomeController', ['filmDal', GetFilmsHomeController]);
}());