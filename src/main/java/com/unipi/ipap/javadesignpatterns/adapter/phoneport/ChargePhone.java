package com.unipi.ipap.javadesignpatterns.adapter.phoneport;

public class ChargePhone {

    public static String rechargeMicroUsbPhone(IMicroUsbPhone phone) {
        System.out.println(phone.useMicroUsb());
        return phone.recharge();
    }

    public static String rechargeLightningPhone(ILightningPhone phone) {
        System.out.println(phone.useLightning());
        return phone.recharge();
    }

}
