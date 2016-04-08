/**
 * Created by Vincent on 21/03/2016.
 */
(function() {
    'use strict';

    angular.module('parameterList')
        .service('parameterListServices', ParameterListService);
    ParameterListService.$inject = ['$resource'];
    function ParameterListService($resource) {
        var resources = $resource('/paramHeaders/:paramId');

        this.getHeaders = function() {
            return resources.query();
        };

        this.getHeaderById = function(id) {
            return resources.get({paramId:id});
        }

    };
})();