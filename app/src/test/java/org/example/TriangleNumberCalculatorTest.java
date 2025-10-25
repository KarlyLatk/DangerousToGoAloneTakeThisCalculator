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

    @Test
    public void testTriangleNumberCalculatorWithNegative() {
        assertEquals(numberCalculator.value(-1), 0);
    }

    @Test
    public void testTriangleNumberCalculatorWithZero() {
        assertEquals(numberCalculator.value(0), 0);
    }
    @Test
    public void testTriangleNumberCalculatorWithAddition() {
        assertEquals(numberCalculator.add(2, 3), 9);
    }
    @Test
    public void testTriangleNumberCalculatorWithSubtraction() {
        assertEquals(numberCalculator.subtract(5, 2), 12);
    }
    @Test
    public void testTriangleNumberCalculatorWithMultiplication() {
        assertEquals(numberCalculator.multiply(2, 3), 18);
    }
    @Test
    public void testTriangleNumberCalculatorWithDivision() {
        assertEquals(numberCalculator.divide(3, 2), 2);
    }
    @Test
    public void testTriangleNumberCalculatorSequence() {
        assertEquals(numberCalculator.sequence(3), "1, 3, 6");
    }

}
