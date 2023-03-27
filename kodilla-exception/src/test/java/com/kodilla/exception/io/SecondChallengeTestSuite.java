package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void testProbablyIWillThrowException() throws Exception {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.5, 2)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.5, 2)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 2))
        );
        assertEquals("Done!", secondChallenge.probablyIWillThrowException(1, 2) );
    }
}
