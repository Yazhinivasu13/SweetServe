package com.thoughtworks.design_patterns.decorator_pattern;

public class Oreo extends Topping{
    IceCream iceCream;

    public Oreo(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public float cost() {
        return 15 + iceCream.cost();
    }

    @Override
    public String description() {
        return iceCream.description() + ", Oreo";
    }
}
