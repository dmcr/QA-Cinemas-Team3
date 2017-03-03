package com.qa.cinema.emails;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class EmailTest {

	static public void email(String name, String email, String phone, String feedback) throws ParseException

	{
		final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String a = sdf.format(date);

		Date datetime = sdf.parse(a);

		String username = "qacinemas3@gmail.com";
		String password = "poiuytrewq123";
		String to = "qacinemas3@gmail.com";
		String email_body = "Date and time of the feedback: " + datetime + "\n" + "Name of the person: " + name + "\n"
				+ "Phone number: " + phone + "\n" + "Email address: " + email + "\n" + "Feedback: " + feedback;
		EmailTest test = new EmailTest();
		test.doSendMail(username, password, to, email_body, datetime);

	}

	public void doSendMail(final String username, final String password, String to, String email_body, Date datetime) {

		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "587");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.port", "587");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setText(email_body);
			message.setSentDate(datetime);
			Transport.send(message);
			System.out.println("message sent");
		} catch (Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null, e.toString());
		}
	}
}