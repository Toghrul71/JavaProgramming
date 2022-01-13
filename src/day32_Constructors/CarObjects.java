package day32_Constructors;

public class CarObjects {
    public static void main(String[] args) {

        Car car1=new Car("Toyota");
        Car car2=new Car("Honda", "Accord");
        Car car3=new Car("Lexus","RX350",2021);
        Car car4=new Car("BMW","340",2021,54000);
        Car car5=new Car("Tesla", "S", 2019, 630000,"white");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

    }
}
