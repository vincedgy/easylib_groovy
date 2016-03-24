/**
 * Created by Vincent on 21/03/2016.
 */
(function() {
    'use strict';

    angular.module('easyLibApp')
        .controller('MenuCtrl', MenuCtrl);

    MenuCtrl.$inject = ['$scope','$http'];
    function MenuCtrl($scope, $http) {

        $http({method:"GET",url:"js/menu.json"}).then(function(result) {
            $scope.menuitems = result.data || [];
        })

    };


})();