/**
 * Created by Vincent on 21/03/2016.
 */
(function() {
    'use strict';

    angular.module('easyLibApp')
        .controller('rootCtrl', RootCtrl);

    RootCtrl.$inject = ['$rootScope','$location', '$window'];
    function RootCtrl($rootScope, $location, $window) {
        $rootScope.detailsAreVisible=true;
        $rootScope.location=$location;
        $rootScope.windowHref = $window.location.href;

    };


})();