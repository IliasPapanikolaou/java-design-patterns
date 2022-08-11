package com.unipi.ipap.javadesignpatterns.adapter.phoneport;

public class LightningToMicroUsbAdapter implements IMicroUsbPhone {

    private final ILightningPhone lightningPhone;

    public LightningToMicroUsbAdapter(ILightningPhone lightningPhone) {
        this.lightningPhone = lightningPhone;
    }

    @Override
    public String useMicroUsb() {
        lightningPhone.useLightning();
        return "MicroUsb connected";
    }

    @Override
    public String recharge() {
        lightningPhone.recharge();
        return "Recharge started...";
    }
}
