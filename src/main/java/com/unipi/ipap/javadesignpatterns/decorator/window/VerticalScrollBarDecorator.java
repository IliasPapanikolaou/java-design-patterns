package com.unipi.ipap.javadesignpatterns.decorator.window;

// The first concrete decorator which adds vertical scrollbar functionality
public class VerticalScrollBarDecorator extends WindowDecorator {

    public VerticalScrollBarDecorator(Window windowToBeDecorated) {
        super(windowToBeDecorated);
    }

    @Override
    public void draw() {
        super.draw();
        drawVerticalScrollBar();
    }

    private void drawVerticalScrollBar() {
        System.out.println("Drawing vertical scrollbar...");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", including vertical scrollbars";
    }
}
