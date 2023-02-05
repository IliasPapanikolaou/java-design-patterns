package com.unipi.ipap.javadesignpatterns.factory;

import com.unipi.ipap.javadesignpatterns.factory.abstractfactory.Application;
import com.unipi.ipap.javadesignpatterns.factory.abstractfactory.uifactory.MacUIFactory;
import com.unipi.ipap.javadesignpatterns.factory.abstractfactory.uifactory.WinUIFactory;
import com.unipi.ipap.javadesignpatterns.factory.factory.OperatingSystem;
import com.unipi.ipap.javadesignpatterns.factory.factory.OperatingSystemFactory;

public class FactoryApplication {
    public static void main(String[] args) {

        System.out.println("\n----- Windows ------");
        OperatingSystem os1 = OperatingSystemFactory.getInstance("WINDOWS", "10", "x64");
        os1.changeDir("C:\\Programs\\Java");
        os1.removeDir("C:\\Programs\\temp");

        System.out.println("\n----- Linux ------");
        OperatingSystem os2 = OperatingSystemFactory.getInstance("LINUX", "20.04 LTS", "x64");
        os2.changeDir("C:\\Programs\\Java");
        os2.removeDir("C:\\Programs\\temp");

        // Abstract Factory
        // Windows Application
        System.out.println("\n----- Windows Application------");
        Application application1 = new Application(new WinUIFactory());
        application1.paint();

        // Mac Application
        System.out.println("\n----- Mac Application ------");
        Application application2 = new Application(new MacUIFactory());
        application2.paint();
    }

}
