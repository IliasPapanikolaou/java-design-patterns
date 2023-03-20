package com.unipi.ipap.javadesignpatterns.observer.channelobserver;

public class Subscriber {

    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    public void update() {
        System.out.println("Hello " + name + ", new video uploaded: " + channel.getTitle());
    }

    public void subscribeChannel(Channel channel) {
        this.channel = channel;
    }
}
