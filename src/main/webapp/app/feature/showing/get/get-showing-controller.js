(function () {
    var GetShowingController = function (showingDal, $stateParams) {
        var vm = this;

        function init() {
            showingDal.getShowingByID($stateParams.showingId).then(function (result) {
                vm.showing = result;
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
    };



    // function ParseVariables() {
    //
    // }
    //

    var ParseVariablesController = function(showingDal, $stateParams){
        var vm = this;

        function init() {
            showingDal.getShowingStartTime($stateParams.showingId).then(function (result) {
                vm.showing = result;
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();



    };


    // vm.getShowingTime = function (showing) {
    //         $state.go('showing', {'showingId', showingId})
    // }


    angular.module('cinemaApp').controller('getShowingController', ['showingDal', '$stateParams', GetShowingController]);
    angular.module('cinemaApp').controller('ParseVariablesController', ['showingDal', '$stateParams', ParseVariablesController]);
}());