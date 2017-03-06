(function() {

    var AddFilmController =  function($state, filmDal) {
        var vm = this;

        vm.addFilm = function(filmToAdd) {
            filmDal.saveFilm(filmToAdd).then(function (results) {
                vm.filmAddMessage  = results;
                $state.go('getfilm');
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        };
    };

    angular.module('cinemaApp').controller('addFilmController', ['$state','filmDal',AddFilmController]);
}());