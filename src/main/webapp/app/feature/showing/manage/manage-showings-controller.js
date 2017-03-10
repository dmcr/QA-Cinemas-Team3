(function () {
    var ManageShowingsController = function (showingDal, $state) {
        var vm = this;

        function init() {
            showingDal.getShowings().then(function (results) {
                vm.showings = results;
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
        
        vm.updateShowing = function(showingToUpdateId) {
                $state.go('cms.manageshowings.updateshowing', {'showingId' : showingToUpdateId}); 
        };
        
        vm.addShowing = function() {
        	$state.go('cms.manageshowings.newshowing');
        };
        
        vm.deleteShowing = function(showingToDeleteID) {
            showingDal.deleteShowing(showingToDeleteID);
            $state.go($state.current, {}, {reload: true});
        };
    };
    angular.module('cinemaApp').controller('manageShowingsController', ['showingDal', '$state', ManageShowingsController]);
}());