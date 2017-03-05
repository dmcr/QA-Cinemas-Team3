(function() {

    var contactDal = function(dal) {

        this.sendEmail = function(emailToSend) {
            return dal.http.POST("rest/json/contact");
        }
    }

    angular.module("qaCinema").service("contactDal", ["dal", contactDal]);
})();