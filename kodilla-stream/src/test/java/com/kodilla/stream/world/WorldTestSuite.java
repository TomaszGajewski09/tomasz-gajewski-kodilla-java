package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {


    @Test
    void testGetPeopleQuantity() {
        //GIVEN
        World world = getWorld();

        //WHEN

        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //THEN
        assertEquals(new BigDecimal("3551832651"), peopleQuantity);
    }
    World getWorld() {
        World world = new World();
        // continents
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");

        // Europe
        Country poland = new Country("Poland", new BigDecimal("38386000"));
        Country germany = new Country("Germany", new BigDecimal("83020000"));
        Country spain = new Country("Spain", new BigDecimal("46733038"));
        Country france = new Country("France", new BigDecimal("66990000"));
        Country italy = new Country("Italy", new BigDecimal("60461826"));
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(spain);
        europe.addCountry(france);
        europe.addCountry(italy);

        // Asia
        Country china = new Country("China", new BigDecimal("1403500365"));
        Country india = new Country("India", new BigDecimal("1366417756"));
        Country japan = new Country("Japan", new BigDecimal("126150000"));
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(japan);

        // Africa
        Country egypt = new Country("Egypt", new BigDecimal("100651797"));
        Country nigeria = new Country("Nigeria", new BigDecimal("200963599"));
        Country southAfrica = new Country("South Africa", new BigDecimal("58558270"));
        africa.addCountry(egypt);
        africa.addCountry(nigeria);
        africa.addCountry(southAfrica);

        // adding continents to world
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        return world;
    }
}
