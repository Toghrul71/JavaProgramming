package day38_MethodOverriding;

public class Tesla extends Car{
    public Tesla(String brand, String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }
    public void autoPilot(){
        System.out.println(brand+" "+model+" has autopilot");
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start");
    }
}
