package com.unipi.ipap.javadesignpatterns.adapter;

import com.unipi.ipap.javadesignpatterns.adapter.phoneport.AndroidPhone;
import com.unipi.ipap.javadesignpatterns.adapter.phoneport.ChargePhone;
import com.unipi.ipap.javadesignpatterns.adapter.phoneport.Iphone;
import com.unipi.ipap.javadesignpatterns.adapter.phoneport.LightningToMicroUsbAdapter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhonePortTest {

    private static final String RESULT = "Recharge started...";

    @Test
    void testPhonePortConnections() {

        AndroidPhone androidPhone = new AndroidPhone();
        Iphone iphone = new Iphone();

        System.out.println("Recharging Android Phone with Micro USB");
        String s1 = ChargePhone.rechargeMicroUsbPhone(androidPhone);

        System.out.println("Recharging iPhone with Lightning");
        String s2 = ChargePhone.rechargeLightningPhone(iphone);

        System.out.println("Recharging iPhone with MicroUsb");
        String s3 = ChargePhone.rechargeMicroUsbPhone(new LightningToMicroUsbAdapter(iphone));

        assertAll(
                () -> assertEquals(RESULT, s1),
                () -> assertEquals(RESULT, s2),
                () -> assertEquals(RESULT, s3)
        );
    }
}
