/**
 * Created by Vincent on 21/03/2016.
 */
(function() {
    'use strict';

    angular.module('menu')
        .service('menuServices', MenuServices);
    MenuServices.$inject = ['$resource'];
    function MenuServices($resource) {
        var resources = $resource('js/menu/menu.json');
        this.get = function() {
            return resources.query();
        };

    };
})();