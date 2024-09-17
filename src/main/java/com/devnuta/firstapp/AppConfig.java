package com.devnuta.firstapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration  
public class AppConfig {

  @Bean
  @Scope("prototype")
  public Boy  boy() {
    return new Boy();
  }

  @Bean
  public ObjectMapper objectMapper() {
    return new ObjectMapper();
  }


}
