package com.thoughtworks.design_patterns.decorator_pattern;

public class Strawberry extends IceCream{

    public Strawberry(int scoops) {
        this.scoops = scoops;
    }

    @Override
    public String description() {
        return "You have chosen Strawberry with "+scoops+" scoops";
    }

    @Override
    public float cost(){
        return scoops * 100;
    }
}