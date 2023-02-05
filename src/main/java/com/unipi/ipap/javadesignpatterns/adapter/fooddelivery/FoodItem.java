package com.unipi.ipap.javadesignpatterns.adapter.fooddelivery;

public class FoodItem implements Item {

    private final String name;
    private final double price;
    private final String restaurantName;

    public FoodItem(String name, double price, String restaurantName) {
        this.name = name;
        this.price = price;
        this.restaurantName = restaurantName;
    }

    @Override
    public String getItemName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getRestaurantName() {
        return this.restaurantName;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", restaurantName='" + restaurantName + '\'' +
                '}';
    }
}
