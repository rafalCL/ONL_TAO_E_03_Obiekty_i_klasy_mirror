package pl.coderslab.zadaniainheritance.zad2;

public class Shape {
    private double x;
    private double y;
    private String color;

    public Shape(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String getDescription(){
        return "Shape: x="+this.x+", y="+this.y+", color="+this.color;
    }

    public double getDistance(Shape other) {
        double dx = other.x - this.x;
        double dy = other.y - this.y;
        double dx2 = dx*dx;
        double dy2 = dy*dy;

        return Math.pow(dx2+dy2, .5);
    }
}
