package com.team.calc.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcServiceTest {

    private final CalcService service = new CalcService();

    @ParameterizedTest
    @CsvSource({
            "10, 5, 5",
            "0, 0, 0",
            "-3, -2, -1",
            "7, 10, -3",
            "100, 25, 75"
    })
    void testSubtract(Integer a, Integer b, Integer expected) {
        Integer actual = service.subtract(a, b);
        assertEquals(expected, actual, () -> a + " - " + b + " should equal " + expected);
    }
}