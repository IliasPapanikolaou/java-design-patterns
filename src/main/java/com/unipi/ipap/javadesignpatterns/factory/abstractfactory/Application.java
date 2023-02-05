package com.unipi.ipap.javadesignpatterns.factory.abstractfactory;

import com.unipi.ipap.javadesignpatterns.factory.abstractfactory.uifactory.UIFactory;

public class Application {

    private final Button button;
    private final CheckBox checkbox;

    public Application(UIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
