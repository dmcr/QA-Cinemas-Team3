package com.qa.cinema;

public class Email {

    private String name;
    private String email;
    private String subject;
    private String message;

    public Email() {};

    public Email(String name, String email, String subject, String message) {
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.message = message;
        createEmail();
    }

    private void createEmail() {
        String emailBody = "";

        String head = "From: " + name + " Email Address: " + email + " \n";
        String subject = "Concerning : " + subject + " \n \n "
        String message = "Message : " + message + " \n \n";

        emailBody = emailBody + head + subject + message;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }


    public String setName(String name) {
        this.name = name;
    }

    public String setEmail(String email) {
        this.email = email;
    }

    public String setSubject(String subject) {
        this.subject = subject;
    }

    public String setMessage(String message) {
        this.message = message;
    }
}