(function () {

    var contactController = function(contactService) {

        var vm = this;

        var emailJson;

        function init() {}

        vm.sendEmail = function(emailToSend) {
            console.log(emailToSend);
            emailJson = emailToSend;
            var emailToJson = JSON.stringify(emailJson);
            console.log(emailToJson);
            contactService.sendEmail(emailToSend);
        }
    };

    angular.module("qaCinema").controller("contact-controller", ["contactService", contactController]);

})();