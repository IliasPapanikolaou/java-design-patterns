package com.unipi.ipap.javadesignpatterns.proxy.object;

public class ExpensiveObjectDemo {

    /**
     * Test method
     */
    public static void expensiveObjectDemo() {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process(); // necessary initial configuration
        object.process(); // unnecessary initial configuration
    }
}
