package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            // adding 1 Celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double averageTemperature() {
        double average = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            average += temperature.getValue();
        }

        return average/temperatures.getTemperatures().size();
    }

    public double medianTemperature() {
        double median = 0;
        List<Double> temperaturesList  =new ArrayList<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temperaturesList.add(temperature.getValue());
        }
        Collections.sort(temperaturesList);

        if(temperaturesList.size() % 2 == 0) {
            median = (temperaturesList.get((temperaturesList.size() / 2) - 1)
                    + temperaturesList.get((temperaturesList.size() / 2)) )
                    / 2;
        } else {
            median = temperaturesList.get((temperaturesList.size()/2));
        }
        return median;

    }
}
