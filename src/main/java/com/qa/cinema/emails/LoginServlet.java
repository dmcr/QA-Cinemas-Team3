package com.qa.cinema.emails;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String feedback = request.getParameter("feedback");

		PrintWriter writer = response.getWriter();
		try {
			EmailTest.email(name, email, phone, feedback);
		} catch (ParseException e) {

			e.printStackTrace();
		}
		
		String htmlRespone = "<html>";
		htmlRespone += "<h2>Thank you for the feedback! </h2>";
		htmlRespone += "</html>";

		writer.println(htmlRespone);

	}

}