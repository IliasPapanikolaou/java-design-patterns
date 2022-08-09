package com.unipi.ipap.javadesignpatterns.decorator.coffee;

// Decorator WithMilk mixes milk into coffee.
// Note it extends CoffeeDecorator.
public class WithMilk extends CoffeeDecorator {

    public WithMilk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Milk";
    }

    @Override
    public String printInfo() {
        return "Cost: " + this.getCost() + "; Ingredients: " + this.getIngredients();
    }
}
