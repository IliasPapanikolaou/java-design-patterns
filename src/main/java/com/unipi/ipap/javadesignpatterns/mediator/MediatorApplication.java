package com.unipi.ipap.javadesignpatterns.mediator;

import com.unipi.ipap.javadesignpatterns.mediator.chat.ChatMediator;
import com.unipi.ipap.javadesignpatterns.mediator.chat.ChatMediatorImpl;
import com.unipi.ipap.javadesignpatterns.mediator.chat.User;
import com.unipi.ipap.javadesignpatterns.mediator.chat.UserImpl;

public class MediatorApplication {

    public static void main(String[] args) {
        // Chat mediator
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "John");
        User user2 = new UserImpl(mediator, "Maria");
        User user3 = new UserImpl(mediator, "Jack");
        User user4 = new UserImpl(mediator, "Dennis");
        User user5 = new UserImpl(mediator, "Suzan");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        mediator.addUser(user5);

        user1.send("Hello guys!");
    }
}
