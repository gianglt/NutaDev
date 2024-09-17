package com.devnuta.firstapp;

import org.springframework.stereotype.Component;

@Component
public class SMSService implements MessageService{
    @Override
    public void sendMessage(String message)
    {
        System.out.println("Send SMS: " + message);
    }
}
