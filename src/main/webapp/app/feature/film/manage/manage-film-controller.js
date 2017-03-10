(function () {
    var ManageFilmController = function (filmDal, $state) {
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
        
        vm.updateFilm = function(filmToUpdateId) {
                $state.go('cms.managefilms.updatefilm', {'filmId' : filmToUpdateId});
        };
        
        vm.addFilm = function() {
        	$state.go('cms.managefilms.newfilm');
        };
        
        vm.deleteFilm = function(filmToDeleteID) {
            filmDal.deleteFilm(filmToDeleteID);
            $state.go($state.current, {}, {reload: true});
        };
    };
    angular.module('cinemaApp').controller('manageFilmController', ['filmDal', '$state', ManageFilmController]);
}());