package com.unipi.ipap.javadesignpatterns.adapter;

import com.unipi.ipap.javadesignpatterns.adapter.phoneport.AndroidPhone;
import com.unipi.ipap.javadesignpatterns.adapter.phoneport.ChargePhone;
import com.unipi.ipap.javadesignpatterns.adapter.phoneport.Iphone;
import com.unipi.ipap.javadesignpatterns.adapter.phoneport.LightningToMicroUsbAdapter;
import org.junit.jupiter.api.Test;

public class PhonePortTest {

    @Test
    void testPhonePortConnections() {

        AndroidPhone androidPhone = new AndroidPhone();
        Iphone iphone = new Iphone();

        System.out.println("Recharging Android Phone with Micro USB");
        ChargePhone.rechargeMicroUsbPhone(androidPhone);

        System.out.println("Recharging iPhone with Lightning");
        ChargePhone.rechargeLightningPhone(iphone);

        System.out.println("Recharging iPhone with MicroUsb");
        ChargePhone.rechargeMicroUsbPhone(new LightningToMicroUsbAdapter(iphone));
    }
}
