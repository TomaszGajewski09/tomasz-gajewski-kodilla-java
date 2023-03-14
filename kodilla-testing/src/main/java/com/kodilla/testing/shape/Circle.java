package com.kodilla.testing.shape;

public class Circle implements Shape{
    private final String name = "circle";
    private int field;

    public Circle(int r){
        field = r*r;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public int getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (field != circle.field) return false;
        return name.equals(circle.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + field;
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", field=" + field +
                '}';
    }
}
