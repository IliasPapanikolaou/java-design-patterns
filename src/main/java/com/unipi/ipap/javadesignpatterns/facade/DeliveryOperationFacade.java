package com.unipi.ipap.javadesignpatterns.facade;

public class DeliveryOperationFacade {

    private final Restaurant restaurant;
    private final DeliveryTeam deliveryTeam;
    private final DeliveryBoy deliveryBoy;

    public DeliveryOperationFacade(Restaurant restaurant, DeliveryTeam deliveryTeam, DeliveryBoy deliveryBoy) {
        this.restaurant = restaurant;
        this.deliveryTeam = deliveryTeam;
        this.deliveryBoy = deliveryBoy;
    }

    public void placeOrder() {
        restaurant.prepareOrder();
        deliveryTeam.assignDeliveryBoy();
        deliveryBoy.pickUpOrder();
        deliveryBoy.deliverOrder();
    }
}
