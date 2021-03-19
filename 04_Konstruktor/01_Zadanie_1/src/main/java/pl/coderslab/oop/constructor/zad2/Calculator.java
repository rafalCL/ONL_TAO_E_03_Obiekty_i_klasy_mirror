package pl.coderslab.oop.constructor.zad2;

// Stwórz klasę ```Calculator```. Konstruktor ma nie przyjmować żadnych danych.
//Każdy nowo stworzony obiekt powinien mieć tablicę String, w której będzie trzymać historię ostatnich operacji
//(stwórz ją w konstruktorze – z początkowym rozmiarem 0).
//Następnie dodaj do klasy następujące metody:
//
//1. ```add(num1, num2)``` – metoda ma dodać do siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "added ```num1``` to ```num2``` got ```result```".
//2. ```multiply(num1, num2)``` – metoda ma pomnożyć przez siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "multiplied ```num1``` with ```num2``` got ```result```".
//3. ```subtract(num1, num2)``` – metoda ma odjąć od siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "subtracted ```num1``` from ```num2``` got ```result```".
//4. ```divide(num1, num2)``` – metoda ma podzielić przez siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "divided ```num1``` by ```num2``` got ```result```". Pamiętaj, że nie można dzielić przez zero.
//5. ```printOperations()``` – metoda ma wypisać wszystkie zapamiętane operacje.
//6. ```clearOperations()``` – metoda ma wyczyścić wszystkie zapamiętane operacje.
//
//Możesz dopisać metodę pomocniczą, która będzie dodawała wpis na liście operacji oraz zwiększała rozmiar tablicy przez kopiowanie.
//
//Pamiętaj o używaniu ```this``` w odpowiednich miejscach.
//Stwórz kilka kalkulatorów i przetestuj ich działanie.

import java.util.Arrays;

public class Calculator {
    private String[] history = new String[0];

    public double add(double num1, double num2){
        double result = num1 + num2;
        String text = String.format("added %s to %s got %s.", num1, num2, result);

        addToHistory(text);

        return result;
    }

    public double subtract(double num1, double num2){
        double result = num1 - num2;
        String text = String.format("subtracted %s from %s got %s.", num2, num1, result);

        addToHistory(text);

        return result;
    }

    protected void addToHistory(String newEntry){
        this.history = Arrays.copyOf(this.history, this.history.length+1);
        this.history[this.history.length-1] = newEntry;
    }

    public void printHistory(){
        for (int i=0; i<this.history.length; i++){
            System.out.println(this.history[i]);
        }
    }
}
