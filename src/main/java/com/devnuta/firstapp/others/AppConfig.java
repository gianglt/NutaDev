package com.devnuta.firstapp.others;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.devnuta.firstapp.Boy;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration  
public class AppConfig {

  @Bean
  
  public Boy  boy() {
    return new Boy();
  }

  @Bean

  public Girl  girl() {
    return new Girl();
  }

  @Bean
  public ObjectMapper objectMapper() {
    return new ObjectMapper();
  }


}
