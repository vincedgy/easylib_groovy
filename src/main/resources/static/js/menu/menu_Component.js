/**
 * Created by Vincent on 21/03/2016.
 */
(function() {
    'use strict';

    var menuComponent = angular.module('menuCompent', []);

    menuComponent.service('menuServices', MenuServices);
    MenuServices.$inject = ['$resource'];
    function MenuServices($resource) {
        var resources = $resource('js/menu/menu.json');
        this.get = function() {
            return resources.query();
        };

    };

    menuComponent.controller('menuCtrl', MenuCtrl);
    MenuCtrl.$inject = ['menuServices'];
    function MenuCtrl(MenuServices) {
        this.menuitems = MenuServices.get();
    };

    menuComponent.component('menuBar', {
                scope: {},
                templateUrl : "js/menu/menu_Template.html",
                controller : "menuCtrl",
                controllerAs : "menuCtrl"
        });

})();