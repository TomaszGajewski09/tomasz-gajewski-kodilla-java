package com.kodilla.patterns2.observer.homework;



public class Mentor implements Observer {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(StudentTaskQueue studentTaskQueue) {
        System.out.println(name + ": New task to check from: " + studentTaskQueue.getName() + "\n" +
                " (total: " + studentTaskQueue.getTasks().size() + " tasks)");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
