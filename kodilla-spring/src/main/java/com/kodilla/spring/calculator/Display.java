package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {

    public void displaValue(double val) {
        System.out.println(val);
    }
}
