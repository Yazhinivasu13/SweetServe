package com.thoughtworks.design_patterns.decorator_pattern;

public class Vanilla extends IceCream{

    public Vanilla(int scoops) {
        this.scoops = scoops;
    }

    @Override
    public String description() {
        return "You have chosen Vanilla with "+scoops+" scoops";
    }

    @Override
    public float cost(){
        return scoops * 50;
    }
}