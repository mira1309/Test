package com.calculate.calculateprogram.service;

import com.calculate.calculateprogram.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void greeting_success() {
        String expectedMessage = "Добро пожаловать в калькулятор!";

        String actualMessage = calculatorService.greeting();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void plus_success() {
        int num1 = 3;
        int num2 = 6;

        String expectedResult = TestUtils.formatResult(num1, num2, "+", String.valueOf(num1 + num2));

        String actualResult = calculatorService.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void plus_success2() {
        int num1 = 58;
        int num2 = 4;

        String expectedResult = TestUtils.formatResult(num1, num2, "+", String.valueOf(num1 + num2));

        String actualResult = calculatorService.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void minus_success()  {
        int num1 = 5;
        int num2 = 3;

        String expectedResult = TestUtils.formatResult(num1, num2, "-", String.valueOf(num1 - num2));

        String actualResult = calculatorService.minus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiply_success() {
        int num1 = 33;
        int num2 = 3;

        String expectedResult = TestUtils.formatResult(num1, num2, "*", String.valueOf(num1 * num2));

        String actualResult = calculatorService.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_success() {

        int num1 = 55;
        int num2 = 4;

        String expectedResult = TestUtils.formatResult(num1, num2, "/", String.valueOf((double) num1 / num2));

        String actualResult = calculatorService.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_withException() {
        int num1 = 45;
        int num2 = 0;

        String expectedMessage = "На ноль делить нельзя!";

        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculatorService.divide(num1, num2)
        );
        assertEquals(expectedMessage, exception.getMessage());
    }
}
