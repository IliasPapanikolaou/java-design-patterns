package com.unipi.ipap.javadesignpatterns.decorator.window;

public class HorizontalScrollBarDecorator extends WindowDecorator{

    public HorizontalScrollBarDecorator(Window windowToBeDecorated) {
        super(windowToBeDecorated);
    }

    @Override
    public void draw() {
        super.draw();
        drawHorizontalScrollBar();
    }

    private void drawHorizontalScrollBar() {
        System.out.println("Drawing horizontal scrollbar...");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", including horizontal scrollbars";
    }
}
