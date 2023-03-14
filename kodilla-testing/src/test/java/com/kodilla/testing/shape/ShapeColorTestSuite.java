package com.kodilla.testing.shape;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ShapeColorTestSuite {

    @DisplayName("Tests for Square class")
    @Nested
    class squareShapeTests{

        @Test
        void testGetShapeName() {
            //Given
            Square square = new Square(2);
            //When
            String result = square.getShapeName();
            //Then
            Assertions.assertEquals("square",result);
        }

        @Test
        void testGetField() {
            //Given
            Square square = new Square(2);
            //When
            double result = square.getField();
            //Then
            Assertions.assertEquals(4,result);
        }
    }
    @DisplayName("Tests for Triangle class")
    @Nested
    class triangleShapeTests{
        @Test
        void testGetShapeName() {
            //Given
            Triangle triangle = new Triangle(4,2);
            //When
            String result = triangle.getShapeName();
            //Then
            Assertions.assertEquals("triangle",result);
        }

        @Test
        void testGetField() {
            //Given
            Triangle triangle = new Triangle(4,2);
            //When
            double result = triangle.getField();
            //Then
            Assertions.assertEquals(4,result);
        }
    }
    @DisplayName("Tests for Circle class")
    @Nested
    class circleShapeTests{
        @Test
        void testGetShapeName() {
            //Given
            Circle circle = new Circle(2);
            //When
            String result = circle.getShapeName();
            //Then
            Assertions.assertEquals("circle",result);
        }

        @Test
        void testGetField() {
            //Given
            Circle circle = new Circle(2);
            //When
            double result = circle.getField();
            //Then
            Assertions.assertEquals(4,result);
        }
    }

    @DisplayName("Tests for ShapeCollector class")
    @Nested
    class testsShapeCollector{
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Square square = new Square(4);
            Circle circle = new Circle(3);
            Triangle triangle = new Triangle(2,4);
            //When
            collector.addFigure(square);
            collector.addFigure(circle);
            collector.addFigure(triangle);
            //Then
            Square expectedResult = new Square(4);
            Circle expectedResult2 = new Circle(3);
            Triangle expectedTriangle = new Triangle(2,4);
            Assertions.assertEquals(expectedResult,collector.getFigure(0));
            Assertions.assertEquals(expectedResult2,collector.getFigure(1));
            Assertions.assertEquals(expectedTriangle,collector.getFigure(2));

        }

        @Test
        void testRemoveFigureWhenEmpty() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            //When
            Circle circle = new Circle(2);
            boolean result = collector.removeFigure(circle);
            //Then
            Assertions.assertFalse(result);
        }

        @Test // zobacz czy dziala z innym takim samym obiektem
        void testRemoveFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Circle(2));
            //When
            boolean result = collector.removeFigure(new Circle(2));
            //Then
            Assertions.assertTrue(result);
        }

        @Test
        void testGetFigureWhenEmpty() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            //When
            Shape result = collector.getFigure(0);
            //Then
            Assertions.assertEquals(null, result);
        }

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Circle(2));
            //When
            Shape result = collector.getFigure(0);
            //Then
            Circle expectedResult = new Circle(2);
            Assertions.assertEquals(expectedResult, result);

        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Circle(2));
            collector.addFigure(new Square(4));
            collector.addFigure(new Triangle(2,4));
            //When
            String result = collector.showFigures();
            //Then
            String expectedResult = "circle square triangle ";
            Assertions.assertEquals(expectedResult, result);

        }
    }

}
