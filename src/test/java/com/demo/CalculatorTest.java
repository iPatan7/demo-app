package com.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @ParameterizedTest
    @CsvSource({"1, 2, 3", "-4, 4, 0", "100, 250, 350"})
    void addsTwoNumbers(int a, int b, int expected) {
        assertEquals(expected, calc.add(a, b));
    }

    @Test
    void subtracts() {
        assertEquals(-18, calc.subtract(12, 30));
    }

    @Test
    void multiplies() {
        assertEquals(360, calc.multiply(12, 30));
    }

    @Test
    void divides() {
        assertEquals(4, calc.divide(9, 2));
    }

    @Test
    void refusesDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(1, 0));
    }
}
