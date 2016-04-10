/**
 * Created by Vincent on 21/03/2016.
 */
(function() {
    'use strict';

    angular.module('easyLibApp').config(function($stateProvider, $urlRouterProvider, $locationProvider) {
        $locationProvider.html5Mode(true).hashPrefix('!');
        
        $urlRouterProvider.otherwise("/");

        $stateProvider
            .state('home', {
                url: "/",
                templateUrl: "partials/home.html"
            })
            .state('parameters', {
                url: "/parameters",
                templateUrl: "partials/parameterList.html"
            })
            .state('state2', {
                url: "/state2",
                templateUrl: "partials/state2.html",
                controller : "parameterListCtrl"
            })
        ;

    });

})();