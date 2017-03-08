(function () {
    var GetFilmsPostersController = function (filmDal, $state, $http, $stateParams) {
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
    
        vm.goToFilm = function(filmIdToParse) {
            $state.go('filminformation', {'filmId': filmIdToParse}); 
        };
    
    };
    angular.module('cinemaApp').controller('getFilmsPostersController', ['filmDal', '$state', '$http', '$stateParams', GetFilmsPostersController]);
}());