package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    private WeatherForecast weatherForecast;
    @Mock
    private Temperatures temperaturesMock;


    @BeforeEach
     public void setupMock() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow",  26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa",25.2);
        temperaturesMap.put("Gdansk",  26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        weatherForecast = new WeatherForecast(temperaturesMock);
    }
    @Test
        // [8]
    void testCalculateForecastWithMock() {
        //Given

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testAverageTemperature() {
        //Given
        //When
        double result = weatherForecast.averageTemperature();
        //Then

        Assertions.assertEquals(25.56, result, 0.001);
    }

    @Test
    void testMedianTemperatureWhenDataOdd() {
        //Given

        //When
        double result = weatherForecast.medianTemperature();
        //Then
        Assertions.assertEquals(25.5,result, 0.001);
    }

    @Test
    void testMedianTemperatureWhenDataEven() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow",  26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa",25.2);
        temperaturesMap.put("Gdansk",  26.1);
        temperaturesMap.put("Lodz",  26.8);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double result = weatherForecast.medianTemperature();
        //Then
        Assertions.assertEquals((25.5+26.1)/2,result , 0.001);
    }   // 24.8 25.2 25.5 26.1 26.2 26.8
}
