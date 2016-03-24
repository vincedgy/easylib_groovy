/**
 * Created by Vincent on 21/03/2016.
 */
(function() {
    'use strict';

    angular.module('easyLibApp').config(function($stateProvider, $urlRouterProvider) {
        $urlRouterProvider.otherwise("/home");

        $stateProvider
            .state('home', {
                url: "/",
                templateUrl: "partials/home.html"
            })
            .state('parameters', {
                url: "/parameters",
                templateUrl: "partials/paramHeaders.html",
                controller : "ParamHeaderCtrl"
            })
            .state('state2', {
                url: "/state2",
                templateUrl: "partials/state2.html",
                controller : "ParamHeaderCtrl"
            })
        ;

    });

})();