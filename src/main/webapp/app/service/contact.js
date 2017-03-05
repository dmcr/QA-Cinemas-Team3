(function () {


    var contactService = function(contactDal) {

        this.sendEmail = function(emailToSend) {
            return contactDal.sendEmail(emailToSend);
        }
    };

    angular.module("qaCinema").service("contactService", ["contactDal", contactService]);


})();