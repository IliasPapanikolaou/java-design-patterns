package com.unipi.ipap.javadesignpatterns.proxy.image;

// On System A
public class RealImage implements Image {

    private final String filename;

    /**
     * Constructor
     * @param filename
     */
    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    /**
     * Loads the image from disk.
     */
    private void loadImageFromDisk() {
        System.out.println("Loading: " + filename);
    }

    /**
     * Displays the image.
     */
    @Override
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }
}
