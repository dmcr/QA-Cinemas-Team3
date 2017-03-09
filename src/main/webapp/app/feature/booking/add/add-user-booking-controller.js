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
                console.log(" index search");
                console.log(vm.films);
                console.log(vm.films[0]);
                console.log(vm.films[0].filmId);
                console.log(vm.films[2].filmId == $stateParams.filmId);
            	for (var i=0; i<vm.films.length; i++) {
            		console.log(i);
            		if (vm.films[i].filmId == $stateParams.filmId)
            		{
            			console.log("IF WAS FOUND" + vm.films[i].filmId);
            			vm.filmindex = i;
        			}
            	}
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
        vm.getIndexOfParsedFilm = function() {
        	console.log("in index search");
        	for (var i=0; i<vm.films.length; i++) {
        		if (vm.films[i].filmId == $stateParams.filmId)
        			cosole.log(i);
        			return i;
        	}
        };
    };
    angular.module('cinemaApp').controller('addUserBookingController', ['showingDal', 'seatTypeDal', 'filmDal', '$state', '$stateParams', AddUserBookingController]);
}());