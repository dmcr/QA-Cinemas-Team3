(function () {
    var GetFilmsController = function (filmsDal) {
        var vm = this;

        function init() {
            filmsDal.getFilms().then(function (results) {
                vm.films = results;
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
    };
    angular.module('cinemaApp').controller('getFilmsController', ['FilmsDal', GetFilmsController]);
}());