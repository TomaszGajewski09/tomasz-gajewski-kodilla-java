package com.kodilla.exception.test.flights;

import java.util.HashMap;
import java.util.Map;

public class FlightSchedule {
    private Map<String, Boolean> flights;

    public FlightSchedule() {
        flights = new HashMap<>();
        flights.put("Warsaw", true);
        flights.put("Cracow", false);
        flights.put("London", true);
        flights.put("Paris", true);
        flights.put("Amsterdam", false);
        flights.put("Barcelona", true);
    }


    public void findFlight(Flight flight) throws RouteNotFoundException {



        if(flight == null || !flights.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();

        } else {

            for (Map.Entry<String, Boolean> entry : flights.entrySet()) {

                if (entry.getKey().equals(flight.getArrivalAirport()) && entry.getValue()) {
                    System.out.println("Available flight to " + flight.getArrivalAirport() + " airport.");
                } else if (entry.getKey().equals(flight.getArrivalAirport()) && !entry.getValue()) {
                    System.out.println("It is not possible to fly to the airport in " + flight.getArrivalAirport());
                }
            }

        }
    }

}
