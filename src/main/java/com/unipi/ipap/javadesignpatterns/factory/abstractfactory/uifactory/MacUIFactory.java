package com.unipi.ipap.javadesignpatterns.factory.abstractfactory.uifactory;

import com.unipi.ipap.javadesignpatterns.factory.abstractfactory.Button;
import com.unipi.ipap.javadesignpatterns.factory.abstractfactory.CheckBox;
import com.unipi.ipap.javadesignpatterns.factory.abstractfactory.os.mac.MacButton;
import com.unipi.ipap.javadesignpatterns.factory.abstractfactory.os.mac.MacCheckBox;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacCheckBox();
    }
}
