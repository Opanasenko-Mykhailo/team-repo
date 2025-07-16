package com.team.calc.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalcServiceTest {
    private final CalcService calcService = new CalcService();

    @Test
    void testMultiplyPositiveNumbers2() {
        assertEquals(20, calcService.multiply(4, 5));
    }

    @Test
    void testMultiplyWithZero2() {
        assertEquals(0, calcService.multiply(7, 0));
        assertEquals(0, calcService.multiply(0, 7));
    }

    @Test
    void testMultiplyNegativeNumbers2() {
        assertEquals(15, calcService.multiply(-3, -5));
    }

    @Test
    void testMultiplyPositiveAndNegative2() {
        assertEquals(-12, calcService.multiply(3, -4));
    }

    @Test
    void testMultiplyWithNul2l() {
        assertThrows(NullPointerException.class, () -> calcService.multiply(null, 5));
        assertThrows(NullPointerException.class, () -> calcService.multiply(5, null));
    }

    @Test
    void testDivideWithValidNumber2() {
        double result = calcService.divide(10, 2);

        assertEquals(5.0, result);
    }

    @Test
    void testDivideWithNegativeNumbers2() {
        double result = calcService.divide(-10, 2);

        assertEquals(-5.0, result);
    }

    @Test
    void testDivideWithDecimalNumber2s() {
        double result = calcService.divide(7.5, 2.5);

        assertEquals(3.0, result);
    }

    @Test
    void testDivideByZeroThrowsExceptio2n() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calcService.divide(10, 0));

        assertEquals("Division by zero", exception.getMessage());
    }

    @Test
    void add2() {
        int actual = calcService.add(2,3);

        assertEquals(5, actual);
    }
}