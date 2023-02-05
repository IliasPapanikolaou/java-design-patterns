package com.unipi.ipap.javadesignpatterns.adapter.fooddelivery;

public class GroceryItemAdapter implements Item {

    private final GroceryItem groceryItem;

    public GroceryItemAdapter(GroceryItem groceryItem) {
        this.groceryItem = groceryItem;
    }

    @Override
    public String getItemName() {
        return groceryItem.getName();
    }

    @Override
    public double getPrice() {
        return groceryItem.getPrice();
    }

    @Override
    public String getRestaurantName() {
        return groceryItem.getStoreName();
    }

    @Override
    public String toString() {
        return "GroceryItemAdapter{" +
                "groceryItem=" + groceryItem +
                '}';
    }
}
