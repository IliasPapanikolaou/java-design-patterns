package com.unipi.ipap.javadesignpatterns.decorator.coffee;

// Decorator WithSprinkles mixes sprinkles onto coffee.
// Note it extends CoffeeDecorator.
public class WithSprinkles extends CoffeeDecorator {

    public WithSprinkles(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.2;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Sprinkles";
    }

    @Override
    public String printInfo() {
        return "Cost: " + this.getCost() + "; Ingredients: " + this.getIngredients();
    }
}
