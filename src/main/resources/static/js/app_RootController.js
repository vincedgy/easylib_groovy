/**
 * Created by Vincent on 21/03/2016.
 */
(function() {
    'use strict';

    angular.module('easyLibApp')
        .controller('rootCtrl', RootCtrl);

    RootCtrl.$inject = ['$rootScope'];
    function RootCtrl($rootScope) {
        $rootScope.detailsAreVisible=true;
    };


})();