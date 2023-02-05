package com.unipi.ipap.javadesignpatterns;

import com.unipi.ipap.javadesignpatterns.adapter.carspeed.BugattiVeyron;
import com.unipi.ipap.javadesignpatterns.adapter.carspeed.Movable;
import com.unipi.ipap.javadesignpatterns.adapter.carspeed.MovableAdapter;
import com.unipi.ipap.javadesignpatterns.adapter.carspeed.MovableAdapterImpl;
import com.unipi.ipap.javadesignpatterns.adapter.phoneport.AndroidPhone;
import com.unipi.ipap.javadesignpatterns.adapter.phoneport.Iphone;
import com.unipi.ipap.javadesignpatterns.adapter.phoneport.ChargePhone;
import com.unipi.ipap.javadesignpatterns.adapter.phoneport.LightningToMicroUsbAdapter;
import com.unipi.ipap.javadesignpatterns.decorator.coffee.Coffee;
import com.unipi.ipap.javadesignpatterns.decorator.coffee.SimpleCoffee;
import com.unipi.ipap.javadesignpatterns.decorator.coffee.WithMilk;
import com.unipi.ipap.javadesignpatterns.decorator.coffee.WithSprinkles;
import com.unipi.ipap.javadesignpatterns.decorator.window.HorizontalScrollBarDecorator;
import com.unipi.ipap.javadesignpatterns.decorator.window.SimpleWindow;
import com.unipi.ipap.javadesignpatterns.decorator.window.VerticalScrollBarDecorator;
import com.unipi.ipap.javadesignpatterns.decorator.window.Window;
import com.unipi.ipap.javadesignpatterns.observer.genericobserver.EnableObserver;
import com.unipi.ipap.javadesignpatterns.proxy.image.ProxyImageDemo;
import com.unipi.ipap.javadesignpatterns.proxy.object.ExpensiveObjectDemo;

public class Application {

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

        // Proxy Image
        System.out.println("------------------------------");
        ProxyImageDemo.proxyImageDemo();
        // Proxy Expensive Object
        System.out.println("------------------------------");
        ExpensiveObjectDemo.expensiveObjectDemo();

        // Adapter Car Speed
        System.out.println("\n----Observer Design Pattern----");
        EnableObserver.start();
    }
}
