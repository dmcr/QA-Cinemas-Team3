(function () {
    var AddUserBookingController = function (showingDal, seatTypeDal, filmDal, $stateParams) {
        var vm = this;

        function init() {
            showingDal.getShowingByID($stateParams.showingId).then(function (result) {
                vm.showing = result;
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
            filmDal.getFilmById($stateParams.filmId).then(function (result) {
                vm.film = result;
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
        
        
    };
    angular.module('cinemaApp').controller('addUserBookingController', ['showingDal', 'seatTypeDal', 'filmDal', '$stateParams', AddUserBookingController]);
}());