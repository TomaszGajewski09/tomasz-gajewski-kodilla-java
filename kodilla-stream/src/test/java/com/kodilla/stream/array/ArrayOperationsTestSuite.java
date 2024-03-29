package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGerAverage() {
        //Given
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(5.5, result);
    }
}
