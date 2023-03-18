package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private final List<Continent> continents = new ArrayList<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }
    public BigDecimal getPeopleQuantity() {
        BigDecimal worldPopulation =  continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, countryQuantity) -> sum = sum.add(countryQuantity));

        return worldPopulation;
    }
}
