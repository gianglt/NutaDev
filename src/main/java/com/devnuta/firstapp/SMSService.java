package com.devnuta.firstapp;


public class SMSService implements MessageService{
    @Override
    public void sendMessage(String message)
    {
        System.out.println("Send SMS: " + message);
    }
}
