package com.devnuta.firstapp;

public class EmailService implements MessageService{
    public void sendMessage(String message) {
        System.out.println("Send email: " + message);
    }
}
