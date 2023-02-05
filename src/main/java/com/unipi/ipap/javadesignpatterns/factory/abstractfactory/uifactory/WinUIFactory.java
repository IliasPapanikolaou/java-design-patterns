package com.unipi.ipap.javadesignpatterns.factory.abstractfactory.uifactory;

import com.unipi.ipap.javadesignpatterns.factory.abstractfactory.Button;
import com.unipi.ipap.javadesignpatterns.factory.abstractfactory.CheckBox;
import com.unipi.ipap.javadesignpatterns.factory.abstractfactory.os.win.WinButton;
import com.unipi.ipap.javadesignpatterns.factory.abstractfactory.os.win.WinCheckBox;

public class WinUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WinCheckBox();
    }
}
