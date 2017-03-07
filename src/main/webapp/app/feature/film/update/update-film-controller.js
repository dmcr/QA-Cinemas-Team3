(function () {
    var UpdateFilmController = function (filmDal, $stateParams, $state) {
        var vm = this;
        function init() {
        	filmDal.getFilmByID($stateParams.filmId).then(function (result) {
            	vm.film = result;
            }, function(error) {
            	vm.error = true;
            	vm.errorMessage = error;
            });
        }
        init();
        
        vm.updateFilm = function(filmToUpdate) {
            filmDal.updateFilm(filmToUpdate.filmId, filmToUpdate).then(function (results) {
                vm.filmUpdateMessage  = results;
                $state.go('getfilms');
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        };
    };
    angular.module('cinemaApp').controller('updateFilmController', ['filmDal', '$stateParams', '$state', UpdateFilmController]);
}());