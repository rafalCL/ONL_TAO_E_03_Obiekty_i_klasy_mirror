package pl.coderslab.zadaniainheritance.zad1;

public class AdvancedCalculatorTest {
    public static void main(String[] args) {
        AdvancedCalculator ac1 = new AdvancedCalculator();
        ac1.add(4,7);
        ac1.pow(2,4);
        ac1.root(27,3);
        ac1.root(4,2);
        ac1.printHistory();
    }
}
