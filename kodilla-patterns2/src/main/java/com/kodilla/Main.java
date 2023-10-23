package com.kodilla;

import com.kodilla.patterns2.facade.ShopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.kodilla.patterns2.facade")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(ShopService.class, args);
    }
}