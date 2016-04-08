/**
 * Created by Vincent on 21/03/2016.
 */
(function() {
    'use strict';
    angular.module('parameterList')
        .directive('parameterList', function() {
        return {
            scope: {},
            templateUrl : "js/parameterList/parameterList_Template.html",
            controller : "parameterListCtrl",
            controllerAs : "paramList",
            bindToController : {
                visible : "="
            }
        }

    });


})();