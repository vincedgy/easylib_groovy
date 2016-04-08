/**
 * Created by Vincent on 21/03/2016.
 */
(function() {
    'use strict';
    angular.module('menu')
        .directive('menuBar', function() {
        return {
            scope: {},
            templateUrl : "js/menu/menu_Template.html",
            controller : "menuCtrl",
            controllerAs : "menuCtrl"
        }

    });


})();