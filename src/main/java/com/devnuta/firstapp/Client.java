package com.devnuta.firstapp;


public class Client implements InjectionMessage{

    private MessageService messageService;

    // public Client(MessageService messageService)
    // {
    //     this.messageService = messageService;
    // }

    // public void setMessageService(MessageService messageService)
    // {
    //     this.messageService = messageService;
    // }

    @Override
    public void setService(MessageService messageService)
    {

        this.messageService = messageService;
    }

    public void processMessage(String message)
    {
        messageService.sendMessage(message);
    }
}
