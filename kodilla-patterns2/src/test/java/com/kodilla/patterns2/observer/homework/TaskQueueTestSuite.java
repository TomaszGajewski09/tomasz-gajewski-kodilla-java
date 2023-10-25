package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskQueueTestSuite {

    @Test
    void testUpdate() {
        //Given
        StudentTaskQueue student1 = new StudentTaskQueue("Student 1");
        StudentTaskQueue student2 = new StudentTaskQueue("Student 2");
        StudentTaskQueue student3 = new StudentTaskQueue("Student 3");
        StudentTaskQueue student4 = new StudentTaskQueue("Student 4");

        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");

        student1.registerObserver(mentor1);
        student2.registerObserver(mentor1);
        student3.registerObserver(mentor2);
        student4.registerObserver(mentor1);
        //When
        student1.addTask("<link to task 24.1>");
        student1.addTask("<link to task 24.2>");

        student2.addTask("<link to task 13.3>");

        student3.addTask("<link to task 10.4>");
        student3.addTask("<link to task 11.1>");

        student4.addTask("<link to task 20.2>");
        //Then
        assertEquals(4, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());
    }
}
