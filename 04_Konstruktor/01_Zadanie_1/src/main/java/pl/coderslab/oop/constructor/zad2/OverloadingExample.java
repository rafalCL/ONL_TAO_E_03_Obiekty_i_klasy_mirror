package pl.coderslab.oop.constructor.zad2;

public class OverloadingExample {
    public static void main(String[] args) {
        printMyValue(42);
        printMyValue("some String");
    }

    public static void printMyValue(String myValue) {
        System.out.println("Called printMyValue for String: " + myValue);
    }

    public static void printMyValue(int myValue) {
        System.out.println("Called printMyValue for int: " + myValue);
    }
}
