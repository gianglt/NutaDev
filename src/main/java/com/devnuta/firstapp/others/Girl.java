package com.devnuta.firstapp.others;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.fasterxml.jackson.databind.ObjectMapper;

@Scope("prototype")
public class Girl {

  @Autowired
  private ObjectMapper objectMapper;

  public void useObjectMapper() {
    // use objectMapper
    System.out.println("objectMapper: " + objectMapper);
  }
  
  public void setObjectMapper(ObjectMapper objectMapper) {
    this.objectMapper = objectMapper;
  }

}
