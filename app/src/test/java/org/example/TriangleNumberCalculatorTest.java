package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleNumberCalculatorTest {
    TriangleNumberCalculator numberCalculator;
    @BeforeEach
    void setUp() {
        numberCalculator = new TriangleNumberCalculator();
    }

    @Test
    public void testTriangleNumberCalculatorWithOne() {
        assertEquals(numberCalculator.value(1), 1);
    }
    @Test
    public void testTriangleNumberCalculatorWithFive() {
        assertEquals(numberCalculator.value(5), 15);
    }



}
