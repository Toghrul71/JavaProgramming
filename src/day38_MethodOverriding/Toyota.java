package day38_MethodOverriding;

public class Toyota extends Car {

    public Toyota(String brand, String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
        //instead just assign "Toyota"
    }

    @Override
    public void start() {
        super.start();
    }

    public void reliable(){  // Toyota class method
        System.out.println(brand+" "+model+" is reliable");
    }



}
