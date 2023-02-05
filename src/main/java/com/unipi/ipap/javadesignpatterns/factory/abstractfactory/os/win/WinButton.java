package com.unipi.ipap.javadesignpatterns.factory.abstractfactory.os.win;

import com.unipi.ipap.javadesignpatterns.factory.abstractfactory.Button;

public class WinButton implements Button {

    public WinButton() {
    }

    @Override
    public void paint() {
        System.out.println("Win Button");
    }
}
