package com.unipi.ipap.javadesignpatterns.adapter.phoneport;

public class Iphone implements ILightningPhone{

    private boolean connector;

    @Override
    public String useLightning() {
        connector = true;
        return "Lightning connected";
    }

    @Override
    public String recharge() {
        if (connector) {
            return "Recharge started...";
        } else {
            return "Connect Lightning first";
        }
    }

}
