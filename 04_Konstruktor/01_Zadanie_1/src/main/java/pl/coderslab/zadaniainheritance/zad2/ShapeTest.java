package pl.coderslab.zadaniainheritance.zad2;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Shape(0,0,"red");
        Shape s2 = new Shape(3,4,"green");
        double distance = s1.getDistance(s2);
        System.out.println(distance);
    }
}
