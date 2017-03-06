package com.qa.cinema.service;


import java.util.Properties;

import javax.inject.Inject;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.qa.cinema.Email;
import com.qa.cinema.util.JSONUtil;


public class ContactService {

    @Inject
    JSONUtil util;
    
    public String sendEmail(String messageSend) {
    	
    	Email formEmailSend = util.getObjectForJSON(messageSend, Email.class);
    	
    	String username = "qacinemas3@gmail.com";
    	String password = "poiuytrewq123";
    	String to = "qacinemas3@gmail.com";
    	
    	Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "587");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.port", "587");
		
		
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
			
		});
		
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setText(formEmailSend.getMessage());
			Transport.send(message);
			System.out.println("message sent");
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		
		
		return "Thank you for your email";
    }
}