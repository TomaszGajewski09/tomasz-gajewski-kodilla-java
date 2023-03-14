package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private final String name = "triangle";
    private int field;

    public Triangle(int a, int h) {
        field = (a*h)/2;
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

        Triangle triangle = (Triangle) o;

        if (field != triangle.field) return false;
        return name.equals(triangle.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + field;
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                ", field=" + field +
                '}';
    }
}
