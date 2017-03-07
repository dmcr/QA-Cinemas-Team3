'use strict';

angular.module('myApp', [])
  .controller('MovieController', function($scope, $http){
    $scope.$watch('search', function() {
      fetch();
    });

    $scope.search = "Sherlock Holmes";

    function fetch(){
      $http.get("http://www.omdbapi.com/?t=" + $scope.search + "&tomatoes=true&plot=full")
      .then(function(response){ $scope.details = response.data; });

      $http.get("http://www.omdbapi.com/?s=" + $scope.search)
      .then(function(response){ $scope.related = response.data; });
    }
  });
