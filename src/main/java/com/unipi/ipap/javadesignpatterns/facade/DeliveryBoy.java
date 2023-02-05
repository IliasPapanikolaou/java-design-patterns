package com.unipi.ipap.javadesignpatterns.facade;

public class DeliveryBoy {

    public DeliveryBoy() {
    }

    public void pickUpOrder() {
        System.out.println("Delivery Boy picks up the Order");
    }

    public void deliverOrder() {
        System.out.println("Delivery Boy is delivering the Order");
    }
}
