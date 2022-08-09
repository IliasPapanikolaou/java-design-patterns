package com.unipi.ipap.javadesignpatterns.decorator;

import com.unipi.ipap.javadesignpatterns.decorator.coffee.Coffee;
import com.unipi.ipap.javadesignpatterns.decorator.coffee.SimpleCoffee;
import com.unipi.ipap.javadesignpatterns.decorator.coffee.WithMilk;
import com.unipi.ipap.javadesignpatterns.decorator.coffee.WithSprinkles;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoffeeDecoratorTest {

    @Test
    public void testWindowDecorator() {
        Coffee coffee = new SimpleCoffee();
        assertEquals("Cost: 1.5; Ingredients: Coffee", coffee.printInfo());
        coffee = new WithMilk(coffee);
        assertEquals("Cost: 2.0; Ingredients: Coffee, Milk", coffee.printInfo());
        coffee = new WithSprinkles(coffee);
        assertEquals("Cost: 2.2; Ingredients: Coffee, Milk, Sprinkles", coffee.printInfo());
    }
}
