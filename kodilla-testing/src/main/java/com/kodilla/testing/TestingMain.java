package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int addResult = calculator.add(2,2);
        int subtractResult = calculator.subtract(2,1);

        if (addResult == 4) {
            System.out.println("Metoda add() działa poprawnie");
        } else {
            System.out.println("Błąd metody add()");
        }

        if (subtractResult == 1) {
            System.out.println("Metoda subtract() działa poprawnie");
        } else {
            System.out.println("Błąd metody subtract()");
        }
    }
}
