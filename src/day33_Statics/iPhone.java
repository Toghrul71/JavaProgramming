package day33_Statics;

public class iPhone {
    public static String brand="Apple"; // it same so its static
    public String model;
    public double price;
    public static String OS="iOS";
    public String color;
    public String size;
    public static boolean hasBattery=true;
    public static boolean hasFaceTime=true;

    public static void printModelAndPrice(){ // static method does not accept instances
        System.out.println(brand);
    }
    public void  method1(){
        System.out.println(model+" : "+price); // instance method accept static and instances
        System.out.println(OS);
    }
}
