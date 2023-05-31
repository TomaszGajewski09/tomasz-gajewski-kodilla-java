package com.kodilla.flightRouteSystem;

import java.util.ArrayList;
import java.util.List;

public class FlightDatabase {

    List<Flight> flights;

    public FlightDatabase() {
        flights = new ArrayList<>();
        flights.add(new Flight("Warszawa", "Kraków"));
        flights.add(new Flight("Warszawa", "Wrocław"));
        flights.add(new Flight("Warszawa", "Gdańsk"));
        flights.add(new Flight("Wrocław", "Kraków"));
        flights.add(new Flight("Kraków", "Gdańsk"));
        flights.add(new Flight("Gdańsk", "Warszawa"));
        flights.add(new Flight("Gdańsk", "Kraków"));
        flights.add(new Flight("Kraków", "Wrocław"));
        flights.add(new Flight("Gdańsk", "Katowice"));
    }

    public List<Flight> getFlightsDatabase() {
        return flights;
    }
}
