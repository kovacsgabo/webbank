App.controller('registrationController', [ '$scope', 'preload',
		function($scope, preload) {
			$scope.registration = {
				"user" : {},
				"regsiter" : []
			};
			$scope.preload = preload.data.regsiterList;

			$scope.addItem = function(item) {
				$scope.registration.regsiter.push(item);
				$scope.register = null;
			}
			$scope.removeItem = function(index) {
				$scope.registration.regsiter.splice(index, 1);
			}
		} ]);