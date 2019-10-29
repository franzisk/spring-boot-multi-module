package org.thecompany.email.module.app.service;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

	public void sendEmail(final String toAddress) {
		// send email to toAddress
		System.out.println("Email successfully sent");
	}

}