package com.kodilla.flightRouteSystem;

import java.util.List;

public class FlightRouteSystem {
    public static void main(String[] args) {
        FlightDatabase flightDatabase = new FlightDatabase();

        FlightSystem flightSystem = new FlightSystem(flightDatabase.getFlightsDatabase());

        System.out.println("Loty do");
        List<Flight> to = flightSystem.findFlightsTo("Warszawa");
        for (Flight flight : to) {
            System.out.println(flight);
        }


        System.out.println("\nLoty z");
        List<Flight> from = flightSystem.findFlightsFrom("Warszawa");
        for (Flight flight : from) {
            System.out.println(flight);
        }


        System.out.println("\nLoty poprzez");
        List<Flight> via = flightSystem.findFlightsVia("Warszawa", "Katowice");
        for (Flight flight : via) {
            System.out.println(flight);
        }
    }
}
