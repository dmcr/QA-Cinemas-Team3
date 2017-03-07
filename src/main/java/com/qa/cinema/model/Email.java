package com.qa.cinema.model;

import java.util.Date;

public class Email {

    private String name;
    private String email;
    private String subject;
    private StringBuilder message;

    public Email(String name, String email, String subject, String message) {
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.message = new StringBuilder();
        createEmail();
    }

    
	private void createEmail() {
    	String head = "<b>From: </b>" + name + " \t \t <b>Email Address: </b>" + email + " \n";
        String subjectBody = "<b>Concerning : </b>" + subject + " \n \n ";
        String messageBody = "<b>Message : </b>" + message + " \n \n";

        this.message.append(head + subjectBody + messageBody);
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

    public StringBuilder getMessage() {
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

    public void setMessage(StringBuilder message) {
        this.message = message;
    }

}