package com.unipi.ipap.javadesignpatterns.proxy.image;

// On System B
public class ProxyImage implements Image {

    private final String filename;
    private RealImage image;

    /**
     * Constructor
     */
    public ProxyImage(String filename) {
        this.filename = filename;
    }

    /**
     * Displays the image
     */
    @Override
    public void displayImage() {
        if (image == null) {
            image = new RealImage(this.filename);
        }
        image.displayImage();;
    }
}
