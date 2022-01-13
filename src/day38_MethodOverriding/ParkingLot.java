package day38_MethodOverriding;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota=new Toyota("Corolla", "Corolla", 2020, 20250,"Gray",123);
        Tesla tesla=new Tesla("Tesla","Model S", 2022, 54000, "White", 125);
        BMW bmw=new BMW("BMW", "330",2021,35000,"White",150);
        System.out.println(tesla);

        toyota.start();
    }
}
