package com.devnuta.firstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Main.class, args);

		Client client = context.getBean(Client.class);
		client.processMessage("Hello world !");
		
	}

}
