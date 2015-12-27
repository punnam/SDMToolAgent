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
	}).when('/AgentsInfo', {
        controller: 'AgentController',
        templateUrl: 'partials/agentInfos.html',
        controllerAs: 'vm'
    }).otherwise("/404", {
		templateUrl : "partials/404.html",
		controller : "PageCtrl"
	});
} ]);
app.controller('AgentController', [ '$scope', '$http', '$filter',
                             		function($scope, $http, $filter) {
                             			$http.get("rest/getAllAgentsInfos/").success(function(response) {
                             				$scope.allEnvs = response.data;
                             			});
                             			var clearFields = function() {
                             				$scope.name = "";
                             				$scope.id = "";
                             				$scope.hostName = "";
                             				$scope.modifyEnv = false;
                             			}
                             			$scope.deleteEnvInfo = function(envObj) {
                             				$http({
                             					data : envObj,
                             					method : 'POST',
                             					url : 'rest/deleteEnv/'
                             				}).then(function successCallback(response) {
                             					// this callback will be called asynchronously
                             					// when the response is available
                             					//$scope.allEnvs = $filter('filter')($scope.allEnvs, {id:envObj.id});
                             					$scope.reloadAllEnvInfo();
                             					clearFields();
                             				}, function errorCallback(response) {
                             					// called asynchronously if an error occurs
                             					// or server returns response with an error status.
                             				});
                             			};
                             			$scope.modifyEnvInfo = function(envObj) {
                             				$scope.name = envObj.name;
                             				$scope.id = envObj.id;
                             				$scope.hostName = envObj.hostName;
                             			};
                             			$scope.reloadAllEnvInfo = function() {
                             				$http.get("rest/getAllenvs/").success(function(response) {
                             					$scope.allEnvs = response.data;
                             				});
                             			};
                             			$scope.addEnvInfo = function() {
                             				var dataObj = {
                             						sdmToolServerUrl : $scope.serverUrl
                             				};

                             				$http({
                             					data : dataObj,
                             					method : 'POST',
                             					url : 'rest/setSDMToolServerUrl/'
                             				}).then(function successCallback(response) {
                             					$scope.reloadAllEnvInfo();
                             					clearFields();
                             				}, function errorCallback(response) {
                             					// called asynchronously if an error occurs
                             					// or server returns response with an error status.
                             				});
                             			}
                             		} ]);
app.controller('homeCtrl', [ '$scope', '$http', '$filter',
                       		function($scope, $http, $filter) {
                       			$http.get("rest/getAgentInfo/").success(function(response) {
                       				
                       				$scope.agentInfo = response.data;
                       			});

                       		} ]);