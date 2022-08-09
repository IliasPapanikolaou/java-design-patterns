package com.unipi.ipap.javadesignpatterns.decorator.window;

// Implementation of a simple Window without any scrollbars
public class SimpleWindow implements Window {
    @Override
    public void draw() {
        System.out.println("Drawing a window...");
    }

    @Override
    public String getDescription() {
        return "Simple Window";
    }
}
