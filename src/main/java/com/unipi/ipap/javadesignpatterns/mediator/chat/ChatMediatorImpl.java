package com.unipi.ipap.javadesignpatterns.mediator.chat;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

    private final List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        users.forEach(usr -> {
            if (usr != user) {
                usr.receive(msg);
            }
        });
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
