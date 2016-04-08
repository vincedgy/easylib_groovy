/**
 * Created by Vincent on 21/03/2016.
 */
(function () {
    'use strict';

    angular.module('parameterList')
        .controller('parameterListCtrl', ParameterListCtrl);
    ParameterListCtrl.$inject = ['parameterListServices'];
    function ParameterListCtrl(ParamHeaderService) {
        this.selectedParamHeader = {};
        this.paramHeaders = ParamHeaderService.getHeaders();
        this.getParameter = function (selectedParamHeader) {
            this.selectedParamHeader = ParamHeaderService.getHeaderById(selectedParamHeader.id.paramId);
        }

    };


})();