var App = angular.module('App', [ 'ngRoute','ngAnimate', 'ui.bootstrap','ngMessages' ]);

App.config([ '$routeProvider', '$locationProvider',
		function($routeProvider, $locationProvider) {
			$locationProvider.hashPrefix('');
			$routeProvider.when('/registration', {
				templateUrl : 'static/registration.html',
				controller: 'registrationController',
				resolve : {
					preload : function($http) {
						return $http.post('registration/preload').then(function(response) {
							console.log(response);
							return response;
						})
					}
				}
			}).when('/accountoverview', {
				templateUrl : 'static/accountoverview.html'
			}).when('/transfer', {
				templateUrl : 'static/transfer.html',
				controller: 'transferController'
			}).when('/accounthistory', {
				templateUrl : 'static/accounthistory.html',
				controller: 'accountHistoryController'
			}).when('/', {
				templateUrl : 'static/login.html'
			}).when('/login', {
				templateUrl : 'static/login.html'
			}).otherwise({
				redirectTo : '/'
			});

		} ]);