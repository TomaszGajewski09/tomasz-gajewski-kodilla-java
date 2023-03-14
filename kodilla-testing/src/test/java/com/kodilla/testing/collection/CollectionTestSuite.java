package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    void before() {
        System.out.println("OddNumbersExterminator class test - start");
    }

    @AfterEach
    void after() {
        System.out.println("OddNumbersExterminator class test - end");
    }
    @DisplayName("When creat OddNumbersExterminator " +
            "and use method exterminate() with empty list as an argument" +
            "should return empty list")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> list = new ArrayList<>();
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(list);
        //Then
        List<Integer> expectedResult = new ArrayList<>();
        Assertions.assertEquals(expectedResult, result);

    }

    @DisplayName("When create OddNumbersExterminator " +
            "and use method exterminate() with numbers list as an argument " +
            "should return even numbers list")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(list);
        //Then
        List<Integer> expectedResult = new ArrayList<>(Arrays.asList(2,4,6,8,10));
        Assertions.assertEquals(expectedResult,result);

    }
}
