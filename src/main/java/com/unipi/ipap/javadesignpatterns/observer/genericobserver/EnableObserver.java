package com.unipi.ipap.javadesignpatterns.observer.genericobserver;

public class EnableObserver {

    public static void start() {

        System.out.println("Enter Text: ");
        EventSource eventSource = new EventSource();
        eventSource.addObserver(event -> {
            System.out.println("Received response: " + event);
        });

        eventSource.scanSystemIn();
    }
}
