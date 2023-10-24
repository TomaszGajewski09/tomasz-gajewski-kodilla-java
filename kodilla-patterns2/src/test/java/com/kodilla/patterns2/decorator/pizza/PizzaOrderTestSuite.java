package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.decorator.pizza.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    void testPizzaWithExtraCheeseAndVegetables() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new AdditionalMushroomsDecorator(theOrder);
        theOrder = new AdditionalOnionDecorator(theOrder);
        //When
        BigDecimal cost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(23), cost);
        assertEquals("Ordered pizza with: tomato sauce, mozzarella cheese, extra cheese, mushrooms, onion", description);
    }

    @Test
    void testPizzaWithAdditionalMeatAndNachosAndExtraCheese() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AdditionalChorizoDecorator(theOrder);
        theOrder = new AdditionalHamDecorator(theOrder);
        theOrder = new AdditionalNachosDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        BigDecimal cost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(30), cost);
        assertEquals("Ordered pizza with: tomato sauce, mozzarella cheese, chorizo, ham, nachos, extra cheese", description);
    }

    @Test
    void testPizzaHawaii() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AdditionalPineappleDecorator(theOrder);
        theOrder = new AdditionalHamDecorator(theOrder);
        //When
        BigDecimal cost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(21), cost);
        assertEquals("Ordered pizza with: tomato sauce, mozzarella cheese, pineapple, ham", description);
    }


}
