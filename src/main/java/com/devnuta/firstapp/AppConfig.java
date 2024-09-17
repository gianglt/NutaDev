package com.devnuta.firstapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration

public class AppConfig {


  @Bean
  @Primary
  public EmailService emailService() {
    return new EmailService();
  }

  @Bean 
  public SMSService smsService() {
    return new SMSService();
  }



}
