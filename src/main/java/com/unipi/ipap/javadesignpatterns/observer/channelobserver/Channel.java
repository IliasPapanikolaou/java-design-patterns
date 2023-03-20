package com.unipi.ipap.javadesignpatterns.observer.channelobserver;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private String title;
    private final List<Subscriber> subscribers = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unSubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    private void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update();
        }
    }

    public void upload(String title) {
        this.title = title;
        notifySubscribers();
    }
}
