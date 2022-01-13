package January2Tasks;

public class Circle {
    public double radius;
    public double diameter;
    public static double pi=3.14;
    public static String schoolName;

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = radius*2;

    }

    public double calcArea(){
        double area=pi*radius*radius;
        return area;

    }
    public double calcPerimeter(){ // custom method
        double perimeter=2*pi*radius;
        return perimeter;
    }
    public void printPi(double pi){
        System.out.println("PI value of circle is: "+pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + calcArea()+
                ", perimeter=" + calcPerimeter()+
                ", PI=" + pi+
                '}';
    }
}


/*
public double calcCost(){
        double totalPrice= (isPersian)? (width*length*unitPrice)+200 : width*length*unitPrice;
        return totalPrice;
    }
 */