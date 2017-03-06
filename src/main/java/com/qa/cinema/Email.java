package com.qa.cinema;

import java.util.Date;

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
        String subjectBody = "Concerning : " + subject + " \n \n ";
        String messageBody = "Message : " + message + " \n \n";

        emailBody = emailBody + head + subjectBody + messageBody;
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


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}