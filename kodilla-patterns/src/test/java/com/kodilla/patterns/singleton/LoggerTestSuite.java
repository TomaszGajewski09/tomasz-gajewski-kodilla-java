package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    void getLastLog() {
        //Given
        Logger logger = Logger.INSTANCE;

        //When
        logger.log("3log12");
        String result = logger.getLastLog();

        //Then
        assertEquals("3log12", result);
    }
}
