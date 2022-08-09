package com.unipi.ipap.javadesignpatterns.decorator.coffee;

public class SimpleCoffee implements Coffee {

    @Override
    public double getCost() {
        return 1.5;
    }

    @Override
    public String getIngredients() {
        return "Coffee";
    }

    @Override
    public String printInfo() {
        return "Cost: " + this.getCost() + "; Ingredients: " + this.getIngredients();
    }
}
