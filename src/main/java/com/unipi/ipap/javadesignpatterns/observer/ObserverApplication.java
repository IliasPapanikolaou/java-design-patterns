package com.unipi.ipap.javadesignpatterns.observer;

import com.unipi.ipap.javadesignpatterns.observer.genericobserver.EnableObserver;

public class ObserverApplication {

    public static void main(String[] args) {
        // Adapter Car Speed
        System.out.println("\n----Observer Design Pattern----");
        EnableObserver.start();
    }
}
