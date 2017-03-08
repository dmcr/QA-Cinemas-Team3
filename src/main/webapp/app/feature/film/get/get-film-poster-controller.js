(function () {
    var GetFilmPosterController = function (filmDal, $scope, $http, $stateParams) {
        var vm = this;
        function init() {
        	$http.get("http://www.omdbapi.com/?i="+ $stateParams.imdbId +"&tomatoes=true&plot=full")
            .then(function(response){ 
            	vm.omdbfilm = response.data; 
            });
        }
        init();
    };
    angular.module('cinemaApp').controller('getFilmPosterController', ['filmDal', '$scope', '$http', '$stateParams', GetFilmPosterController]);
}());