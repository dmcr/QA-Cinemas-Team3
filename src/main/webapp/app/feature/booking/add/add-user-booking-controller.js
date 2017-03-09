(function () {
    var AddUserBookingController = function (showingDal, seatTypeDal, filmDal, $state, $stateParams, $scope) {
    	
    	
    	
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
        }
        init();
        vm.priceChange = function(){
        	console.log("fired price change!");
   	     	vm.totalprice = vm.selectedSeatType;
   	    };
    };
    angular.module('cinemaApp').controller('addUserBookingController', ['showingDal', 'seatTypeDal', 'filmDal', '$state', '$stateParams', '$scope', AddUserBookingController]);
}());