package com.devnuta.firstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Main.class, args);
		
		Boy boy1 = context.getBean(Boy.class);
		System.out.println("Boy :" + boy1);

		Boy boy2 = context.getBean(Boy.class);
		System.out.println("Boy :" + boy2);

		//boy.useObjectMapper();
		
	}

}
