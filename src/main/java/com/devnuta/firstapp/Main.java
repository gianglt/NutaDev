package com.devnuta.firstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.devnuta.firstapp.others.Girl;

@SpringBootApplication
//@SpringBootApplication(scanBasePackages={"com.devnuta.firstapp.others"})
//@ComponentScan(basePackages = "com.devnuta.firstapp.others")
public class Main {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Main.class, args);
		
		System.out.println("App started");

		// Boy boy = context.getBean(Boy.class);
		// System.out.println("Boy :" + boy);


		Girl girl = context.getBean(Girl.class);
		System.out.println("Girl :" + girl);

		girl.UseGirl();
		
		
	}

}
