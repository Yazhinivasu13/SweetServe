package com.thoughtworks.design_patterns.decorator_pattern;

public class ChocolateChip extends Topping{
    IceCream iceCream;

    public ChocolateChip(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public float cost() {
        return 10+iceCream.cost();
    }

    @Override
    public String description() {
        return iceCream.description()+", Choco chip";
    }
}
