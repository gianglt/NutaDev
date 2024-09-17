package com.devnuta.firstapp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("prototype")
public class Boy {

  public Boy() {
    System.out.println("Boy is initiated ");
  }
  
  @PostConstruct
  public void HelloBoy() {
    System.out.println("Hello Boy ! ");
  }

  @PreDestroy
  public void ByeBoy() {
    System.out.println("Bye Boy ! ");
  }

  public void UseBoy() {
    System.out.println("Use Boy ! ");
  }


}
