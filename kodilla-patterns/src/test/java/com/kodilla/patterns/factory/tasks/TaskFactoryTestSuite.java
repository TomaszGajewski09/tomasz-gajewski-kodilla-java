package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.Shape;
import com.kodilla.patterns.factory.ShapeFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        shoppingTask.executeTask();
        //Then
        assertEquals(true,shoppingTask.isTaskExecuted());
        assertEquals("ShoppingTask", shoppingTask.getTaskName());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);
        paintingTask.executeTask();
        //Then
        assertEquals(true, paintingTask.isTaskExecuted());
        assertEquals("PaintingTask", paintingTask.getTaskName());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        //Then
        assertEquals(false,drivingTask.isTaskExecuted());
        assertEquals("DrivingTask", drivingTask.getTaskName());
    }
}
