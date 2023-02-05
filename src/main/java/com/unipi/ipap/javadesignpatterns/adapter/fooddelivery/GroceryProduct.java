package com.unipi.ipap.javadesignpatterns.adapter.fooddelivery;

public class GroceryProduct implements GroceryItem {

    private final String name;
    private final double price;
    private final String storeName;

    public GroceryProduct(String name, double price, String storeName) {
        this.name = name;
        this.price = price;
        this.storeName = storeName;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getStoreName() {
        return this.storeName;
    }

    @Override
    public String toString() {
        return "GroceryProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", storeName='" + storeName + '\'' +
                '}';
    }
}
