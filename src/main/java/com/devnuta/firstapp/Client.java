package com.devnuta.firstapp;

public class Client {
    private EmailService messageService = new EmailService();

    public void processMessage(String message)
    {
        messageService.sendMessage(message);
    }
}
