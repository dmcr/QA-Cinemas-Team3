(function () {
    var AddUserBookingController = function (showingDal, seatTypeDal, filmDal, $state, $stateParams) {
        var vm = this;

        function init() {
            showingDal.getShowingByID($stateParams.showingId).then(function (result) {
                vm.showing = result;
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
            filmDal.getFilmByID($stateParams.filmId).then(function (result) {
            	vm.film = result;
            }, function(error) {
            	vm.error = true;
            	vm.errorMessage = error;
            });
            seatTypeDal.getSeatTypes().then(function (results) {
                vm.seatTypes = results;
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
            filmDal.getFilms().then(function (results) {
                vm.films = results;
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
    };
    angular.module('cinemaApp').controller('addUserBookingController', ['showingDal', 'seatTypeDal', 'filmDal', '$state', '$stateParams', AddUserBookingController]);
}());