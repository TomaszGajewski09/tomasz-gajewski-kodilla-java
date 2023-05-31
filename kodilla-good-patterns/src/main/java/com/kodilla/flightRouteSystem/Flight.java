package com.kodilla.flightRouteSystem;

public class Flight {
    private String departureCity, destinationCity;

    public Flight(String departureCity, String destinationCity) {
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!departureCity.equals(flight.departureCity)) return false;
        return destinationCity.equals(flight.destinationCity);
    }

    @Override
    public int hashCode() {
        int result = departureCity.hashCode();
        result = 31 * result + destinationCity.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Lot z: " + departureCity + ", do: '" + destinationCity;
    }
}
