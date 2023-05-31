package com.kodilla.flightRouteSystem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSystem {
    private List<Flight> flights;

    public FlightSystem(List<Flight> flights) {
        this.flights = flights;
    }

    public void addFlight(String departureCity, String destinationCity) {
        Flight flight = new Flight(departureCity, destinationCity);
        flights.add(flight);
    }

    public List<Flight> findFlightsFrom(String wantedCity) {
        return flights.stream()
                .filter(flight -> flight.getDepartureCity().equals(wantedCity))
                .collect(Collectors.toList());
    }
    public List<Flight> findFlightsTo(String wantedCity) {
        return flights.stream()
                .filter(flight -> flight.getDestinationCity().equals(wantedCity))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsVia(String from, String to) {
        return flights.stream()
                .filter(flight -> flight.getDepartureCity().equals(from))
                .flatMap(flight -> flights.stream()
                        .filter(connectingFlight -> connectingFlight.getDepartureCity().equals(flight.getDestinationCity())
                                && connectingFlight.getDestinationCity().equals(to))
                        .map(connectingFlight -> Arrays.asList(flight, connectingFlight)))
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

}
