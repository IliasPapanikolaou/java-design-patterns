package com.unipi.ipap.javadesignpatterns.adapter.phoneport;

public class AndroidPhone implements IMicroUsbPhone{

    private boolean connector;

    @Override
    public String useMicroUsb() {
        connector = true;
        return "MicroUsb connected";
    }

    @Override
    public String recharge() {
        if (connector) {
            return "Recharge started...";
        } else {
            return "Connect MicroUsb first";
        }
    }
}
