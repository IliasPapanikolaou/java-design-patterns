package com.unipi.ipap.javadesignpatterns.proxy;

import com.unipi.ipap.javadesignpatterns.proxy.atm.Atm;
import com.unipi.ipap.javadesignpatterns.proxy.image.ProxyImageDemo;
import com.unipi.ipap.javadesignpatterns.proxy.object.ExpensiveObjectDemo;

public class ProxyApplication {

    public static void main(String[] args) {
        // Proxy Image
        System.out.println("------------------------------");
        ProxyImageDemo.proxyImageDemo();
        // Proxy Expensive Object
        System.out.println("------------------------------");
        ExpensiveObjectDemo.expensiveObjectDemo();
        // ATM
        System.out.println("------------------------------");
        Atm atm = new Atm();
        atm.withdraw(100.0);
    }
}
