package com.unipi.ipap.javadesignpatterns.decorator;

import com.unipi.ipap.javadesignpatterns.decorator.coffee.Coffee;
import com.unipi.ipap.javadesignpatterns.decorator.coffee.SimpleCoffee;
import com.unipi.ipap.javadesignpatterns.decorator.coffee.WithMilk;
import com.unipi.ipap.javadesignpatterns.decorator.coffee.WithSprinkles;
import com.unipi.ipap.javadesignpatterns.decorator.window.HorizontalScrollBarDecorator;
import com.unipi.ipap.javadesignpatterns.decorator.window.SimpleWindow;
import com.unipi.ipap.javadesignpatterns.decorator.window.VerticalScrollBarDecorator;
import com.unipi.ipap.javadesignpatterns.decorator.window.Window;

public class DecoratorApplication {

    public static void main(String[] args) {

        // Decorator Window Demo
        System.out.println("\n---Decorator Design Pattern---");
        // Create a decorated Window with horizontal and vertical scrollbars
        Window decoratedWindow = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(new SimpleWindow()));
        // Draw
        decoratedWindow.draw();
        System.out.println("------------------------------");
        // Print the Window's description
        System.out.println(decoratedWindow.getDescription());

        // Decorator Coffee Demo
        System.out.println("------------------------------");
        // Create a decorated Coffee with milk and sprinkles
        Coffee decoratedCoffee = new SimpleCoffee();
        System.out.println(decoratedCoffee.printInfo());
        // Add milk
        decoratedCoffee = new WithMilk(decoratedCoffee);
        System.out.println(decoratedCoffee.printInfo());
        // Add sprinkles
        decoratedCoffee = new WithSprinkles(decoratedCoffee);
        System.out.println(decoratedCoffee.printInfo());
    }
}
