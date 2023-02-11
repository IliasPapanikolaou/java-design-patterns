package com.unipi.ipap.javadesignpatterns.mediator.chat;

public interface ChatMediator {
    void sendMessage(String msg, User user);
    void addUser(User user);
}
