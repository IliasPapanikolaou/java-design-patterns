package com.unipi.ipap.javadesignpatterns.proxy;

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
    }
}
