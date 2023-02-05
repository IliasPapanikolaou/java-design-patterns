package com.unipi.ipap.javadesignpatterns.factory.abstractfactory.os.mac;

import com.unipi.ipap.javadesignpatterns.factory.abstractfactory.Button;

public class MacButton implements Button {

    public MacButton() {
    }

    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}
