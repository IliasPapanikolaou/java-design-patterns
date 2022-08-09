package com.unipi.ipap.javadesignpatterns.decorator.window;

abstract class WindowDecorator implements Window {

    private final Window windowToBeDecorated; // The windows being decorated

    public WindowDecorator(Window windowToBeDecorated) {
        this.windowToBeDecorated = windowToBeDecorated;
    }

    @Override
    public void draw() {
        windowToBeDecorated.draw(); // Delegation
    }

    @Override
    public String getDescription() {
        return windowToBeDecorated.getDescription(); // Delegation
    }
}
