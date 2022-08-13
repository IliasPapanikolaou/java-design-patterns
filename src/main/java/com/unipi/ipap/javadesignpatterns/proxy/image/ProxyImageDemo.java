package com.unipi.ipap.javadesignpatterns.proxy.image;

public class ProxyImageDemo {

    /**
     * Test method
     */
    public static void proxyImageDemo() {
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");

        image1.displayImage(); // Loading necessary
        image1.displayImage(); // Loading unnecessary
        image2.displayImage(); // Loading necessary
        image2.displayImage(); // Loading unnecessary
        image1.displayImage(); // Loading unnecessary
    }
}
