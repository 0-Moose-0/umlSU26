package com.leszko.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void sumsPositiveNumbers() {
        assertEquals(6, calculator.sum(2, 3));
    }

    @Test
    public void sumsWithZero() {
        assertEquals(7, calculator.sum(7, 0));
    }

    @Test
    public void sumsNegativeNumbers() {
        assertEquals(-5, calculator.sum(-2, -3));
    }
}