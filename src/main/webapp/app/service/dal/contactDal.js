(function() {

    angular.module("qaCinema").service("contactDal", ["dal", contactDal]);

    var contactDal = function(dal) {

        this.sendEmail = function(emailToSend) {
            return dal.http.POST("rest/json/contact");
        }
    }

})();