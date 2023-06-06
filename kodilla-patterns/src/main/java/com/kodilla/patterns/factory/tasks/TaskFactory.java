package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("ShoppingTask", "Pants", 2);
            case PAINTING -> new PaintingTask("PaintingTask", "rainbow", "flowers");
            case DRIVING -> new DrivingTask("DrivingTask", "Warsaw", "car");
            default -> null;
        };
    }
}
