package com.unipi.ipap.javadesignpatterns.factory.abstractfactory.os.win;

import com.unipi.ipap.javadesignpatterns.factory.abstractfactory.CheckBox;

public class WinCheckBox implements CheckBox {

    public WinCheckBox() {
    }

    @Override
    public void paint() {
        System.out.println("Win CheckBox");
    }
}
