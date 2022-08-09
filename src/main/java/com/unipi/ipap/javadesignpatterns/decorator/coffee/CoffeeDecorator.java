package com.unipi.ipap.javadesignpatterns.decorator.coffee;

// Abstract decorator class - note that it implements Coffee interface
public abstract class CoffeeDecorator implements Coffee {

    private final Coffee decoratedCoffee;

    CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    // Implementing methods of the interface

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }

    @Override
    public String getIngredients() {
        return decoratedCoffee.getIngredients();
    }

    @Override
    public String printInfo() {
        return this.decoratedCoffee.printInfo();
    }
}
