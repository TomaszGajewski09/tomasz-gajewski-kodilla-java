package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;
    @Test
    void testCalculations() {
        //Given
        double a = 9;
        double b = 3;

        //When
        double resultAdd = calculator.add(a, b);
        double resultSub = calculator.sub(a, b);
        double resultMul = calculator.mul(a, b);
        double resultDiv = calculator.div(a, b);
        //Then

        assertEquals(12.0, resultAdd);
        assertEquals(6.0, resultSub);
        assertEquals(27.0, resultMul);
        assertEquals(3.0, resultDiv);
    }
}
