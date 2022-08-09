package com.unipi.ipap.javadesignpatterns.decorator;

import com.unipi.ipap.javadesignpatterns.decorator.window.HorizontalScrollBarDecorator;
import com.unipi.ipap.javadesignpatterns.decorator.window.SimpleWindow;
import com.unipi.ipap.javadesignpatterns.decorator.window.VerticalScrollBarDecorator;
import com.unipi.ipap.javadesignpatterns.decorator.window.Window;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WindowDecoratorTest {

    private static final String RESULT_TEXT =
            "Simple Window, including vertical scrollbars, including horizontal scrollbars";

    @Test
    public void testWindowDecorator() {
        Window decoratedWindow = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(new SimpleWindow()));
        assertEquals(RESULT_TEXT, decoratedWindow.getDescription());
    }
}
