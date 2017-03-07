(function () {
    var GetFilmController = function (filmDal, $stateParams) {
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
    angular.module('cinemaApp').controller('getFilmController', ['filmDal', '$stateParams', GetFilmController]);
}());