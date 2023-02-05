package com.unipi.ipap.javadesignpatterns.factory.abstractfactory.uifactory;

import com.unipi.ipap.javadesignpatterns.factory.abstractfactory.Button;
import com.unipi.ipap.javadesignpatterns.factory.abstractfactory.CheckBox;

import java.awt.*;

public interface UIFactory {
    Button createButton();
    CheckBox createCheckbox();
}
