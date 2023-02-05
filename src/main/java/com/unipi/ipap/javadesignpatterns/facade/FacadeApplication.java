package com.unipi.ipap.javadesignpatterns.facade;

public class FacadeApplication {

    public static void main(String[] args) {
        DeliveryOperationFacade deliveryOperationFacade =
                new DeliveryOperationFacade(new Restaurant(), new DeliveryTeam(), new DeliveryBoy());

        deliveryOperationFacade.placeOrder();
    }
}
