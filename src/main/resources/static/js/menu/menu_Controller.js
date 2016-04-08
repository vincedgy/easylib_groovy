/**
 * Created by Vincent on 21/03/2016.
 */
(function () {
    'use strict';

    angular.module('menu')
        .controller('menuCtrl', MenuCtrl);
    MenuCtrl.$inject = ['menuServices'];
    function MenuCtrl(MenuServices) {
        this.menuitems = MenuServices.get();
    };  


})();