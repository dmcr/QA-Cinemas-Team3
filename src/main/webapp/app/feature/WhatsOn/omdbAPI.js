'use strict';

angular.module('myApp', [])
    .controller('MovieController', function ($scope, $http) {
        $scope.$watch('search', function () {
            fetch();
        });

        $scope.search = "logan";

        function fetch() {
            $http.get("http://www.omdbapi.com/?t=" + $scope.search + "&tomatoes=true&plot=full")
                .then(function (response) {
                    $scope.details = response.data;
                });
        }

    });

