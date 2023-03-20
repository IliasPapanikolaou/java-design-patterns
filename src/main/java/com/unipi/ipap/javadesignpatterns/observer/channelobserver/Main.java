package com.unipi.ipap.javadesignpatterns.observer.channelobserver;

public class Main {

    public static void main(String[] args) {

        Channel megaChannel = new Channel();

        Subscriber s1 = new Subscriber("John");
        Subscriber s2 = new Subscriber("Maria");
        Subscriber s3 = new Subscriber("Andrea");
        Subscriber s4 = new Subscriber("George");
        Subscriber s5 = new Subscriber("Tommy");

        megaChannel.subscribe(s1);
        megaChannel.subscribe(s2);
        megaChannel.subscribe(s3);
        megaChannel.subscribe(s4);
        megaChannel.subscribe(s5);

        s1.subscribeChannel(megaChannel);
        s2.subscribeChannel(megaChannel);
        s3.subscribeChannel(megaChannel);
        s4.subscribeChannel(megaChannel);
        s5.subscribeChannel(megaChannel);

        megaChannel.upload("How to Learn Programming");

        megaChannel.unSubscribe(s4);
        megaChannel.unSubscribe(s5);

        megaChannel.upload("Learn Springboot");

    }
}
