(function () {
    var GetFilmController = function (filmDal, $state, $stateParams) {
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
    };
    angular.module('cinemaApp').controller('getFilmController', ['filmDal', '$state', '$stateParams', GetFilmController]);
}());