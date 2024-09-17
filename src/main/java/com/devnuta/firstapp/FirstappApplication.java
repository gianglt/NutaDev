package com.devnuta.firstapp;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstappApplication {

	public static void main(String[] args) {

		//SpringApplication.run(FirstappApplication.class, args);

		EmailService emailService = new EmailService();
		SMSService smsService = new SMSService();

		Client client = new Client();
		client.setService(smsService);
		//client.setMessageService(smsService);
		client.processMessage("Hello world !");
	}

}
