package com.kodilla.testing.shape;

public class Square implements Shape{
    private final String name = "square";
    private int field;

    public Square(int a) {
        field = a*a;
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

        Square square = (Square) o;

        if (field != square.field) return false;
        return name.equals(square.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + field;
        return result;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", field=" + field +
                '}';
    }
}
