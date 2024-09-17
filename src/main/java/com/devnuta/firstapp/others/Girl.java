package com.devnuta.firstapp.others;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.devnuta.firstapp.Boy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("prototype")
public class Girl {

  @Autowired
  private  Boy boy;

  public Girl() {
    System.out.println("Girl is created ");
  }
  
  @PostConstruct
  public void HelloGirl() {
    System.out.println("Hello Girl ! ");
  }

  @PreDestroy
  public void ByeGirl() {
    System.out.println("Bye Girl ! ");
  }

  public void UseGirl() {
    System.out.println("Use Girl ! ");
  }


}
