/**
 * Created by Vincent on 21/03/2016.
 */
(function() {
    'use strict';

    var module = angular.module('easyLibParamHeader', ['ngResource']);

    module.service('ParamHeaderService', ParamHeaderService);
    ParamHeaderService.$inject = ['$resource'];
    function ParamHeaderService($resource) {
        var resources = $resource('/paramHeaders/:paramId');

        this.getHeaders = function() {
            return resources.query();
        };

        this.getHeaderById = function(id) {
            return resources.get({paramId:id});
        }

    };

    module.controller('ParamHeaderCtrl', ParamHeaderCtrl);
    ParamHeaderCtrl.$inject = ['$scope', 'ParamHeaderService'];
    function ParamHeaderCtrl($scope, ParamHeaderService) {

        $scope.selectedParamHeader = {};

        $scope.paramHeaders = ParamHeaderService.getHeaders();

        $scope.getParameter = function(selectedParamHeader) {
            $scope.selectedParamHeader = ParamHeaderService.getHeaderById(selectedParamHeader.id.paramId);
        }

    };



})();