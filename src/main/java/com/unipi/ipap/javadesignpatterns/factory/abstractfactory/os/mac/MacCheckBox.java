package com.unipi.ipap.javadesignpatterns.factory.abstractfactory.os.mac;

import com.unipi.ipap.javadesignpatterns.factory.abstractfactory.CheckBox;

public class MacCheckBox implements CheckBox {

    public MacCheckBox() {
    }

    @Override
    public void paint() {
        System.out.println("Mac CheckBox");
    }
}
