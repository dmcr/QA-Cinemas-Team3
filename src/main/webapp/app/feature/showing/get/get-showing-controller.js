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

    // function UserCtrl($stateParams) {
    //     conrole.log($stateParams)
    //     <>
    // }
    // $state.go('users', {obj:startTime})




    // vm.getShowingTime = function (showing) {
    //         $state.go('showing', {'showingId', showingId})
    // }
    angular.module('cinemaApp').controller('getShowingController', ['showingDal', '$stateParams', GetShowingController]);
}());