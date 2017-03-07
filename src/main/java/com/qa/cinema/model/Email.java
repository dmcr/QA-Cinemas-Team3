package com.qa.cinema.model;


public class Email {

    private String name;
    private String email;
    private String messageSubject;
    private StringBuilder messageBody;

    public Email() {}
    
    public Email(String name, String email, String messageSubject, String messageBody) {
        this.name = name;
        this.email = email;
        this.messageSubject = messageSubject;
        this.messageBody = new StringBuilder();
        createEmail();
    }

    
	private void createEmail() {
    	String head = "<b>From: </b>" + name + " \t \t <b>Email Address: </b>" + email + " \n";
        String subjectBody = "<b>Concerning : </b>" + messageSubject + " \n \n ";
        String message = "<b>Message : </b>" + messageBody + " \n \n";

        this.messageBody.append(head + subjectBody + message);
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSubject() {
        return messageSubject;
    }

    public StringBuilder getMessage() {
        return messageBody;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSubject(String messageSubject) {
        this.messageSubject = messageSubject;
    }

    public void setMessage(StringBuilder messageBody) {
        this.messageBody = messageBody;
    }

}