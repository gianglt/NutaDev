package com.devnuta.firstapp;

public class Client {

    private MessageService messageService;

    public Client(MessageService messageService)
    {
        this.messageService = messageService;
    }

    public void processMessage(String message)
    {
        messageService.sendMessage(message);
    }
}
