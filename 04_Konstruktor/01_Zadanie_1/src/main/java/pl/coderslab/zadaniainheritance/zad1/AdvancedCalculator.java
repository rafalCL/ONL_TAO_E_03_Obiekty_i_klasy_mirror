package pl.coderslab.zadaniainheritance.zad1;

// Stwórz klasę AdvancedCalculator, która dziedziczy po klasie Calculator. Klasa powinna implementować następujące metody:
//
//pow(num1, num2) – metoda ma zwracać num1 do potęgi num2. Dodatkowo w tablicy operacji ma zapamiętać napis: "num1^num2 equals result".
//root(num1, num2) – metoda ma wyliczyć pierwiastek num2 stopnia z num1. Dodatkowo w tablicy operacji ma zapamiętać napis: "num2 root of num1 equals result".

import pl.coderslab.oop.constructor.zad2.Calculator;

public class AdvancedCalculator extends Calculator {
    public double pow(double num1, double num2){
        double result = Math.pow(num1, num2);
        String text = String.format("%s ^ %s equals %s.", num1, num2, result);

        addToHistory(text);

        return result;
    }

    public double root(double num1, double num2){
        double result = Math.pow(num1, 1.0/num2);
        String text = String.format("%s root of %s equals %s", num2, num1, result);

        addToHistory(text);

        return result;
    }
}
