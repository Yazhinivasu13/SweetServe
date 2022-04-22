package com.thoughtworks.design_patterns.decorator_pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IceCreamTest {
    @Test
    void shouldReturnTheCostBasedOnTheFlavourAndTheNoOfScoopsChosenByTheCustomer() {
        IceCream iceCream = new Chocolate(2);
        assertEquals("You have chosen Chocolate with 2 scoops", iceCream.description());
        assertEquals(150.0, iceCream.cost());
    }
    @Test
    void shouldReturnTheCostBasedOnTheFlavourAndTheNoOfScoopsWithToppingsChosenByTheCustomer() {
        IceCream iceCream = new Vanilla(3);
        iceCream = new ChocolateChip(iceCream);
        iceCream = new Oreo(iceCream);


        assertEquals("You have chosen Vanilla with 3 scoops, Choco chip, Oreo", iceCream.description());
        assertEquals(175.0, iceCream.cost());
    }
}