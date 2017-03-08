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

// var GetShowingTimeController = function (showingDal, $stateParams) {
//     var vm = this;
//
//    app.controler('getShowingController', function Parsevariables($scope) {
//         showingDal.getShowingStartTime($stateParams.showingId).then(function (result) {
//             vm.showing = result;
//         }, function(error) {
//             vm.error = true;
//             vm.errorMessage = error;
//         });
//     })
//
// }



    angular.module('cinemaApp').controller('getShowingController', ['showingDal', '$stateParams', GetShowingController]);
    angular.module('cinemaApp').controller('GetShowingTimeController', ['showingDal', '$stateParams', GetShowingTimeController]);
}());