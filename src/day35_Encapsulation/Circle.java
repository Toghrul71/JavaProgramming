package day35_Encapsulation;

public class Circle {
    private double radius;
    public static double pi=3.14;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calcArea(){
        return radius*radius*pi;
    }
    public double calcPerimeter(){
        return 2*pi*radius;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + calcArea() +
                "perimeter=" + calcPerimeter() +
                '}';
    }
}
