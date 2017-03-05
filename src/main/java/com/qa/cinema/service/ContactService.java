package com.qa.cinema.service;

import java.util.Properties;

import javax.inject.Inject;
import javax.mail.*;

import com.qa.cinema.Email;
import com.qa.cinema.util.JSONUtil;

public class ContactService {

    @Inject
    JSONUtil util;

    public String getName() {
        return "";
    }

    public String getEmail() {
        return "";
    }

    public String getSubject() {
        return "";
    }

    public String getMessage() {
        return "";
    }


    public String sendEmail(String email) {

        Email email = util.getObjectForJSON(email, Email.class);

        String username = "qacinemas3@gmail.com";
        String password = " ";
        String emailToSendTo = "qacinemas3@gmail.com";
        String subject = "";

        Properties properties = new Properties();

        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.port", "465");

        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });


        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailToSendTo));
            message.setSubject(emailToSend.getSubject());
            message.setText(emailToSend.getMessage().toString());
            Transport.send(message);
            System.out.println("Message sent");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }


        return "{\" message \" : \" Thank you for your email. We aim to respond within 48 hours \"}";
    }
}