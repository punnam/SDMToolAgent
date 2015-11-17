/**
 * AngularJS Tutorial 1
 * @author Nick Kaye <nick.c.kaye@gmail.com>
 */

/**
 * Main AngularJS Web Application
 */
var app = angular.module('app', [ 'ngRoute' ]);

/**
 * Configure the Routes
 */
app.config([ '$routeProvider', '$locationProvider', function($routeProvider,$locationProvider) {
	$routeProvider
	// Home
	.when("/", {
		templateUrl : "partials/home.html",
		controller : "homeCtrl"
	}).otherwise("/404", {
		templateUrl : "partials/404.html",
		controller : "PageCtrl"
	});
} ]);

app.controller('homeCtrl', [ '$scope', '$http', '$filter',
                       		function($scope, $http, $filter) {
                       	alert("Punnam");
                       			$http.get("rest/getAgentInfo/").success(function(response) {
                       				
                       				$scope.agentInfo = response.data;
                       			});

                       		} ]);